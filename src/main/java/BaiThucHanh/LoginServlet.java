package BaiThucHanh;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("LoginServlet: Servlet được khởi tạo.");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Giao diện form đăng nhập đẹp
        out.println("<!DOCTYPE html>");
        out.println("<html lang='vi'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Đăng nhập</title>");
        out.println("<style>");
        out.println("body { font-family: 'Segoe UI', sans-serif; background: linear-gradient(to right, #e0eafc, #cfdef3); display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
        out.println(".login-box { background: white; padding: 40px; border-radius: 12px; box-shadow: 0 10px 25px rgba(0,0,0,0.1); width: 320px; }");
        out.println(".login-box h2 { margin-bottom: 20px; color: #333; }");
        out.println("input[type='text'], input[type='password'] { width: 100%; padding: 10px; margin: 10px 0; border: 1px solid #ccc; border-radius: 5px; }");
        out.println("button { width: 100%; padding: 12px; background: #007bff; color: white; border: none; border-radius: 5px; font-size: 16px; cursor: pointer; }");
        out.println("button:hover { background: #0056b3; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='login-box'>");
        out.println("<h2>Đăng nhập</h2>");
        out.println("<form action='login' method='post'>");
        out.println("<input type='text' name='username' placeholder='Tên đăng nhập' required>");
        out.println("<input type='password' name='password' placeholder='Mật khẩu' required>");
        out.println("<button type='submit'>Đăng nhập</button>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean loginSuccess = "admin".equals(username) && "1234".equals(password);

        out.println("<!DOCTYPE html>");
        out.println("<html><head><meta charset='UTF-8'><title>Kết quả đăng nhập</title>");
        out.println("<style>");
        out.println("body { font-family: 'Segoe UI', sans-serif; background-color: #f2f2f2; display: flex; justify-content: center; align-items: center; height: 100vh; }");
        out.println(".result-box { background: white; padding: 40px; border-radius: 12px; box-shadow: 0 10px 25px rgba(0,0,0,0.1); text-align: center; }");
        out.println(".success { color: green; font-size: 24px; }");
        out.println(".error { color: red; font-size: 24px; }");
        out.println("a { display: inline-block; margin-top: 20px; text-decoration: none; color: #007bff; }");
        out.println("a:hover { text-decoration: underline; }");
        out.println("</style>");
        out.println("</head><body>");
        out.println("<div class='result-box'>");

        if (loginSuccess) {
            out.println("<div class='success'>Đăng nhập thành công!</div>");
        } else {
            out.println("<div class='error'>Đăng nhập thất bại!</div>");
            out.println("<a href='login'>Thử lại</a>");
        }

        out.println("</div>");
        out.println("</body></html>");
    }
}
