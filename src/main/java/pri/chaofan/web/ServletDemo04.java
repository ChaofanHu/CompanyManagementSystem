package pri.chaofan.web;

import pri.chaofan.pojo.Brand;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/demo04")
public class ServletDemo04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getCookies();
        List<Brand> brands = new ArrayList<>();
        brands.add(new Brand("三只松鼠","三只松鼠"));
        brands.add(new Brand("腾讯","企鹅"));
        brands.add(new Brand("小米","雷军公司"));

        //deposit into request
        req.setAttribute("brands",brands);
        req.getRequestDispatcher("/demo01.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
