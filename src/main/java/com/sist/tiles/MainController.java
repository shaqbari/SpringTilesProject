package com.sist.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("main.do")
	public String main_page(){
		
		return "main";//tiles의 main을 찾아온다.
	}
	@RequestMapping("board.do")
	public String main_board(){
		
		return "board/board"; //board/board.jsp *.*로 검색된다.
	}
	@RequestMapping("notice.do")
	public String main_notice(){
		
		return "notice/notice";
	}
	
	
	
}
