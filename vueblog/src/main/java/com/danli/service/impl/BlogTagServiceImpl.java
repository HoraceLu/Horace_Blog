package com.danli.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.danli.entity.BlogTag;
import com.danli.mapper.BlogTagMapper;
import com.danli.service.BlogTagService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author luzhiwei
 * @date 2021/12/12
 */
@Service
public class BlogTagServiceImpl extends ServiceImpl<BlogTagMapper, BlogTag> implements BlogTagService {

}
