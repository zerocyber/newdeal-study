package com.bit.board.service;

import java.util.List;
import java.util.Map;

import com.bit.board.model.AlbumDto;

public interface AlbumService {

	int writeArticle(AlbumDto albumDto);
	List<AlbumDto> listArticle(Map<String, String> param); //page번호 등..
	AlbumDto viewArticle(int seq);
	AlbumDto getArticle(int seq);
	void modifyArticle(AlbumDto albumDto);
	void deleteArticle(AlbumDto albumDto);
	
}
