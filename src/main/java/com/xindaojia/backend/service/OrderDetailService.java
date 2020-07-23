package com.xindaojia.backend.service;

import com.xindaojia.backend.entity.OrderDetail;
import java.util.List;

/**
 * 订单详情表(OrderDetail)表服务接口
 *
 * @author makejava
 * @since 2020-07-22 18:42:50
 */
public interface OrderDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderDetail queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderDetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orderDetail 实例对象
     * @return 实例对象
     */
    OrderDetail insert(OrderDetail orderDetail);

    /**
     * 修改数据
     *
     * @param orderDetail 实例对象
     * @return 实例对象
     */
    OrderDetail update(OrderDetail orderDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}