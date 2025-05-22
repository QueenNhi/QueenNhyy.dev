package BaiThucHanh;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String[] subjects = request.getParameterValues("subjects");

        out.println("<!DOCTYPE html>");
        out.println("<html lang='vi'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Kết quả đăng ký</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #f0f2f5; padding: 20px; }");
        out.println("h2 { color: #4CAF50; text-align: center; }");
        out.println("table { width: 60%; margin: auto; border-collapse: collapse; background: white; box-shadow: 0 4px 10px rgba(0,0,0,0.1); }");
        out.println("th, td { padding: 12px 20px; border-bottom: 1px solid #ddd; text-align: left; }");
        out.println("tr:hover { background-color: #f1f1f1; }");
        out.println("ul { margin: 0; padding-left: 20px; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h2>Thông tin đăng ký khóa học</h2>");
        out.println("<table>");
        out.println("<tr><th>Họ tên</th><td>" + fullname + "</td></tr>");
        out.println("<tr><th>Email</th><td>" + email + "</td></tr>");
        out.println("<tr><th>Giới tính</th><td>" + gender + "</td></tr>");

        if (subjects != null) {
            out.println("<tr><th>Môn học đã chọn</th><td><ul>");
            for (String subject : subjects) {
                out.println("<li>" + subject + "</li>");
            }
            out.println("</ul></td></tr>");
        } else {
            out.println("<tr><th>Môn học đã chọn</th><td>Chưa chọn môn học nào.</td></tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='vi'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Chưa gửi thông tin</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #fdfdfd; text-align: center; padding: 50px; }");
        out.println("h3 { color: #ff5722; font-size: 20px; }");
        out.println("a { text-decoration: none; color: #2196F3; font-weight: bold; }");
        out.println("a:hover { text-decoration: underline; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Vui lòng truy cập trang <a href='register.html'>form đăng ký</a> để gửi thông tin!</h3>");
        out.println("</body></html>");
    }
}
