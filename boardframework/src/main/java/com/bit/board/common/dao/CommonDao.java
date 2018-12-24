package com.bit.board.common.dao;

import java.util.Map;

public interface CommonDao {

	int getNextSeq(); //다음 글 번호 가져오기
	void updateHit(int seq); //조회수 증가
	int getNewArticleCount(int bcode);
	int getTotalArticleCount(Map<String, String> map); //검색 키, 단어 필요
	
}
