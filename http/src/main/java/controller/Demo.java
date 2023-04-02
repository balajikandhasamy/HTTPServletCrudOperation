package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoPateint;
import dto.pateint;
@WebServlet("/fgh")
public class Demo extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String s1=req.getParameter("p_id");
	//String p_name=req.getParameter("p_name");
	String s2=req.getParameter("p_bg");
	//pateint p=new pateint();
	//p.setP_id(s1);
	//p.setP_name(p_name);
	//p.setP_bg(s2);
	
	DaoPateint p1=new DaoPateint();
	p1.update(s1,s2);
	
}
}

