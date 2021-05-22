import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Caculator_Servlet", value = "/caculator")
public class Caculator_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String value1= request.getParameter("number1");
        String value2= request.getParameter("number2");
        writer.println("<html>");

        int number1 = Integer.parseInt(value1);
        int number2 = Integer.parseInt(value2);

        String operator = request.getParameter("operator");


        switch(operator){
            case  "+":
                writer.println(number1);
                writer.println(" + ");
                writer.println(number2);
                writer.println(" = ");
                writer.println(number1+number2);
                break;
            case  "-":
                writer.println(number1);
                writer.println(" - ");
                writer.println(number2);
                writer.println(" = ");
                writer.println(number1-number2);
                break;

            case  "*":
                writer.println(number1);
                writer.println(" X ");
                writer.println(number2);
                writer.println(" = ");
                writer.println(number1*number2);
                break;
            case  "/":
                writer.println(number1);
                writer.println(" : ");
                writer.println(number2);
                writer.println(" = ");
                writer.println(number1/number2);
                break;
        }
        writer.println("</html>");
    }
}
