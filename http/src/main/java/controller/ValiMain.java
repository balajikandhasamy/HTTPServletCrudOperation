package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.ValiDao;
import dto.ValidaDto;

@WebServlet("/vali")
public class ValiMain extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String s1=req.getParameter("email");
	String s2=req.getParameter("pwd");
	ValiDao p=new ValiDao();
	ValidaDto v=p.fetch(s1);
//	resp.getWriter().print(b.getP_id()+" "+b.getP_name()+" "+b.getP_bg());

if(s1!=null){
	if(v.getPwd().equals(s2)){
		resp.getWriter().print("homepage");
	}
	else{
		resp.getWriter().print("enter correct name");
	}
	
}
else{
	resp.getWriter().print("no data founds");
}
}
}

