package pl.edu.pjwstk.jaz.hellojaz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class MyFirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out =  response.getWriter();
		out.println("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
				"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" " +
					"\"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n" +
				"<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
				"<head>\n" +
				"<title>Hello Jaz</title>" +
				"</head>\n" +
				"<body>\n");
		out.println("<p>Serwlety są super!</p>\n");
		out.println("</body>\n" +
				"</html>");
		
	}
	
}
