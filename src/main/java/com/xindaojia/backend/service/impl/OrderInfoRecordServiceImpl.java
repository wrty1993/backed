package com.xindaojia.backend.service.impl;

import com.xindaojia.backend.dao.OrderInfoRecordDao;
import com.xindaojia.backend.entity.OrderInfoRecord;
import com.xindaojia.backend.service.OrderInfoRecordService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 订单记录表(OrderInfoRecord)表服务实现类
 *
 * @author makejava
 * @since 2020-07-22 18:45:23
 */
@Service("orderInfoRecordService")
public class OrderInfoRecordServiceImpl implements OrderInfoRecordService {

    @Resource
    private OrderInfoRecordDao orderInfoRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderInfoRecord queryById(Long id) {
        return this.orderInfoRecordDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderInfoRecord> queryAllByLimit(int offset, int limit) {
        return this.orderInfoRecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderInfoRecord 实例对象
     * @return 实例对象
     */
    @Override
    public OrderInfoRecord insert(OrderInfoRecord orderInfoRecord) {
        this.orderInfoRecordDao.insert(orderInfoRecord);
        return orderInfoRecord;
    }

    /**
     * 修改数据
     *
     * @param orderInfoRecord 实例对象
     * @return 实例对象
     */
    @Override
    public OrderInfoRecord update(OrderInfoRecord orderInfoRecord) {
        this.orderInfoRecordDao.update(orderInfoRecord);
        return this.queryById(orderInfoRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderInfoRecordDao.deleteById(id) > 0;
    }
}