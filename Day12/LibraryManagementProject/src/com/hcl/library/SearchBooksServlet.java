package com.hcl.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchBooksServlet
 */
public class SearchBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchBooksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BooksDao dao=new BooksDao();
		String searchtype = request.getParameter("searchtype");		
		String searchvalue = request.getParameter("searchvalue");
		List<Books> books=dao.searchBooksDao(searchtype, searchvalue);
		PrintWriter out=response.getWriter();
		//out.println(books.size());
		out.println("<table border='3'>");
		out.println("<tr><th>Book Id</th><th>Book Name</th><th>Author</th>");
		out.println("<th>Edition</th><th>Dept</th><th>TotalBooks</th></tr>");
		for (Books books2 : books) 
			 {
			out.println("<tr><td>" +books2.getId() + "</td>");
			out.println("<td>" +books2.getName() + "</td>");
			out.println("<td>" +books2.getAuthor() + "</td>");
			out.println("<td>" +books2.getEdition() + "</td>");
			out.println("<td>" +books2.getDept() + "</td>");
			out.println("<td>" +books2.getTotalBooks() + "</td> ");
			if(books2.getTotalBooks() > 0)
				out.write("<td><input type='checkbox' name='bookid' value="+books2.getId()+"></td></tr>");		
			else
				out.write("<td><input type='checkbox' name='bookid' disabled='true' value="+books2.getId()+"></td></tr>");
				
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
