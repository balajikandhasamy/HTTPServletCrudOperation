package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Jspmethod;
import dto.FetchallDaoJsp;
@WebServlet("/jsp")
public class InsertJsp extends HttpServlet  {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String s1=req.getParameter("email");
	String s2=req.getParameter("name");
	String s3=req.getParameter("password");
	String s4=req.getParameter("role");
	FetchallDaoJsp d=new FetchallDaoJsp();
	d.setEmail(s1);
	d.setName(s2);
	d.setPassword(s3);
	d.setRole(s4);
	Jspmethod j=new Jspmethod();
	j.jspinsert(d);
	
}
}