package BaiThucHanh;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.*;

@WebServlet("/image")
public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Đường dẫn ảnh tương đối trong webapp
        String imagePath = "/resources/admin.png"; // ảnh nằm trong webapp/resources

        InputStream inputStream = getServletContext().getResourceAsStream(imagePath);

        if (inputStream == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.getWriter().write("Không tìm thấy ảnh.");
            return;
        }

        response.setContentType("image/jpeg");

        OutputStream outputStream = response.getOutputStream();
        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        inputStream.close();
        outputStream.close();
    }
}
