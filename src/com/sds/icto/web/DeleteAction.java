package com.sds.icto.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.guestbook.dao.GuestBookDao;
import com.sds.icto.guestbook.vo.GuestBookVo;

public class DeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		Long no = Long.parseLong(request.getParameter("no"));
		String password = request.getParameter("password");

		GuestBookDao dao = new GuestBookDao();
		GuestBookVo vo = dao.selectGuestBookByNo(no);
		if(vo.getPassword().equals(password)){
			dao.deleteGuestBook(vo);
			response.sendRedirect("/guestbook");
		}else{
			request.setAttribute("msg", "비밀번호를 확인해주세요.");
			request.getRequestDispatcher("/deleteform.jsp").forward(request, response);
		}

	}

}
