package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import user.User;

@WebServlet ("/testerConnexion")
public class TestConnexionServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException { 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();      
        
        HttpSession session = request.getSession(true);
        
        User user = (User)session.getAttribute("utilisateurConnecte");
        
        out.println("<html>");
        out.println("<body>");
        
        if (user != null) {
        	out.println("<h1> Vous êtes encore connecté avec le login : " + user.getLogin() +
					" et le mot de passe " +user.getMdp() +"</h1>");
        }
        else {
        	out.println("<h1 style='color:red;'> Vous n'êtes pas connecté !</h1>");
        }        
        out.println("</body>");
        out.println("</html>");
    }
}
