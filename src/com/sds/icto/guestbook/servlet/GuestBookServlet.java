package com.sds.icto.guestbook.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.web.Action;
import com.sds.icto.web.DeleteAction;
import com.sds.icto.web.DeleteFormAction;
import com.sds.icto.web.IndexAction;
import com.sds.icto.web.InsertAction;

@WebServlet("/gb")
public class GuestBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GuestBookServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
			String a = request.getParameter("a");
			Action action = null;
			if("insert".equals(a)){
				action = new InsertAction();
			}else if("delete".equals(a)){
				action = new DeleteAction();
			}else if("deleteform".equals(a)){
				action = new DeleteFormAction();
			}else{
				action = new IndexAction();
			}
			action.execute(request, response);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
