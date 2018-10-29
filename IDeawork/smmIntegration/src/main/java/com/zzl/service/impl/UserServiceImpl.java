package com.zzl.service.impl;

import com.zzl.dao.UserBeanDao;
import com.zzl.pojo.Ta;
import com.zzl.pojo.UserBean;
import com.zzl.service.IUserService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("iUserService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserBeanDao userBeanDao;
    @Override
    public int addUser(UserBean userBean) {
        return userBeanDao.addUser(userBean);
    }

    @Override
    public UserBean loginByUser(UserBean user) {
        return userBeanDao.loginByUser(user);
    }

    @Override
    public List<UserBean> loginByUser1() {
        return userBeanDao.loginByUser1();
    }

    @Override
    public List<Ta> getTaAll() {
        return userBeanDao.getTaAll();
    }


}
