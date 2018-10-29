package com.zzl.service;

import com.zzl.pojo.Ta;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ITaService {

    public void showTaByPage(HttpServletRequest request, Model model);

}
