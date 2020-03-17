package com.versioncheck.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/VersionServlet")
public class VersionServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {     
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		String v1 = request.getParameter("v1");
	    String v2 = request.getParameter("v2");
	    
	    
	    CalculateVersion c = new CalculateVersion();
	    out.print("<h2>"+c.calculate(c.getVersion(v1), c.getVersion(v2))+"</h2>");
	     
	    out.println("<head><meta charset=\"UTF-8\"><link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/Style.css\"/></head>");
	    out.println("<html><body>");
	    out.println("</body></html>");
	}
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }
}
