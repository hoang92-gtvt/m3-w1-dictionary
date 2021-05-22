import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Translation_Servlet", value = "/translate")
public class Translation_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String keyword = request.getParameter("txtSearch");

        Map<String,String> dictionary= new HashMap<>();
        dictionary.put("Hello", "Xin chào");
        dictionary.put("Book", "Sách");
        dictionary.put("Computer","Máy tính");
        dictionary.put("How", "Như thế nào");
        dictionary.put("Child", "Một đứa trẻ");

        writer.println("<html>");
        String result = dictionary.get(keyword);
        if(result != null){
            writer.println("Word"+ keyword);
            writer.println("</br>");
            writer.println("result"+ result);

        }else
            writer.println("Not Found Word");



        writer.println("</html>");

    }
}
