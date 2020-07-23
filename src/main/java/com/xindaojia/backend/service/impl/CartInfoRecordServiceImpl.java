package com.xindaojia.backend.service.impl;

import com.xindaojia.backend.dao.CartInfoRecordDao;
import com.xindaojia.backend.entity.CartInfoRecord;
import com.xindaojia.backend.service.CartInfoRecordService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 购物车记录表(CartInfoRecord)表服务实现类
 *
 * @author makejava
 * @since 2020-07-22 18:35:30
 */
@Service("cartInfoRecordService")
public class CartInfoRecordServiceImpl implements CartInfoRecordService {

    @Resource
    private CartInfoRecordDao cartInfoRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CartInfoRecord queryById(Long id) {
        return this.cartInfoRecordDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CartInfoRecord> queryAllByLimit(int offset, int limit) {
        return this.cartInfoRecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param cartInfoRecord 实例对象
     * @return 实例对象
     */
    @Override
    public CartInfoRecord insert(CartInfoRecord cartInfoRecord) {
        this.cartInfoRecordDao.insert(cartInfoRecord);
        return cartInfoRecord;
    }

    /**
     * 修改数据
     *
     * @param cartInfoRecord 实例对象
     * @return 实例对象
     */
    @Override
    public CartInfoRecord update(CartInfoRecord cartInfoRecord) {
        this.cartInfoRecordDao.update(cartInfoRecord);
        return this.queryById(cartInfoRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.cartInfoRecordDao.deleteById(id) > 0;
    }
}