package com.bit.board.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.board.dao.MemoDao;
import com.bit.board.model.MemoDto;

@Service
public class MemoServiceImpl implements MemoService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int writeMemo(MemoDto memoDto) {
		return sqlSession.getMapper(MemoDao.class).writeMemo(memoDto);
	}

	@Override
	public String listMemo(int seq) {
		return null;
	}

	@Override
	public int modifyMemo(MemoDto memoDto) {
		return 0;
	}

	@Override
	public int deleteMemo(int mseq) {
		return 0;
	}

}
