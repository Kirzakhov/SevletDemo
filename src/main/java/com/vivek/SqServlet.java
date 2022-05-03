package com.vivek;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	 public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		 int k = 0;
//		 Cookie cookies[] = req.getCookies();
//		 for(Cookie c : cookies) {
//			 if(c.getName().equals("k")) {
//				 k = Integer.parseInt(c.getValue());
//			 }
//		 }
		 
		 //using session
//		 HttpSession session = req.getSession();
//		 int k = (int) session.getAttribute("k");
		  
		 //url rewriting
//		 int k = Integer.parseInt(req.getParameter("k"))
		 		 
		 //request dispatcher
		 int k = (int) req.getAttribute("k");
		 k = k*k;
		 PrintWriter out = res.getWriter();
		 out.println("<html><body bgcolor='cyan'>");
		 out.println("Result is "+k);
		 out.println("</html></body>");
		 
	 }
}
