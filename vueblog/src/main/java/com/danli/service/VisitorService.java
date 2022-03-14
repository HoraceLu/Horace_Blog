package com.danli.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.danli.entity.Visitor;

/**
 *  服务类
 *
 * @author luzhiwei
 * @date 2021/12/12
 */
public interface VisitorService extends IService<Visitor> {
    /**
     * 通过uuid查询是否存在是该uuid的访客
     *
     * @param uuid
     * @return
     */
    boolean hasUUID(String uuid);

    /**
     * 通过uuid查询访客
     *
     * @param uuid
     * @return
     */
    Visitor getVisitorByUuid(String uuid);
    /**
     * 获取Pv
     *
     * @return pv
     */
    int getPv();
}
