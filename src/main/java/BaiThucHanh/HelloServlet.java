package BaiThucHanh;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("HelloServlet: init() được gọi");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet: doGet() được gọi");

        // Thiết lập kiểu phản hồi là text/html
        response.setContentType("text/html");

        // Lấy đối tượng PrintWriter để gửi dữ liệu ra trình duyệt
        PrintWriter out = response.getWriter();

        // Gửi nội dung HTML có CSS
        out.println("<!DOCTYPE html>");
        out.println("<html lang='vi'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Thông tin cá nhân</title>");
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
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Họ và tên của tôi là: Hồ Thị Quỳnh Nhi</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public void destroy() {
        System.out.println("HelloServlet: destroy() được gọi");
    }
}
