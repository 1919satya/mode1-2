package com.hcl.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreatAccountServlet
 */
public class CreatAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreatAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Accounts objAccount=new Accounts();
		int accno=new AccountDao().generateAccountNoDao();
		objAccount.setAccountNo(accno);
		objAccount.setFirstName(request.getParameter("firstName"));
		objAccount.setLastName(request.getParameter("lastName"));
		objAccount.setCity(request.getParameter("city"));
		objAccount.setState(request.getParameter("state"));
		int amount=Integer.parseInt(request.getParameter("amount"));
		objAccount.setAmount(amount);
		objAccount.setCheqFacil(request.getParameter("cheqFacil"));
		objAccount.setAccountType(request.getParameter("accountType"));
		String result=AccountBal.createAcccountBal(objAccount);
		PrintWriter out=response.getWriter();
		out.println(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
