<%@page import="com.demoweb.model.dto.BoardComment"%>
<%@page import="com.demoweb.model.dao.BoardDao"%>
<%@page import="com.demoweb.model.dto.Member"%>
<%@page import="com.demoweb.model.dto.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

if (request.getMethod().toLowerCase().equals("post")) {
	request.setCharacterEncoding("UTF-8");
}

BoardComment comment = new BoardComment();
comment.setBoardNo(Integer.parseInt((request.getParameter("boardno"))));
comment.setWriter((request.getParameter("writer")));
comment.setContent(request.getParameter("content"));


BoardDao dao = new BoardDao();
dao.insertComment(comment);

String result = "등록되었습니다";
%>
<%=result %>










