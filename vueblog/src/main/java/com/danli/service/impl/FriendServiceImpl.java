package com.danli.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.danli.entity.Friend;
import com.danli.mapper.FriendMapper;
import com.danli.service.FriendService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author luzhiwei
 * @date 2021/12/12
 */
@Service
public class FriendServiceImpl extends ServiceImpl<FriendMapper, Friend> implements FriendService {

}
