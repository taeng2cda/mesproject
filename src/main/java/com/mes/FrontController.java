package com.mes;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
    private static final serialVersionUID = 1L;

    HashMap<String , Controller> router = new HashMap<>();

    public FrontController() {super();}
    public void init(ServletConfig config) throws ServletException{
        router.put("/mes.postList.do", new PostListController());
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }

    protected void service(HttpServletRequest req , HttpServletResponse resp)
        throws ServletException, IOException{

        String url = req.getRequestURI();
        String contextPath = req.getContextPath();
        String path = url.substring(contextPath.length());

        System.out.println(url);
        System.out.println(contextPath);
        System.out.println(path);

        if(router.containsKey(path)){
            Controller crontController = router.get(path);

            String method = req.getMethod();

        }

    }


}
