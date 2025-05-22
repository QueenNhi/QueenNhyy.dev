//package BaiThucHanh;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.*;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet("/html")
//public class HtmlServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//
//        out.println("<html>");
//        out.println("<head><title>HTML Demo</title></head>");
//        out.println("<body>");
//        out.println("<h1>Xin chào từ Servlet!</h1>");
//        out.println("<p>Đây là một đoạn văn HTML trả về từ Servlet.</p>");
//        out.println("</body>");
//        out.println("</html>");
//    }
//}
