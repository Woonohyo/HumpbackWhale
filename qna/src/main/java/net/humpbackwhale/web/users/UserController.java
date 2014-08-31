package net.humpbackwhale.web.users;

import net.humpbackwhale.domain.users.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value="/users/form", method=RequestMethod.GET)
	public String form() {
		return "users/form";
	}
	
	@RequestMapping(value="/users", method=RequestMethod.POST)
	public String create(User user) {
		log.debug("User: {}", user);
		
		return "home";
	}
}
