package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Project1;
import dto.Project2;
@WebServlet("/pro")
public class Project extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String s1=req.getParameter("pwd");
	String s2=req.getParameter("username");
	Project2 p=new Project2();
	p.setPwd(s1);
	p.setUsername(s2);
	
	Project1 s=new Project1();
	s.insert(p);
	
}
}
