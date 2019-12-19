package produit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ficheproduit")
public class produit extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String code = req.getParameter("code");
		String nom = req.getParameter("nom");

		resp.setContentType("text/plain");
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().write("Nom du produit : " + nom + "!");
		resp.getWriter().write(

				"<html>" + "<head>" + "<meta charset=\"UTF-8\">" + "</head>" + "<body>" + "<p>" + nom + "</p>"
						+ "<img src ='./codebarre?type=datamatrix&msg=" + code + "'>" + "</body>" + "</html>");

	}
}