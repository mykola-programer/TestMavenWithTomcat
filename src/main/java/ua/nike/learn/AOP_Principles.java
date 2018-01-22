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
                    "   <h3><a href=\"https://en.wikipedia.org/wiki/Aspect-oriented_programming\" target=\"_blank\">Aspect-Oriented Programming :</a></h3>\n" +
                    "   <ul>\n" +
                    "<li>Aspect (Аспект) - це клас, який має певну функціональність на зміну програми, в певних точках.</a></li>\n" +
                    "<li>Advice (Совет) - це частина коду яка повинна бути визвана з точки зєднання.</li>\n" +
                    "<li>Join Point (Точка зєднання) - це точка в програмы в якый потрыбно виконати совет.</li>\n" +
                    "<li>Pointcut (Зріз) - це набір точок зєднання.</li>\n" +
                    "<li>Introduction (Вторгнення) - це зміна програми, структури класу, функціональності, для додання нової функціональності.</li>\n" +
                    "</ul>\n" +
                    "</body>\n" +
                    "</html>\n";
//
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String responseContentType = "text/html;charset=UTF-8";
        response.setContentType(responseContentType);
        response.getWriter().write(http_out_inf);
    }
}
