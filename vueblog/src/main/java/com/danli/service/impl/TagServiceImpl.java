package com.danli.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.danli.entity.Tag;
import com.danli.mapper.TagMapper;
import com.danli.service.TagService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author luzhiwei
 * @date 2021/12/12
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}
