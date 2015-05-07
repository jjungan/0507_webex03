package com.sds.icto.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.guestbook.dao.GuestBookDao;
import com.sds.icto.guestbook.vo.GuestBookVo;

public class IndexAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		GuestBookDao dao = new GuestBookDao();
		List<GuestBookVo> list = dao.selectGuestBook();
		request.setAttribute("list", list);
		WebUtil.forward("/guestbook", request, response);
	}

}
