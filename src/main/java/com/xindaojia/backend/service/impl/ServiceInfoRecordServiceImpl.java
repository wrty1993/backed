package com.xindaojia.backend.service.impl;

import com.xindaojia.backend.dao.ServiceInfoRecordDao;
import com.xindaojia.backend.entity.ServiceInfoRecord;
import com.xindaojia.backend.service.ServiceInfoRecordService;
import com.xindaojia.backend.utils.RespParams;
import com.xindaojia.backend.utils.ReqParams;

import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 服务信息表(ServiceInfoRecord)表服务实现类
 *
 * @author makejava
 * @since 2020-07-22 18:45:52
 */
@Service("serviceInfoRecordService")
public class ServiceInfoRecordServiceImpl implements ServiceInfoRecordService {

    @Resource
    private ServiceInfoRecordDao serviceInfoRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ServiceInfoRecord queryById(Long id) {
        return this.serviceInfoRecordDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ServiceInfoRecord> queryAllByLimit(int offset, int limit) {
        return this.serviceInfoRecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param serviceInfoRecord 实例对象
     * @return 实例对象
     */
    @Override
    public ServiceInfoRecord insert(ServiceInfoRecord serviceInfoRecord) {
        this.serviceInfoRecordDao.insert(serviceInfoRecord);
        return serviceInfoRecord;
    }

    /**
     * 修改数据
     *
     * @param serviceInfoRecord 实例对象
     * @return 实例对象
     */
    @Override
    public ServiceInfoRecord update(ServiceInfoRecord serviceInfoRecord) {
        this.serviceInfoRecordDao.update(serviceInfoRecord);
        return this.queryById(serviceInfoRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.serviceInfoRecordDao.deleteById(id) > 0;
    }
    
    /**
     * 首页展示，不同分类图标查询不同服务
     */
	@Override
	public String homePageShow(HashMap<Object, Object> requestData) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	/**
	 * 获取分类数据
	 * @return
	 */
	public RespParams getClissifyDataPage(ReqParams reqParams) {
		RespParams respParams =new RespParams();
		int page=Integer.parseInt(reqParams.get("page").toString());
		int size=Integer.parseInt(reqParams.get("size").toString());
		List<ServiceInfoRecord> serviceList = serviceInfoRecordDao.queryAllByLimit((page-1)*size, size);
		respParams.setList(serviceList);
		respParams.setPage(page);
		respParams.setSize(serviceList.size());
		return respParams;
	}
	
	
}