package com.lala.jd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */

@WebServlet("/lala/home")
public final class HomeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "admin", "管理员"));
		list.add(new Person(2, "hr", "人力资源"));
		list.add(new Person(3, "qq", "腾讯"));
		list.add(new Person(4, "baidu", "百度"));
		request.setAttribute("list", list);
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}
}