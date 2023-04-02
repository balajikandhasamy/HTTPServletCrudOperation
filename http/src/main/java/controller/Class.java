package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoPateint;
import dto.pateint;
@WebServlet("/asd")
public class Class extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String p_id=req.getParameter("p_id");
	String p_name=req.getParameter("p_name");
	String p_bg=req.getParameter("p_bg");
	pateint p=new pateint();
	p.setP_id(p_id);
	p.setP_name(p_name);
	p.setP_bg(p_bg);
	
	DaoPateint p1=new DaoPateint();
	p1.insert(p);
	resp.getWriter().print("<h1>successfully insert the data in the database</h1>");
}
}
