package com.bit.board.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.board.model.ReboardDto;
import com.bit.board.service.ReboardService;
import com.bit.member.model.MemberDto;

@Controller
@RequestMapping("/reboard")
public class ReboardController {
	
	@Autowired
	private ReboardService reboardService;
	
	@RequestMapping(value="write.bit", method=RequestMethod.GET)
	public String write(@RequestParam Map<String, String> param) {
		return "reboard/write";
	}
	
	@RequestMapping(value="write.bit", method=RequestMethod.POST)
	public String write(ReboardDto reboardDto , @RequestParam Map<String, String> param, 
			HttpSession session, Model model) {
		MemberDto memberDto = (MemberDto) session.getAttribute("userInfo");
		if(memberDto != null) {
			reboardDto.setId(memberDto.getId());
			reboardDto.setName(memberDto.getName());
			reboardDto.setEmail(memberDto.getEmail());
			
			int seq = reboardService.writeArticle(reboardDto);
			if(seq !=0) {
				model.addAttribute("wseq", seq);
			}else {
				model.addAttribute("errorMsg", "서버 문제로 글 작성이 실패 했습니다.....");
			}
		}else {
			model.addAttribute("errorMsg", "회원 전용 게시판입니다. 로그인 해주세요.");
		}
		return "reboard/writeOk";
	}
	
	@RequestMapping("view.bit")
	public String view(@RequestParam int seq, HttpSession session, Model model) {
		MemberDto memberDto = (MemberDto) session.getAttribute("userInfo");
		if(memberDto != null) {
			ReboardDto reboardDto = reboardService.viewArticle(seq);
			model.addAttribute("article", reboardDto);
		}
		
		return "reboard/view";
	}

}
