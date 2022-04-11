package com.mes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PostListController implements Controller{
    private static  String METHOD = "GET";

    @Override
    public String getMethod() {
        return PostListController.METHOD;
    }

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST List Controller");
        return "/mes/post/list.jsp";
    }
}
