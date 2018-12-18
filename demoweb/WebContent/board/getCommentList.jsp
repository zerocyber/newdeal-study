<%@page import="java.util.ArrayList"%>
<%@page import="com.demoweb.model.dto.BoardComment"%>
<%@page import="com.demoweb.model.dao.BoardDao"%>
<%@page import="com.demoweb.model.dto.Member"%>
<%@page import="com.demoweb.model.dto.Board"%>
<%@page import="java.sql.Date"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="net.sf.json.JSONArray" %>
<%

if (request.getMethod().toLowerCase().equals("post")) {
	request.setCharacterEncoding("UTF-8");
}

int boardno = Integer.parseInt(request.getParameter("boardno"));

BoardDao dao = new BoardDao();

ArrayList<BoardComment> list = dao.listComment(boardno);

JSONArray jsonarray = JSONArray.fromObject(list);

%>
<%=jsonarray %>










