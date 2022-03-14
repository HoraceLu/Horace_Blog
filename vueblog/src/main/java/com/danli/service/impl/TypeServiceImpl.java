package com.danli.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.danli.entity.Type;
import com.danli.mapper.TypeMapper;
import com.danli.service.TypeService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author luzhiwei
 * @date 2021/12/12
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

}
