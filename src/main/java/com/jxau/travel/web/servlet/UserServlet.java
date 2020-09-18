package com.jxau.travel.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/*")      //user/add user/find
public class UserServlet extends BaseServlet {
    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
