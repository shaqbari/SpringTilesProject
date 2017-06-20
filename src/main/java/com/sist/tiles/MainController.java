package com.sist.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("main.do")
	public String main_page(){
		
		return "main";//tiles�� main�� ã�ƿ´�.
	}
	@RequestMapping("board.do")
	public String main_board(){
		
		return "board/board"; //board/board.jsp *.*�� �˻��ȴ�.
	}
	@RequestMapping("notice.do")
	public String main_notice(){
		
		return "notice/notice";
	}
	
	
	
}
