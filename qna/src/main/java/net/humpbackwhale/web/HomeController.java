package net.humpbackwhale.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		
		
		// humpbackwhale-servlet.xml 내부 설정으로 인해 /home.jsp 로 리턴이 됨.
		return "home";
	}
}