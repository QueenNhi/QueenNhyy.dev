package BaiThucHanh;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/hello-bai1")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8"); // set UTF-8 để tránh lỗi font tiếng Việt
        resp.setCharacterEncoding("UTF-8");

        resp.getWriter().write("<!DOCTYPE html>");
        resp.getWriter().write("<html><head><title>Thông tin</title></head><body>");
        resp.getWriter().write("<h1>Họ tên: Hồ Thị Quỳnh Nhi</h1>");
        resp.getWriter().write("</body></html>");
    }
}
