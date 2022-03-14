package com.danli.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.danli.common.lang.vo.BlogInfo;
import com.danli.entity.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author luzhiwei
 * @date 2021/12/12
 */
@Mapper
@Repository
public interface BlogMapper extends BaseMapper<Blog> {
    /**
     * 根据分类查询博客
     */
    List<BlogInfo> getBlogByTypeName(String typeName);

}
