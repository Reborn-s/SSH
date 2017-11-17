package com.reborn.controller;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Reborn。 on 2017/8/3.
 */
public class MyHttpController implements HttpRequestHandler
{
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException
    {
        httpServletRequest.setAttribute("message","S.H.E天团！");
        httpServletRequest.setCharacterEncoding("utf-8");
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsps/index.jsp").forward(httpServletRequest,httpServletResponse);
    }
}
