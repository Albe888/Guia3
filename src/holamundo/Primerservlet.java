package holamundo;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Primerservlet
 */
public class Primerservlet extends HttpServlet {
private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public Primerservlet() {
        // TODO Auto-generated constructor stub
    }

/**
 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 // TODO Auto-generated method stub
 //response.getWriter().append("Served at: ").append(request.getContextPath());
 response.setContentType("text/html");
 PrintWriter out = new PrintWriter(response.getOutputStream());
 out.println("<html>");
 out.println("<head>");
 out.println("<title>hola mundo</title>");
 out.println("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">");
 out.println("<script src=\"js/boostrap.min.js\" type =\"javascript\"></script>");
 out.println("<body>");
 out.println("<h1>hola mundo desde el servidor servlet</h1>");
 out.println("<p>");
 out.println("<p>click en el boton retroceder para regresar</p>");
 out.println("</body>");
 out.println("</html>");
 out.close();
}

/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 // TODO Auto-generated method stub
 doGet(request, response);
 
 
}

}

