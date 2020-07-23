package com.xindaojia.backend.dao;

import com.xindaojia.backend.entity.OrderInfoRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 订单记录表(OrderInfoRecord)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-22 18:45:22
 */
public interface OrderInfoRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderInfoRecord queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderInfoRecord> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param orderInfoRecord 实例对象
     * @return 对象列表
     */
    List<OrderInfoRecord> queryAll(OrderInfoRecord orderInfoRecord);

    /**
     * 新增数据
     *
     * @param orderInfoRecord 实例对象
     * @return 影响行数
     */
    int insert(OrderInfoRecord orderInfoRecord);

    /**
     * 修改数据
     *
     * @param orderInfoRecord 实例对象
     * @return 影响行数
     */
    int update(OrderInfoRecord orderInfoRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}