package com.xindaojia.backend.service.impl;

import com.xindaojia.backend.dao.StoreInfoRecordDao;
import com.xindaojia.backend.entity.StoreInfoRecord;
import com.xindaojia.backend.service.StoreInfoRecordService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 商户信息表(StoreInfoRecord)表服务实现类
 *
 * @author makejava
 * @since 2020-07-22 18:46:11
 */
@Service("storeInfoRecordService")
public class StoreInfoRecordServiceImpl implements StoreInfoRecordService {

    @Resource
    private StoreInfoRecordDao storeInfoRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public StoreInfoRecord queryById(Long id) {
        return this.storeInfoRecordDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<StoreInfoRecord> queryAllByLimit(int offset, int limit) {
        return this.storeInfoRecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param storeInfoRecord 实例对象
     * @return 实例对象
     */
    @Override
    public StoreInfoRecord insert(StoreInfoRecord storeInfoRecord) {
        this.storeInfoRecordDao.insert(storeInfoRecord);
        return storeInfoRecord;
    }

    /**
     * 修改数据
     *
     * @param storeInfoRecord 实例对象
     * @return 实例对象
     */
    @Override
    public StoreInfoRecord update(StoreInfoRecord storeInfoRecord) {
        this.storeInfoRecordDao.update(storeInfoRecord);
        return this.queryById(storeInfoRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.storeInfoRecordDao.deleteById(id) > 0;
    }
}