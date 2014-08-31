package net.humpbackwhale.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String home() {
		
		// humpbackwhale-servlet.xml 내부 설정으로 인해 /home.jsp 로 리턴이 됨.
		return "home";
	}
}