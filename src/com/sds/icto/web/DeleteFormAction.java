package com.sds.icto.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		String no = request.getParameter("no");
		System.out.println(no);
		request.setAttribute("no", no);
		request.getRequestDispatcher("/deleteform.jsp").forward(request, response);
		
	}

}
