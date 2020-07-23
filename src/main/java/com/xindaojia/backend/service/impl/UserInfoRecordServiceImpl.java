package com.xindaojia.backend.service.impl;

import static com.xindaojia.backend.constant.Constant.INIT;
import static com.xindaojia.backend.constant.Constant.MEMBER_STATUS_NORMAL;
import static com.xindaojia.backend.errorcode.ErrorCode.SUCCESS;
import static com.xindaojia.backend.errorcode.ErrorCode.UPDATE_DB_FAILED;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xindaojia.backend.dao.UserInfoRecordDao;
import com.xindaojia.backend.entity.UserInfoRecord;
import com.xindaojia.backend.properties.DefaultProperties;
import com.xindaojia.backend.service.UserInfoRecordService;
import com.xindaojia.backend.utils.EncryptUtils;
import com.xindaojia.backend.utils.SnowFlake;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 用户信息表(UserInfoRecord)表服务实现类
 *
 * @author makejava
 * @since 2020-07-22 18:51:40
 */
@Service("userInfoRecordService")
public class UserInfoRecordServiceImpl implements UserInfoRecordService {

    private final Logger logger = LoggerFactory.getLogger(UserInfoRecordServiceImpl.class);
    @Resource
    private UserInfoRecordDao userInfoRecordDao;

    @Resource
    private DefaultProperties defaultProperties;

    @Resource
    EncryptUtils encryptUtils;

    @Value("${SnowFlake.machineId}")
    long machineId;
    @Value("${SnowFlake.datacenterId}")
    long datacenterId;


    @Override
    public String userRegister(HashMap<Object, Object> registerRequest) {
        SnowFlake snowFlake = new SnowFlake(datacenterId, machineId);
        JsonObject result = new JsonObject();
        UserInfoRecord userInfoRecord = new UserInfoRecord();
        setDefaultValue(userInfoRecord);
        if (registerRequest.get("name") != null && !StringUtils
                .isEmpty(registerRequest.get("name"))) {
            userInfoRecord.setUserName(registerRequest.get("name").toString());
        }
        //用户密码加密
        if (registerRequest.get("password") != null && !StringUtils
                .isEmpty(registerRequest.get("password"))) {
            userInfoRecord.setUserPassword(encryptUtils
                    .encryptStr(registerRequest.get("password").toString()));
        }
        //生成uid
        long uid = snowFlake.nextId();
        userInfoRecord.setUserId(uid);
        if (registerRequest.get("phone") != null && !StringUtils
                .isEmpty(registerRequest.get("phone"))) {
            userInfoRecord.setPhoneNum(registerRequest.get("phone").toString());
        }
        if (registerRequest.get("sex") != null && !StringUtils
                .isEmpty(registerRequest.get("sex"))) {
            userInfoRecord.setSex(Integer.parseInt(registerRequest.get("sex").toString()));
        }
        if (registerRequest.get("status") != null && !StringUtils
                .isEmpty(registerRequest.get("status"))) {
            userInfoRecord
                    .setUserStatus(Integer.parseInt(registerRequest.get("status").toString()));
        }
        userInfoRecord.setCreateTime(new Date());
        try {
            if (userInfoRecordDao.insert(userInfoRecord) == 1) {
                result.addProperty("code", SUCCESS.code());
                result.addProperty("msg", SUCCESS.msg());
            } else {
                result.addProperty("code", UPDATE_DB_FAILED.code());
                result.addProperty("msg", UPDATE_DB_FAILED.msg());
            }
        } catch (Exception exception) {
            logger.error("update user info exception!uid:[{}],exception:[{}]",
                    uid, exception.getMessage());
            result.addProperty("code", UPDATE_DB_FAILED.code());
            result.addProperty("msg", UPDATE_DB_FAILED.msg());
        }
        return new Gson().toJson(result);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserInfoRecord queryById(Long id) {
        return this.userInfoRecordDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserInfoRecord> queryAllByLimit(int offset, int limit) {
        return this.userInfoRecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userInfoRecord 实例对象
     * @return 实例对象
     */
    @Override
    public UserInfoRecord insert(UserInfoRecord userInfoRecord) {
        this.userInfoRecordDao.insert(userInfoRecord);
        return userInfoRecord;
    }

    /**
     * 修改数据
     *
     * @param userInfoRecord 实例对象
     * @return 实例对象
     */
    @Override
    public UserInfoRecord update(UserInfoRecord userInfoRecord) {
        this.userInfoRecordDao.update(userInfoRecord);
        return this.queryById(userInfoRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.userInfoRecordDao.deleteById(id) > 0;
    }

    private void setDefaultValue(UserInfoRecord userInfoRecord) {
        userInfoRecord.setSex(INIT);
        userInfoRecord.setCardNum("");
        userInfoRecord.setMemberType(INIT);
        userInfoRecord.setUserStatus(MEMBER_STATUS_NORMAL);
        userInfoRecord.setVersion(0);
        userInfoRecord.setAge(0);
        userInfoRecord.setUserPassword(encryptUtils.encryptStr(defaultProperties.getPassword()));
        userInfoRecord.setAddress0("");
        userInfoRecord.setAddress1("");
        userInfoRecord.setAddress2("");
        userInfoRecord.setAddress3("");
        userInfoRecord.setAddress4("");
        userInfoRecord.setNick("");
        userInfoRecord.setChar1("");
        userInfoRecord.setChar2("");
        userInfoRecord.setChar3("");
        userInfoRecord.setExtInfo("");
        userInfoRecord.setExtInt1(0);
        userInfoRecord.setExtInt2(0);
        userInfoRecord.setExtInt3(0);
        userInfoRecord.setDate1(new Date());
        userInfoRecord.setDate2(new Date());
        userInfoRecord.setDate3(new Date());
        userInfoRecord.setUserName(defaultProperties.getUsername());
        userInfoRecord.setPhoneNum(defaultProperties.getPhone());
        userInfoRecord.setPhoneVerify(INIT);
        userInfoRecord.setPhotoUrl("");
    }
}