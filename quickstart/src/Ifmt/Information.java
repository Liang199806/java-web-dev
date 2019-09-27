package Ifmt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Information extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
          String username = req.getParameter("username");
          String password = req.getParameter("password");
                req.setAttribute("uername",username);
                req.setAttribute("password",password);
                req.getRequestDispatcher("/index.jsp").forward(req,resp);
        //HttpSession session = req.getSession();
        //session.setAttribute("username",username);
       // resp.sendRedirect("index.jsp");
      //  System.out.println(username);
    }
}