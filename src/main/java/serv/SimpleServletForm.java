package serv;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class SimpleServletForm extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String fio = request.getParameter("fio");
        String phone = request.getParameter("phone");
        String mail = request.getParameter("mail");
        String info = request.getHeader("User-Agent");

        out.println("Welcome user of " + info + "<br>");


        if (fio.equals("")) {
            out.println("Error, FIO field is not filled");
        } else {
            if ((phone.equals("") & mail.equals(""))) {
                out.println("Error, some fields are not filled");
            } else {
                Enumeration en = request.getParameterNames();
                while (en.hasMoreElements()) {
                    request.getRequestDispatcher("index.jsp");
                    String name = (String) en.nextElement();
                    out.println("<br>" + name);
                    String[] values = request.getParameterValues(name);
                    for (int i = 0; i < values.length; i++) {
                        out.println(" " + values[i] + "<br>");
                    }
                }
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}