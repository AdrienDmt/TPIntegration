package bonjour;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class bonjour extends HttpServlet {

	  @Override
	  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	                 throws ServletException, IOException {
	    req.setCharacterEncoding("utf-8");
	    String name = req.getParameter("name");

	    resp.setContentType("text/plain");
	    resp.setCharacterEncoding("utf-8");
	    resp.getWriter().write("Hello " + name + "!");
	  }
}
