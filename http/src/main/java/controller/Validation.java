package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ValiDao;
import dto.ValidaDto;
@WebServlet("/insert")
public class Validation extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String s1=req.getParameter("email");
	String s2=req.getParameter("pwd");
	String s3=req.getParameter("dob");
	ValidaDto d=new ValidaDto();
	d.setEmailid(s1);
	d.setPwd(s2);
	d.setDob(s3);
	
	ValiDao a=new ValiDao();
	a.insert(d);
}
}
