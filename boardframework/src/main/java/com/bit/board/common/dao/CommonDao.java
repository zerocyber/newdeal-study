package com.bit.board.common.dao;

public interface CommonDao {

	int getNextSeq(); //다음 글 번호 가져오기
	void updateHit(int seq); //조회수 증가
	
}
