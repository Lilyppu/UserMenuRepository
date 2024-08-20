package com.UserMenu.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import com.UserMenu.Repository.SecLoginTokenRepository;

@Service
public class ServiceSecLoginToken {
	@Autowired
	SecLoginTokenRepository repoSecLoginToken;
	
	public String execDelToken(String p_user_id) {
		return repoSecLoginToken.runDelToken(p_user_id);		
	}
	
	public String execGenToken(String p_user_id) {
		return repoSecLoginToken.runGenToken(p_user_id);		
	}
	
	public String execGetUserByToken(String p_token) {
		return repoSecLoginToken.runGetUserByToken(p_token);		
	}

}
