package com.bit.board.service;

import java.util.List;
import java.util.Map;

import com.bit.board.model.ReboardDto;
import com.bit.member.model.MemberDto;

public interface ReboardService {

	int writeArticle(ReboardDto reboardDto);
	List<ReboardDto> listArticle(Map<String, String> param); //page번호 등..
	ReboardDto viewArticle(int seq);
	ReboardDto getArticle(int seq);
	int replyArticle(ReboardDto reboardDto);
	void modifyArticle(ReboardDto reboardDto);
	void deleteArticle(int seq);
	
	int idCheck(String mid);
	
}
