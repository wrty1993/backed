package com.xindaojia.backend.service;

import com.xindaojia.backend.entity.ServiceInfoRecord;

import java.util.HashMap;
import java.util.List;

/**
 * 服务信息表(ServiceInfoRecord)表服务接口
 *
 * @author makejava
 * @since 2020-07-22 18:45:52
 */
public interface ServiceInfoRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ServiceInfoRecord queryById(Long id);
    
    /**
     * 首页不同类型展示不同服务
     * @param registerRequest
     * @return
     */
    String homePageShow(HashMap<Object, Object> requestData);
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ServiceInfoRecord> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param serviceInfoRecord 实例对象
     * @return 实例对象
     */
    ServiceInfoRecord insert(ServiceInfoRecord serviceInfoRecord);

    /**
     * 修改数据
     *
     * @param serviceInfoRecord 实例对象
     * @return 实例对象
     */
    ServiceInfoRecord update(ServiceInfoRecord serviceInfoRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}