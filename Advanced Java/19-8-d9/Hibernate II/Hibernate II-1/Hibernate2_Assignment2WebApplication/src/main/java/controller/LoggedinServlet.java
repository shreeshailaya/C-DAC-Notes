package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.User;

/**
 * Servlet implementation class LoggedinServlet
 */

public class LoggedinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	SessionFactory sf;
	
	public void init(ServletConfig config) throws ServletException {
    	try {
    		super.init(config);
    		sf = (SessionFactory) config.getServletContext().getAttribute("sessionFactory");
    	}catch (Exception e) {
			e.printStackTrace();
		}		
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoggedinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Hello");
		String userName = request.getParameter("username");
		String pwd = request.getParameter("password");
		System.out.println(userName+ "  "+pwd);		
		Session session = sf.openSession();	
		
		Query q= session.createQuery("select u_id from User where u_id =:username and password= :pwd");
		q.setParameter("username", userName);
		q.setParameter("pwd", pwd);
		List<Object []> list = q.getResultList();
		
		PrintWriter out = response.getWriter();
		
		if(list.size() == 0) {
			out.println("Wrong Input");
		}
		
		for(Object  e:list) {
			System.out.println(e);
			if(e != null)
				out.println("Welcome "+e);
			else
				out.println("Wrong Input");
			
		}
		
		session.close();
		
		sf.close();
		
	}

}
