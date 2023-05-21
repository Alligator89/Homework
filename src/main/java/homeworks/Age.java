package homeworks;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Age extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("<h1> Enter your age to continue </h1>");
        String ageStr = req.getParameter("age");
        int age = Integer.parseInt(ageStr);
        try {
            if (age >= 18) {
                printWriter.println("<h2> You're adult </h2>");
            } else {
                printWriter.println("<h2> Denied to access </h2>");
            }
        } finally {
            printWriter.close();
        }
    }
}
