package com.UserMenu.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserMenu.Services.ServiceSecLoginToken;

@RestController
public class ControllerSecLoginToken {
	@Autowired
	ServiceSecLoginToken servSecLoginToken;
	
	@GetMapping("/UserMenu/execdeltoken")
	public String  execDelToken(String p_user_id) {
		return servSecLoginToken.execDelToken(p_user_id) ;
	}
	
	@GetMapping("/UserMenu/execgentoken")
	public String execGenToken(String p_user_id) {
		return servSecLoginToken.execGenToken(p_user_id) ;
	}
	
	@GetMapping("/UserMenu/execgetuserbytoken")
	public String execGetUserByToken(String p_token) {
		return servSecLoginToken.execGetUserByToken(p_token) ;
	}

}
