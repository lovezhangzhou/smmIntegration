package com.zzl.controller;

import com.zzl.pojo.Ta;
import com.zzl.pojo.UserBean;
import com.zzl.service.IUserService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("UserCon")
public class UserController {

    @Resource
    protected IUserService iUserService;

    @RequestMapping("/Insert")
    public String InsertUser(UserBean userBean){
        System.err.println(userBean);
        int i = iUserService.addUser(userBean);
        System.err.println(i);
        return "redirect:/login.jsp";
    }

    @RequestMapping("/Login")
    public String Userlogin(UserBean userBean, HttpServletRequest req){
        Logger logger = LogManager.getLogger(UserController.class);
        logger.info("哒哒哒哒哒哒多"+userBean);
//        logger.error("8888888888888"+userBean);
//        logger.debug(userBean);

        UserBean byUser = iUserService.loginByUser(userBean);
        logger.info("得到"+byUser);

//        if(byUser!=null) {
//            if (userBean.getU_name().equals(byUser.getU_name()) && userBean.getU_pwd().equals(byUser.getU_pwd())) {
//                List<UserBean> userBeans = iUserService.loginByUser1();
//                iUserService.loginByUser1();
//                logger.info("xx**xx"+userBeans);
//                HttpSession session = req.getSession();
//                session.setAttribute("userBean",userBeans);
//                return "redirect:/sucess.jsp";
//            }
//        }

        return "redirect:/login.jsp";
    }

//    @RequestMapping("/getTA")
//    public String getTA(){
//        List<Ta> taAll = iUserService.getTaAll();
//        System.err.println("888888888"+taAll);
//        return "redirect:/login.jsp";
//
//    }




}
