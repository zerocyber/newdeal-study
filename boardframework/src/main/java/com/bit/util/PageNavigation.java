package com.bit.util;

public class PageNavigation {

	private String root;
	private boolean nowFirst;
	private boolean nowEnd;
	private int totalArticleCount;
	private int newArticleCount;
	private int totalPageCount;
	private int pageNo;
	private String navigator;

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	public boolean isNowFirst() {
		return nowFirst;
	}

	public void setNowFirst(boolean nowFirst) {
		this.nowFirst = nowFirst;
	}

	public boolean isNowEnd() {
		return nowEnd;
	}

	public void setNowEnd(boolean nowEnd) {
		this.nowEnd = nowEnd;
	}

	public int getTotalArticleCount() {
		return totalArticleCount;
	}

	public void setTotalArticleCount(int totalArticleCount) {
		this.totalArticleCount = totalArticleCount;
	}

	public int getNewArticleCount() {
		return newArticleCount;
	}

	public void setNewArticleCount(int newArticleCount) {
		this.newArticleCount = newArticleCount;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public String getNavigator() {
		return navigator;
	}

	public void makeNavigator() {
		StringBuffer tmpNavigator = new StringBuffer();
		int pageSize = BoardConstance.PAGE_COUNT;
		int preEnd = (pageNo -1) / pageSize * pageSize;
		
		tmpNavigator.append("<table cellpadding='0' cellspacing='0' border='0'>\n");
		tmpNavigator.append(" <tr>\n");
		if (this.isNowFirst()) {
			tmpNavigator.append("  <td><font color='#999999'>\n");
			tmpNavigator.append("   <img src='" + root
					+ "/img/board/icon_prev02.gif' width='7' height='11' border='0' align='absmiddle' hspace='3'>");
			tmpNavigator.append("	<label id='firstPage'>최신목록</label>\n");
			tmpNavigator.append("   <img src='" + root
					+ "/img/board/icon_prev01_dim.gif' width='3' height='11' border='0' align='absmiddle' hspace='3'>\n");
			tmpNavigator.append("   이전</font>\n");
		} else {
			tmpNavigator.append("  <td>\n");
			tmpNavigator.append("   <img src='" + root
					+ "/img/board/icon_prev02.gif' width='7' height='11' border='0' align='absmiddle' hspace='3'>");
			tmpNavigator.append("	<label id='firstPage'>최신목록</label>\n");
			tmpNavigator.append("   <img src='" + root
					+ "/img/board/icon_prev01_dim.gif' width='3' height='11' border='0' align='absmiddle' hspace='3'>\n");
			tmpNavigator.append("   <label class='movePage' move-page-no='" + preEnd + "'>이전</label>");
		}
		tmpNavigator.append("  \n</td>\n");
		tmpNavigator.append("  <td style='padding: 0 5 0 5'>\n");
		tmpNavigator.append("   <table cellpadding='0' cellspacing='0' border='0'>\n");
		tmpNavigator.append("    <tr>\n");
		tmpNavigator.append("     <td width='1' nowrap><img src='" + root + "/img/board/n_tab.gif' width='1'");
		tmpNavigator.append(" height='11' border='0' align='absmiddle'><br>");
		tmpNavigator.append("     </td>\n");

		int startPage = preEnd + 1;
		int endPage = preEnd + pageSize;
		if(endPage > totalPageCount)
			endPage = totalPageCount;

		
		for (int i = startPage; i <= endPage; i++) {
			if (pageNo == i) {
				tmpNavigator.append("     <td style='padding:0 7 0 7;' nowrap><font class='text_acc_02'><b>" + i
						+ "</b></font></td>\n");
				tmpNavigator.append("     <td width='1' nowrap><img src='" + root + "/img/board/n_tab.gif' width='1'");
				tmpNavigator.append(" height='11' border='0' align='absmiddle'><br>\n");
			} else {
				tmpNavigator.append("     <td style='padding:0 7 0 7;' nowrap><label class='movePage' move-page-no='"+ i +"'>"
						+ i + "</td>\n");
				tmpNavigator.append("     <td width='1' nowrap><img src='" + root + "/img/board/n_tab.gif' width='1'");
				tmpNavigator.append(" height='11' border='0' align='absmiddle'><br>\n");
			}
		}
		tmpNavigator.append("     </td>\n");
		tmpNavigator.append("    </tr>\n");
		tmpNavigator.append("   </table>\n");
		tmpNavigator.append("  </td>\n");
		tmpNavigator.append("  <td>\n");

		if (this.isNowEnd()) {
			tmpNavigator.append("   <font color='#999999'>다음<img");
			tmpNavigator.append("   src='" + root + "/img/board/icon_next01_dim.gif' width='3' height='11'");
			tmpNavigator.append(" border='0' align='absmiddle' hspace='3'> \n");
			tmpNavigator.append("   끝목록<img src='" + root + "/img/board/icon_next02_dim.gif' width='7' height='11'");
			tmpNavigator.append(" border='0' align='absmiddle' hspace='3'></font>\n");
		} else {
			tmpNavigator.append("   <label class='movePage' move-page-no='" + (preEnd + pageSize +1) + "'>다음</label><img");
			tmpNavigator.append(" src='" + root + "/img/board/icon_next01_dim.gif' width='3' height='11'");
			tmpNavigator.append(" border='0' align='absmiddle' hspace='3'>\n");
			tmpNavigator.append("   <label class='movePage' move-page-no='"+ totalPageCount+"'>끝목록</label><img src='" + root
					+ "/img/board/icon_next02_dim.gif' width='7' height='11'");
			tmpNavigator.append(" border='0' align='absmiddle' hspace='3'>\n");
		}

		tmpNavigator.append("  </td>\n");
		tmpNavigator.append(" </tr>\n");
		tmpNavigator.append("</table>\n");

		this.navigator = tmpNavigator.toString();
	}

}
