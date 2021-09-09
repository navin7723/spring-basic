package com.techprimers.db.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.techprimers.db.model.Users;
import com.techprimers.db.service.UserService;

@Controller	
public class UserController {

	
	@Autowired
    private UserService userService;
 
                                   
    @GetMapping("/login")
           
    public ModelAndView login() {
    	ModelAndView mav = new ModelAndView("login");
        mav.addObject("users", new Users());
        return mav;
    }
 
    @PostMapping("/login")
    public String login(@ModelAttribute("users") Users users ) {
// doubt   	
    	Users oauthUser = userService.login(users.getUserName(), users.getPassword());
    	
 
    	System.out.print(oauthUser);
    	if(Objects.nonNull(oauthUser)) 
    	{	
  
    		return "redirect:/";
    	
    		
    	} else {
    		return "redirect:/login";
    		
    	
    	}
 
}
}
