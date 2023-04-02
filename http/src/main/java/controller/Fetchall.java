package controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoPateint;
import dto.pateint;
@WebServlet("/qwe")
public class Fetchall extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	
	DaoPateint p=new DaoPateint();
	List<pateint> b=p.fetchall();
	req.setAttribute("data", b);
	RequestDispatcher dispatcher=req.getRequestDispatcher("jspfetchall.jsp");
	dispatcher.forward(req, resp);
	
}
}
