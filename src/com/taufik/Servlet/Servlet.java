package com.taufik.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taufik.Dao.DoImo;
import com.taufik.Model.Model;

public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Model mod=new Model();
		DoImo dao=new DoImo();
		
		System.out.println(request.getParameter("name"));
		String name = request.getParameter("name");
		String alamat = request.getParameter("alamat" );
		
		mod.setNama(name);
		mod.setAlamat(alamat);
		
		dao.GetName(name);
		System.out.println(dao.GetName(name));
		System.out.println(alamat);
		resp(response,name,alamat);
		
		dao.obj(mod);
		
		
	}

	private void resp(HttpServletResponse response, String name,String alamat) {
		// TODO Auto-generated method stub
		PrintWriter out;
		try {
			out = response.getWriter();
			 out.println("<!DOCTYPE html>");
	         out.println("<html><head>");
	         out.println("<title>Hello, World</title></head>");
	         out.println("<body>");
	         out.println("<h1>Hello, world!</h1>");  // says Hello
	         // Echo client's request information
	         out.println("<p>Request URI: " + name + "</p>");
	         out.println("<p>Request URI: " + alamat + "</p>");
	        out.println("</body>");
	         out.println("</html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        
		
	}
	
}
