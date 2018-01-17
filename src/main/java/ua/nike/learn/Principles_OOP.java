package ua.nike.learn;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Principles_OOP extends HttpServlet {

    private String http_out_inf =
            "<!DOCTYPE HTML>\n" +
            "<html>\n" +
                "<head>\n" +
                    "<meta charset=\"UTF-8\">\n" +
                    "<title>Principles_OOP</title>\n" +
                "</head>\n" +
                "<body>\n" +
                    "<h2>OOP Principles</h2>\n" +
                    "<h3>It is four principles of OOP :</h3>\n" +
                        "<ul>\n" +
                            "<li>Encapsulation (Інкапсуляція)</li>\n" +
                        "<li>Inheritance (Наслідування)</li>\n" +
                        "<li>Polymorphism (Поліморфізм)</li>\n" +
                        "<li>Abstraction (Абстракція)</li>\n" +
                        "</ul>\n" +
                "</body>\n" +
            "</html>\n";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write(http_out_inf);
    }
}
