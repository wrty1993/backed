package com.xindaojia.backend.service.impl;

import com.xindaojia.backend.dao.OrderDetailDao;
import com.xindaojia.backend.entity.OrderDetail;
import com.xindaojia.backend.service.OrderDetailService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 订单详情表(OrderDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-07-22 18:42:50
 */
@Service("orderDetailService")
public class OrderDetailServiceImpl implements OrderDetailService {

    @Resource
    private OrderDetailDao orderDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderDetail queryById(Long id) {
        return this.orderDetailDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderDetail> queryAllByLimit(int offset, int limit) {
        return this.orderDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderDetail 实例对象
     * @return 实例对象
     */
    @Override
    public OrderDetail insert(OrderDetail orderDetail) {
        this.orderDetailDao.insert(orderDetail);
        return orderDetail;
    }

    /**
     * 修改数据
     *
     * @param orderDetail 实例对象
     * @return 实例对象
     */
    @Override
    public OrderDetail update(OrderDetail orderDetail) {
        this.orderDetailDao.update(orderDetail);
        return this.queryById(orderDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderDetailDao.deleteById(id) > 0;
    }
}