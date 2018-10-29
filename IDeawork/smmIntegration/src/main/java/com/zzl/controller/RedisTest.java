package com.zzl.controller;

import com.alibaba.fastjson.JSON;
import com.zzl.pojo.Ta;
import com.zzl.pojo.UserBean;
import com.zzl.service.IUserService;
import com.zzl.util.RedisCache;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/RedisTest")
public class RedisTest {

    @Resource
    private RedisCache redisCache;
    @Resource
    private IUserService iUserService;


    @RequestMapping("/getTA")
    public String getall(HttpServletRequest req){
        List<Ta> taAll=null;
        //先从redis缓存中获得数据
        //先配置redis中的key
        String key="com.zzl.service.IUserService.getTa";
        //测试时间毫米数
        long staMil = System.currentTimeMillis();
        //去redis缓存中的按key获值
        String data=redisCache.getDataFromRedis(key);
        //然后判断redis中的是否有数据
        if(data==null){
            System.err.println("缓存中没有数据去mysql数据库拿数据"+data+"   0000 "+redisCache);
             taAll = iUserService.getTaAll();
//            System.err.println("转json之前"+taAll);
            //将拿出来的数据转json字符串
            String  taAl3=JSON.toJSONString(taAll);
//            System.err.println("转json之后"+taAl3);
            //测试时间毫米数
            long endMil1 = System.currentTimeMillis();
            long M =staMil-endMil1;
            System.err.println(M);
            //把转了json字符数据格式的数据存到redis
            redisCache.setDataToRedis(key,taAl3);

        }else{
            //如果redis缓存不为空就直接转成对象集合
            taAll = JSON.parseArray(data, Ta.class);
            //测试时间毫米数
            long endMil2 = System.currentTimeMillis();
            long M1 =staMil-endMil2;
            System.err.println(M1);
            System.err.println("redis缓存中拿数据"+taAll);
        }
//        System.out.println(taAll+"55555555");
        for(Ta t:taAll){
            System.out.println(t);
        }
        req.getSession().setAttribute("ta",taAll);
        return "redirect:/sucess.jsp";
    }

}
