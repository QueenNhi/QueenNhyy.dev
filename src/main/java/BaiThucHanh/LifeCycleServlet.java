package BaiThucHanh;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Servlet 2: LifeCycleServlet
@WebServlet("/life")
public class LifeCycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("==> [LifeCycleServlet] init() được gọi");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("==> [LifeCycleServlet] doGet() được gọi");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2>Đây là LifeCycleServlet - kiểm tra chu kỳ sống Servlet</h2>");
    }

    @Override
    public void destroy() {
        System.out.println("==> [LifeCycleServlet] destroy() được gọi");
    }
}
