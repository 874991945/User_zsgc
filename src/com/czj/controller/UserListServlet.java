package com.czj.controller;

import com.czj.dao.UserDao;
import com.czj.entity.User;
import com.czj.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/UserList")
public class UserListServlet extends HttpServlet {

    private UserService userService=new UserService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        request.setAttribute("list",userService.list());

        request.getRequestDispatcher("UserList.jsp").forward(request,response);
    }
}
