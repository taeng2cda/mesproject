package com.mes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Controller {
    public String getMethod();

    public String execute(HttpServletRequest req , HttpServletResponse resp)
            throws ServletException, IOException;

}
