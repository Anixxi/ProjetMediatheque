package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import user.User;

@WebServlet ("/seConnecter")
public class ConnexionServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException { 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String login = request.getParameter("login");
        String mdp = request.getParameter("pwd");
        User u = new User(login, mdp);
        HttpSession session = request.getSession(true);
        session.setAttribute("utilisateurConnecte", u);
        
        out.println("<html>");
        out.println("<body>");
        out.println("<h1> Vous êtes connecté avec le login : " + u.getLogin() +
        						" et le mot de passe " +u.getMdp() +"</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
