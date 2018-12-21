package com.bit.board.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.board.common.dao.CommonDao;
import com.bit.board.model.ReboardDto;

@Service
public class ReboardServiceImpl implements ReboardService{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int writeArticle(ReboardDto reboardDto) {
		int seq = sqlSession.getMapper(CommonDao.class).getNextSeq();
		return seq;
	}

	@Override
	public List<ReboardDto> listArticle(Map<String, String> param) {
		return null;
	}

	@Override
	public ReboardDto viewArticle(int seq) {
		return null;
	}

	@Override
	public int replyArticle(ReboardDto reboardDto) {
		return 0;
	}

	@Override
	public void modifyArticle(ReboardDto reboardDto) {
		
	}

	@Override
	public void deleteArticle(int seq) {
		
	}

	
}
