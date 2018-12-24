package com.bit.board.common.service;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.board.common.dao.CommonDao;
import com.bit.util.BoardConstance;
import com.bit.util.PageNavigation;

@Service
public class CommonServiceImpl implements CommonService{

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public PageNavigation makePageNavigation(Map<String, String> param) {
		int pageNum = Integer.parseInt(param.get("pg"));
		int pageSize = BoardConstance.PAGE_COUNT;
		int listSize = BoardConstance.LIST_COUNT;
		
		PageNavigation navigation = new PageNavigation();		
		int newArticleCount = sqlSession.getMapper(CommonDao.class)
				.getNewArticleCount(Integer.parseInt(param.get("bcode")));
		navigation.setNewArticleCount(newArticleCount);
		
		int totalArticleCount = sqlSession.getMapper(CommonDao.class).getTotalArticleCount(param);
		navigation.setTotalArticleCount(totalArticleCount);
		
		int totalPageCount = (totalArticleCount -1) / listSize +1 ;
		navigation.setTotalPageCount(totalPageCount);
		navigation.setPageNo(pageNum);
		navigation.setNowFirst(pageNum <= pageSize);
		navigation.setNowEnd(pageNum > (totalPageCount -1) / pageSize * pageSize +1 );
		
		return navigation;
	}

	
}