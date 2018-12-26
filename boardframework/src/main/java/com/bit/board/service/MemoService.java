package com.bit.board.service;

import com.bit.board.model.MemoDto;

public interface MemoService {

	int writeMemo(MemoDto memoDto);
	String listMemo(int seq); //JSON 배열 형태로 넘겨야 한다 --> String
	int modifyMemo(MemoDto memoDto);
	int deleteMemo(int mseq);
	
}
