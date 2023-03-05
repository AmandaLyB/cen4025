package net.mao.todowebapp;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "deleteItem", value = "/delete-item")
public class DeleteItem extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String id = request.getParameter("id");
        String item = request.getParameter("item");
        System.out.println(item);
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        if (id != null) {
            DatabaseManager.deleteItem(id);
        }
        else if (item != null) {
            DatabaseManager.deleteItem(item);
        }
        out.println("<h1>Item Deleted</h1>");
        out.println("</body></html>");
    }
    public void destroy() {
    }

}
