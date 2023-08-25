package pri.chaofan.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/demo03")
public class Servletdemo03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        Map<String, String[]> parameterMap = req.getParameterMap();
        for(String s : parameterMap.keySet()){
            System.out.print(s);
            for (String str : parameterMap.get(s)) {
                System.out.print(str);
            }
        }

        String username = req.getParameter("username");
        System.out.println(username);
        String[] hobbies = req.getParameterValues("hobby");
        for(String str: hobbies){
            System.out.println(str);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
