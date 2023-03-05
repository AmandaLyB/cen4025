package net.mao.todowebapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "printTable", value = "/print-table")
public class PrintTable extends HttpServlet {

    public static HashMap<Integer, String[]> table = new HashMap<Integer, String[]>();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        DatabaseManager.readTable();
        for (Map.Entry<Integer, String[]> index : table.entrySet()) {
            System.out.println(table.get(index));
        }

        out.println("<!DOCTYPE html>");
        out.println("<head>" +
                "    <meta charset=\"utf-8\">" +
                "    <meta name=\"description\" content=\"To Do Web Application\">" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
                "    <title>To Do List</title>" +
                "    <link rel=\"stylesheet\" href=\"printTable.css\">" +
                "</head>");
        out.println("<body>");
        out.println("<div class=\"row\">" +
                "<div class=\"col-3\"></div>" +
                "<div class=\"col-8\">" +
                "<h1>To Do Database</h1>");
        //request.getRequestDispatcher("/index.jsp").forward(request,response);
        out.println("<table>");
        out.println("<tr>" +
                "<th>id </th>" +
                "<th>item</th>" +
                "<th>date_created </th>" +
                "<th>date_completed</th>" +
                "<th>status</th>" +
                "</tr>");
        for(int i = 0; i < table.size(); i++) {
            out.println("<tr>" +
                    "<th>" + table.get(i)[0] + "</th>" +
                    "<th>" + table.get(i)[1] + "</th>" +
                    "<th>" + table.get(i)[2] + "</th>" +
                    "<th>" + table.get(i)[3] + "</th>" +
                    "<th>" + table.get(i)[4] + "</th>" +
                    "</tr>");
        }
        out.println("</table>");

        out.println("</div>" +
                "<div class=\"col-1\"></div>"+
                "</div>");

        out.println("</body></html>");

    }
    public void destroy() {
    }
}
