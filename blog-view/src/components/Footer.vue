<!--底部照片-->
<template>
  <!--网站底部-->
  <div class="footer">


    <el-row :gutter="24" style="padding-top: 30px">
      <el-col :sm="8">
        <el-row :gutter="24" class="footer-title">
          <el-col :span="6" :offset="6">联系博主</el-col>
        </el-row>
        <el-row :gutter="24" class="footer-content">
          <el-col :sm="10" :offset="4">
            微信：18938886756
            QQ：237128845<br>
            邮箱：237128845@qq.com
          </el-col>
          <el-col :sm="10">
            <el-image :src="src" style="width: 80px; height: 80px"></el-image>
          </el-col>
        </el-row>
      </el-col>



      <el-col :sm="8">
        <el-row :gutter="24" class="footer-title">
          <el-col :span="24">签名</el-col>
        </el-row>
        <el-row :gutter="24" class="footer-content">
          <el-col :span="24" style="font-size: 15px">
            喜欢就去做，做了就不要后悔
          </el-col>
        </el-row>
      </el-col>
      <el-col :sm="8">
        <el-row :gutter="24" class="footer-title">
          <el-col :span="24">网站信息</el-col>
        </el-row>
        <el-row :gutter="24" class="footer-content">
          <el-col :span="24">
            {{'总访问量: '+pv}} <br>
            {{'访客量: '+uv}}
          </el-col>
        </el-row>
      </el-col>

    </el-row>
    <el-divider ></el-divider>

    <el-row :gutter="24" style="height: 50px;margin-top: 25px;font-size: 12px">
      <el-col :span="24">
        <a href="https://beian.miit.gov.cn" style="color: yellow">粤ICP备2022027105号-1</a>
      </el-col>
    </el-row>

  </div>
</template>

<script>
export default {
  name: "Footer",
  data() {
    return {
      pv: 0,
      uv: 0,
      input: "",
      src: 'http://106.14.207.137/img/footer.jpg',

    }
  },
  methods:{
    //获取pv和uv
    getPVAndUV(){
      const _this = this
      this.$axios.get('/visitornum').then(res => {
        _this.uv = res.data.data.uv
        _this.pv = res.data.data.pv
      })

    }
  },
  // 监听,当路由发生变化的时候执行
  watch: {
    '$route':'getPVAndUV'
  },
  created() {
    this.getPVAndUV()
  }
}
</script>

<style scoped>
.footer-title {
  font-size: 13px;
  font-weight: bold;
  margin-bottom: 5px;
}

.footer-content {
  font-size: 13px;
}

.footer {
  margin: 0 auto;
  text-align: center;
  min-height: 20px;
  max-width: 100%;
  padding: 0 15px;
}
</style>