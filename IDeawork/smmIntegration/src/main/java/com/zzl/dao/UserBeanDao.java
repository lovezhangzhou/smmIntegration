package com.zzl.dao;

import com.zzl.pojo.Ta;
import com.zzl.pojo.UserBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userBeanDao")
public interface UserBeanDao {
  //用户注册
    public int addUser(UserBean userBean);

    /**
     * 用户登录
     */
    public UserBean loginByUser(UserBean user);

  /**
   * 用户登录
   */
  public List<UserBean> loginByUser1();

  public List<Ta> getTaAll();




}
