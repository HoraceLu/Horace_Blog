<template>
  <div class="card">
    <!--展示名片头部--头像名称-->
    <div class="card-header">
      <el-avatar :size="50" :src="user.avatar"></el-avatar>
      <p style="margin-top: 0px;">Horace_Lu</p>
      <el-divider></el-divider>
    </div>

    <!--卡片中部--github图片的地址-->
    <div class="card-middle">
      <div style="max-width: 40px;margin-left: 40px">
        <el-image :fit="fit"
                  src="http://106.14.207.137/img/github.jpg"
                  style="cursor:pointer" @click="goToGithub"></el-image>
      </div>
    </div>
    <!--卡片底部--个人喜好-->
    <div class="card-footer">
      <el-collapse>
        <el-collapse-item name="1" style="padding-left: 20px;padding-right: 20px" title="最喜欢的电影">
          <div>当幸福来敲门、我是传奇、阿甘正传、忠犬八公的故事</div>
        </el-collapse-item>
        <el-collapse-item name="2" style="padding-left: 20px;padding-right: 20px" title="最喜欢的歌手">
          <div>陈奕迅、周杰伦、林俊杰、林宥嘉、五月天、夏日入侵企画</div>
        </el-collapse-item>
        <el-collapse-item name="3" style="padding-left: 20px;padding-right: 20px" title="最喜欢的游戏">
          <div>守望先锋、GTA5、骑马与砍杀、绝地求生</div>
        </el-collapse-item>
        <el-collapse-item name="4" style="padding-left: 20px;padding-right: 20px" title="最喜欢的运动">
          <div>足球、羽毛球、篮球</div>
        </el-collapse-item>
      </el-collapse>
    </div>
  </div>
</template>

<script>
export default {
  name: "Card",
  data() {
    return {
      hasLogin: false,
      fit: 'fill',
      user: {
        avatar: "http://106.14.207.137/img/me.jpg"
      },
    }
  },
  methods: {
    //跳转到个人github
    goToGithub() {
      window.location.href = "https://github.com/HoraceLu"
    }
  },
  created() {
  }
}
</script>

<style scoped>
.card {
  width: 250px;
  padding: 20px 0px 0px 0px;
  background-color: white;
}
.card-header {
  text-align: center;
}
.card-footer {
  margin-top: 10px;
}
.card:hover {
  -webkit-box-shadow: #ccc 0px 10px 10px;
  -moz-box-shadow: #ccc 0px 10px 10px;
  box-shadow: #ccc 0px 10px 10px;
}
</style>