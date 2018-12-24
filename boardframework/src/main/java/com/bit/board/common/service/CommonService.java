package com.bit.board.common.service;

import java.util.Map;

import com.bit.util.PageNavigation;

public interface CommonService {

	PageNavigation makePageNavigation(Map<String, String> params); //bcode, 검색키워드 등
	
	
}
