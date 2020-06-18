package com.czj.controller;

import com.alibaba.fastjson.JSON;
import com.czj.entity.Area;
import com.czj.service.AreaService;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/province")
public class ProvinceServlet extends HttpServlet {
    private AreaService areaService=new AreaService();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        List<Area>list=areaService.list();
        PrintWriter pw=response.getWriter();
        pw.write(JSON.toJSONString(list));
        pw.close();
    }
}
