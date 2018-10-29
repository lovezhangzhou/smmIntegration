package com.zzl.service;

import com.zzl.pojo.Ta;
import com.zzl.pojo.UserBean;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IUserService {

    public int addUser(UserBean userBean);

    /**
     * 用户登录
     */
    public UserBean loginByUser(UserBean user);

    public List<UserBean> loginByUser1();


    public List<Ta> getTaAll();

}
