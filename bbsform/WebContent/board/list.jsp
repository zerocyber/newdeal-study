<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
String root = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="ko">
<head>
<title>���� �Խ���</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="<%=root%>/css/skin_purple.css" type="text/css">
</head>

<body>
<!-- title start -->
<table width="100%" cellpadding="0" cellspacing="0" border="0">
	<tr>
		<td><img src="<%=root%>/img/board/m_icon_board.gif" width="9"
			height="9" border="0" align="absmiddle" style="margin-top: -2px">
		<b>�����Խ���</b> &nbsp;<font style="font-size: 8pt">|</font>&nbsp; �����ο� ����
		�ø��� �����Դϴ�<br>
		</td>
		<td align="right"></td>
	</tr>
	<tr>
		<td colspan="2" height="19"></td>
	</tr>
</table>
<!-- title end -->

<!-- bbs start -->
<table border="0" cellpadding="0" cellspacing="0" width="100%">
	<tr valign="bottom">
		<td nowrap><a href=""><img
			src="<%=root%>/img/board/btn_write_01.gif" width="64" height="22"
			border="0" align="absmiddle" alt="�۾���"></a></td>

		<td width="100%" style="padding-left: 6px" valign="bottom">���� <b><font
			class="text_acc_02">���� ���� ��� �ϴ� �κ�</font></b> / ��ü <font
			class="text_acc_02">��ü �ۼ��� ��� �ϴ� �κ�</font></td>
		<td width="300" nowrap>
		<div align="right"></div>
		</td>
	</tr>
	<tr>
		<td colspan="2" height="5" style="padding: 0px"></td>
	</tr>
</table>

<form name="listForm" method="post" style="margin: 0px">
<table width="100%" cellpadding="5" cellspacing="0" border="0">
	<tr>
		<td class="bg_board_title_02" height="2" colspan="11"
			style="overflow: hidden; padding: 0px"></td>
	</tr>
	<tr class="bg_board_title" align="center" height="28">
		<td nowrap><b>��ȣ</b></td>
		<td nowrap class="board_bar" style="padding: 0px">|</td>
		<td></td>
		<td width="100%"><b>����</b></td>
		<td nowrap class="board_bar" style="padding: 0px">|</td>
		<td width="120" nowrap><b>�۾���</b></td>
		<td nowrap class="board_bar" style="padding: 0px">|</td>
		<td nowrap><b>��ȸ</b></td>
		<td nowrap class="board_bar" style="padding: 0px">|</td>
		<td width="45" nowrap><b>��¥</b></td>
	</tr>
	<tr>
		<td class="bg_board_title_02" height="1" colspan="11"
			style="overflow: hidden; padding: 0px"></td>
	</tr>

	<!-- ������� ����� -->


	<!-- ������� ���볡  -->
	<tr>
		<td align="center" class="text_gray">�۹�ȣ ����ϴ� �κ�</td>
		<td></td>
		<td nowrap class="onetext" style="padding-right: 5px"></td>
		<!--td>
     
     </td-->
		<td style="word-break: break-all;"><a href=""
			class="link_board_03">�� ������ ��� �ϴ� �κ�&nbsp;&nbsp;&nbsp;</a></td>
		<td></td>
		<td style="word-break: break-all;"><a href="javascript:;"
			onClick="showSideView();" class="link_board_04">�ۼ��ڸ� ��� �ϴ� �κ�</a></td>
		<td></td>
		<td align="center" class="text_gray">��ȸ���� ��� �ϴ� �κ�</td>
		<td></td>
		<td align="center" class="text_gray">�ۼ� ���ڸ� ��� �ϴ� �κ�</td>
	</tr>

	<tr>
		<td bgcolor="#ededed" height="1" colspan="11"
			style="overflow: hidden; padding: 0px"></td>
	</tr>


	<tr>
		<td class="bg_board_title_02" height="1" colspan="11"
			style="overflow: hidden; padding: 0px"></td>
	</tr>
</table>
</form>
<!-- bbs end -->

<!-- �ϴ� ����¡ -->
<table width="100%" cellpadding="0" cellspacing="0" border="0">
	<tr>
		<td colspan="3" height="5"></td>
	</tr>
	<tr valign="top">
		<td nowrap><a href=""><img
			src="<%=root%>/img/board/btn_write_01.gif" width="64" height="22"
			border="0" align="absmiddle" alt="�۾���"></a></td>
		<td width="100%" align="center"><!--PAGE--> ������ �з��� �ϴ� �κ�</td>
		<td nowrap class="stext"><b>���� ������ ��� �κ�</b> / �� ���������� ��� �ϴ� �κ�
		pages</td>
	</tr>
</table>
<br>
<!-- �ϴ� ����¡ -->

<!-- �˻� ����-->
<form name="searchForm" method="post" action="javascript:goBbsSearch();"
	style="margin: 0px"><input type="hidden" name="" value="">
<table width="100%" cellpadding="0" cellspacing="0" border="0">
	<tr>
		<td colspan="3" height="10"></td>
	</tr>
	<tr>
		<td width="50%"></td>
		<td nowrap><select name="item" onchange="javascript:ch()"
			class="inp">
			<option value="subject">������
			<option value="writer">�۾���
			<option value="no">�۹�ȣ
		</select> <span id="sear1"> <input type="text" name="query" size="22"
			class="inp" style="margin-top: -19px;"> </span> <span id="sear2"
			style="display: none;"> <select name="head" class="inp">
			<option value="���Ӹ�����">���Ӹ�����
		</select> </span> <a href="javascript:goBbsSearch();"><img
			src="<%=root%>/img/board/sbtn_s.gif" width="32" height="18"
			border="0" align="absmiddle" alt="�˻�"></a> <a
			href="javascript:goMyList('��ȿ��')"><img
			src="<%=root%>/img/board/sbtn_mytext.gif" width="82" height="20"
			align="absmiddle" alt="���� �� �� ����"></a><br>
		</td>
		<td width="50%" align="right"><a href="#"><img
			src="<%=root%>/img/board/sbtn_top.gif" width="24" height="11"
			align="absmiddle" alt="TOP"></a><br>
		</td>
	</tr>
</table>
</form>
</body>
</html>

