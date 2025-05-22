package BaiThucHanh;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("WelcomeServlet: doGet() được gọi");

        // Thiết lập kiểu phản hồi là text/html
        response.setContentType("text/html");

        // Lấy đối tượng PrintWriter để gửi dữ liệu ra trình duyệt
        PrintWriter out = response.getWriter();

        // Gửi nội dung HTML với CSS
        out.println("<!DOCTYPE html>");
        out.println("<html lang='vi'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>WelcomeServlet</title>");
        out.println("<style>");
        out.println("body {");
        out.println("    font-family: Arial, sans-serif;");
        out.println("    background-color: #f0f2f5;");
        out.println("    text-align: center;");
        out.println("    padding: 50px;");
        out.println("    color: #333;");
        out.println("}");
        out.println("h1 {");
        out.println("    font-size: 32px;");
        out.println("    color: #007bff;");
        out.println("    margin-bottom: 20px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Chào mừng bạn đến với WelcomeServlet!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
