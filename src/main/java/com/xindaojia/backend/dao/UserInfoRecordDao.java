package com.xindaojia.backend.dao;

import com.xindaojia.backend.entity.UserInfoRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 用户信息表(UserInfoRecord)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-23 14:39:43
 */
public interface UserInfoRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserInfoRecord queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserInfoRecord> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userInfoRecord 实例对象
     * @return 对象列表
     */
    List<UserInfoRecord> queryAll(UserInfoRecord userInfoRecord);

    /**
     * 新增数据
     *
     * @param userInfoRecord 实例对象
     * @return 影响行数
     */
    int insert(UserInfoRecord userInfoRecord);

    /**
     * 修改数据
     *
     * @param userInfoRecord 实例对象
     * @return 影响行数
     */
    int update(UserInfoRecord userInfoRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}