package com.xindaojia.backend.service;

import com.xindaojia.backend.entity.CartInfoRecord;
import java.util.List;

/**
 * 购物车记录表(CartInfoRecord)表服务接口
 *
 * @author makejava
 * @since 2020-07-22 18:35:29
 */
public interface CartInfoRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CartInfoRecord queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CartInfoRecord> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param cartInfoRecord 实例对象
     * @return 实例对象
     */
    CartInfoRecord insert(CartInfoRecord cartInfoRecord);

    /**
     * 修改数据
     *
     * @param cartInfoRecord 实例对象
     * @return 实例对象
     */
    CartInfoRecord update(CartInfoRecord cartInfoRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}