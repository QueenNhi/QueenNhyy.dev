package BaiThucHanh;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.Enumeration;

@WebServlet("/info-new")
public class InfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        ServletConfig config = getServletConfig();
        String company = config.getInitParameter("companyName");
        String website = config.getInitParameter("website");

        out.println("<!DOCTYPE html>");
        out.println("<html><head><meta charset='UTF-8'><title>Thông tin Servlet</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh; background-color: #f9f9f9; }");
        out.println(".container { max-width: 700px; width: 90%; background: white; padding: 30px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); text-align: center; }");
        out.println("table { margin: 20px auto; border-collapse: collapse; }");
        out.println("th, td { border: 1px solid #888; padding: 8px 12px; }");
        out.println("th { background-color: #f2f2f2; }");
        out.println("</style>");
        out.println("</head><body>");

        out.println("<div class='container'>");
        out.println("<h2>Thông tin công ty</h2>");
        out.println("<p><strong>Tên công ty:</strong> " + company + "</p>");
        out.println("<p><strong>Website:</strong> <a href='" + website + "'>" + website + "</a></p>");

        out.println("<h2>Toàn bộ tham số khởi tạo</h2>");
        out.println("<table>");
        out.println("<tr><th>Tên tham số</th><th>Giá trị</th></tr>");

        Enumeration<String> paramNames = config.getInitParameterNames();
        while (paramNames.hasMoreElements()) {
            String name = paramNames.nextElement();
            String value = config.getInitParameter(name);
            out.println("<tr><td>" + name + "</td><td>" + value + "</td></tr>");
        }

        out.println("</table>");
        out.println("</div>");
        out.println("</body></html>");
    }
}
