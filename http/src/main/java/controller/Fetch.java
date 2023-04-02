package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoPateint;
import dto.pateint;
@WebServlet("/poi")
public class Fetch extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	
	String s1=req.getParameter("p_id");
	String s2=req.getParameter("p_name");
	DaoPateint p=new DaoPateint();
	pateint b=p.fetch(s1);
//	resp.getWriter().print(b.getP_id()+" "+b.getP_name()+" "+b.getP_bg());

if(s1!=null){
	if(b.getP_name()==s2){
	System.out.println("homepage");
	}
	else{
		System.out.println("enter correct name");
	}
	
}
else{
	System.out.println("no data founds");
}
}
}
