package net.mao.todowebapp;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.dialect.Database;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@WebServlet(name = "enterItem", value = "/enter-item")
public class EnterItem extends HttpServlet {


    private String message;
    public static ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();

//    public void init() {
//        message = "Message";
//    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String item = request.getParameter("item");
        String date_started = request.getParameter("date_started");
        String date_completed = request.getParameter("date_completed");
        String status = request.getParameter("status");
        if (date_completed != null) {
            DatabaseManager.enterItem(item, date_started, date_completed, status);
        } else {
            DatabaseManager.enterItem(item, date_started, status);
        }

        System.out.println(item + status);
        PrintWriter out = response.getWriter();

        //out.println("<html><body>");

        out.println("<h1>Item Added</h1>");
        //out.println("</body></html>");
    }
    public void destroy() {
    }
}
