//package BaiThucHanh;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.*;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet("/json")
//public class JsonServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        response.setContentType("application/json;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//
//        String json = "{\n" +
//                "  \"name\": \"Nguyen Van A\",\n" +
//                "  \"age\": 22,\n" +
//                "  \"email\": \"vana@example.com\"\n" +
//                "}";
//        out.print(json);
//        out.flush();
//    }
//}
