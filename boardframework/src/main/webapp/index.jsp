<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.bit.member.model.MemberDto"%>
<%
MemberDto memberDto = new MemberDto();
memberDto.setId("zerocyber");
memberDto.setName("정원준");
memberDto.setEmail("zeroforever@naver.com");

session.setAttribute("userInfo", memberDto);

response.sendRedirect(request.getContextPath() + "/badmin/boardmenu.bit");
%>