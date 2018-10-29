package com.zzl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

@Controller
public class FileUploadControoler {

    @Autowired
    ServletContext context;

    @RequestMapping(value = "/fileUploadPage", method = RequestMethod.POST)
    public String fileUploadPage(@RequestParam("uploadFile") MultipartFile[] file, Model model, HttpServletRequest request) throws Exception {

        System.out.println(file.length);

        //判断文件是否为空
        if(file.length!=0){
            for (MultipartFile i: file) {
                int i1 = i.getOriginalFilename().indexOf(".");
                System.out.println(i.getOriginalFilename().substring(0,i1));
                String substrName = i.getOriginalFilename().substring(0, i1);


                //获得原文件名
            String fileName = i.getOriginalFilename();
            System.err.println("原来文件名"+fileName);
        // File.separator表示在 UNIX 系统上，此字段的值为 /；在 Windows 系统上，它为 \，如：C:\tmp\test.txt和tmp/test.txt
            String filePath = context.getRealPath("") + "upload"+ File.separator;
            //获得当前日期
            Calendar ca = Calendar.getInstance();
            //拼接日期文件夹
            filePath += "" + ca.get(ca.YEAR) + (ca.get(ca.MONTH)+1) + ca.get(ca.DATE);
            File dateDir = new File(filePath);
            //判断当前日期文件夹是否存在，不存在创建
            if(!dateDir.exists()){
                dateDir.mkdirs(); //创建
            }
            //文件名由客户端IP地址+系统当前毫秒数组成

            filePath +=File.separator + request.getRemoteAddr().replace(":","") + System.currentTimeMillis() +substrName+fileName.substring(fileName.lastIndexOf("."));
            System.err.println(filePath);
            // 复制本地文件到服务器
            FileCopyUtils.copy(i.getBytes(), new File(filePath));
            // 将文件保存路径放到request作用域
//            model.addAttribute("filePath", filePath);
            }
            return "/sucess.jsp";
        }else{
            System.out.println("文件上传异常");
            return "/FileUpload.jsp";
        }

    }


}
