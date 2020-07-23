package com.xindaojia.backend.service;

import com.xindaojia.backend.entity.StoreInfoRecord;
import java.util.List;

/**
 * 商户信息表(StoreInfoRecord)表服务接口
 *
 * @author makejava
 * @since 2020-07-22 18:46:11
 */
public interface StoreInfoRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    StoreInfoRecord queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<StoreInfoRecord> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param storeInfoRecord 实例对象
     * @return 实例对象
     */
    StoreInfoRecord insert(StoreInfoRecord storeInfoRecord);

    /**
     * 修改数据
     *
     * @param storeInfoRecord 实例对象
     * @return 实例对象
     */
    StoreInfoRecord update(StoreInfoRecord storeInfoRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}