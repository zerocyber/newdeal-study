package com.bit.board.dao;

import java.util.List;
import java.util.Map;

import com.bit.board.model.ReboardDto;

public interface ReboardDao {

	int writeArticle(ReboardDto reboardDto);
	List<ReboardDto> listArticle(Map<String, String> param); //page번호 등..
	ReboardDto viewArticle(int seq);
	
	void updateStep(ReboardDto reboardDto);
	int replyArticle(ReboardDto reboardDto);
	void updateReply(int pseq);
	
	void modifyArticle(ReboardDto reboardDto);
	void deleteArticle(int seq);
	
	
	int idCheck(String mid);
}
