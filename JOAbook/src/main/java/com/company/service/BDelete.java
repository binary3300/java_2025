package com.company.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDao;
import com.company.domain.BoardVo;

public class BDelete implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       // 1. 언어셋팅 UTF-8
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");

	       // 2. 파라미터 받아오기
			int bno = Integer.parseInt(request.getParameter("bno"));
	      
	       // 3. sql
			BoardDao dao = new BoardDao();
	      
	       // 4. request.setAttribute()
			request.setAttribute("result", String.valueOf(dao.delete(bno)));
			//http://localhost:8080/JOAbook/delete.do?bno=12
	}

}
