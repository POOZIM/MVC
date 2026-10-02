package com.hexagon.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hexagon.mvc.model.ColorManager;

public class ColorController extends HttpServlet {
	ColorManager colorManager = new ColorManager();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String color = req.getParameter("color");
		if (color == null) {
			color = "";
		}

		ColorManager colorManager = new ColorManager();

		String msg = colorManager.getAdvice(color);

		//HttpSession session = req.getSession();
		//session.setAttribute("msg", msg);
		
		req.setAttribute("msg", msg);
		RequestDispatcher dis = req.getRequestDispatcher("/color/main.jsp");
		dis.forward(req, resp);
	}
}
