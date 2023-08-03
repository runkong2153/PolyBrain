import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/HelloTomcat")
public class HelloWorld extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter writer = res.getWriter();
        writer.println("<!DOC TYPE html>");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Hello! Servlet!</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Hello! Servlet!</h1>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
