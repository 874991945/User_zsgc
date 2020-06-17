package com.czj.controller;

import com.czj.entity.User;
import com.czj.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;


@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet {

    private UserService userService=new UserService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user=new User();
        user.setAccount(request.getParameter("account"));
        user.setPassword(request.getParameter("password"));
        user.setAge(Integer.valueOf(request.getParameter("age")));
        user.setSex(request.getParameter("sex"));
        user.setSal(new BigDecimal(request.getParameter("sal")));
        user.setBirth(request.getParameter("birth"));

        userService.addUser(user);

        response.sendRedirect("/UserList");
    }
}
