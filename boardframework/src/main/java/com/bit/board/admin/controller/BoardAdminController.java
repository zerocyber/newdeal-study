package com.bit.board.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/badmin")
public class BoardAdminController {

	@RequestMapping("boardmenu.bit")
	public String boardMenu() {
		return "admin/boardmenu";
	}
	
}
