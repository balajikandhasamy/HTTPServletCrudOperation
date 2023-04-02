package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Jspmethod;
import dto.FetchallDaoJsp;
@WebServlet("/jspfetchall")
public class Jspfetchall extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		Jspmethod j=new Jspmethod();
		List<FetchallDaoJsp> l=  j.jspfetchall();
		arg0.setAttribute("data",l);
		RequestDispatcher dispatcher=  arg0.getRequestDispatcher("jspfetchall.jsp");
		dispatcher.forward(arg0, arg1);
		
	}

}
