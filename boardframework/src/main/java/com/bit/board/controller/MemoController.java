package com.bit.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.board.model.MemoDto;
import com.bit.board.service.MemoService;
import com.bit.member.model.MemberDto;

//@RestController
@Controller
public class MemoController {

	@Autowired
	private MemoService memoService;
	
	@RequestMapping(value="memo" , method=RequestMethod.POST, headers= {"Content-type=application/json"})
	public @ResponseBody String write(@RequestBody MemoDto memoDto, HttpSession session) { //넘어오는 data가 json
		MemberDto memberDto = (MemberDto) session.getAttribute("userInfo");
		if(memberDto != null) {
			memoDto.setId(memberDto.getId());
			memoDto.setName(memberDto.getName());
			int cnt = memoService.writeMemo(memoDto);
		}
		
		return "";
	}
	
}
