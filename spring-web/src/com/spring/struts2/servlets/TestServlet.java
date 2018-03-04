package com.spring.struts2.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import com.spring.struts2.beans.Person;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.��application������еõ�IOC����������
	    ServletContext servletContext = getServletContext();
	    ApplicationContext ctx =  (ApplicationContext) servletContext.getAttribute("ApplicationContext");
	    
	    //2.��IOC�����еõ���Ҫ��bean
	    Person person = (Person) ctx.getBean("person");
	    person.hello();
	}

}