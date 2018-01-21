package ua.nike.learn;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AOP_Principles extends HttpServlet {

    private String http_out_inf =
            "<!DOCTYPE HTML>\n" +
                    "<html>\n" +
                    "   <head>\n" +
                    "       <meta charset=\"UTF-8\">\n" +
                    "       <title>AOP Principles</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "   <h3><a href=\"https://docs.oracle.com/javase/tutorial/java/concepts/index.html\" target=\"_blank\">Aspect Oriented Programming Principles :</a></h3>\n" +
                    "   <ul>\n" +
                    "<li><a href=\"https://docs.oracle.com/javase/tutorial/java/concepts/object.html\" target=\"_blank\">Object (Об'єкт)</a></li>\n" +
                    "<li>Class (Клас)</li>\n" +
                    "<li>Inheritance (Наслідування)</li>\n" +
                    "<li>Interface (Інтерфейс)</li>\n" +
                    "<li>Package (Пакет)</li>\n" +
                    "</ul>\n" +
                    "</body>\n" +
                    "</html>\n";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String responseContentType = "text/html;charset=UTF-8";
        response.setContentType(responseContentType);
        response.getWriter().write(http_out_inf);
    }
}
