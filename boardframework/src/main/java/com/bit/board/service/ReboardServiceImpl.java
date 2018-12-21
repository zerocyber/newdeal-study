package com.bit.board.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.board.common.dao.CommonDao;
import com.bit.board.dao.ReboardDao;
import com.bit.board.model.ReboardDto;
import com.bit.util.BoardConstance;

@Service
public class ReboardServiceImpl implements ReboardService{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int writeArticle(ReboardDto reboardDto) {
		int seq = sqlSession.getMapper(CommonDao.class).getNextSeq();
		reboardDto.setSeq(seq);
		reboardDto.setRef(seq);
		int cnt = sqlSession.getMapper(ReboardDao.class).writeArticle(reboardDto);
		return cnt != 0 ? seq : 0;
	}

	@Override
	public List<ReboardDto> listArticle(Map<String, String> param) {
		int pg = Integer.parseInt(param.get("pg"));
		int end = pg * BoardConstance.LIST_COUNT;
		int start = end - BoardConstance.LIST_COUNT;
		
		param.put("start", start + ""); //문자열로 바꾸기 (toString같은 기능)
		param.put("end", end + "");
		return sqlSession.getMapper(ReboardDao.class).listArticle(param);
	}

	@Override
	public ReboardDto viewArticle(int seq) {
		return sqlSession.getMapper(ReboardDao.class).viewArticle(seq);
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
