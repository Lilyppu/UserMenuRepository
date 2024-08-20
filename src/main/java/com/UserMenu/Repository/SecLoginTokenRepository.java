package com.UserMenu.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.UserMenu.Models.SecLoginToken;

@Repository
public interface SecLoginTokenRepository extends JpaRepository<SecLoginToken, Integer>{
	
	@Procedure(procedureName = "P_SEC_DEL_TOKEN")
	public String runDelToken(String p_user_id);	
	
	@Procedure(procedureName = "P_SEC_GEN_TOKEN")
	public String runGenToken(String p_user_id);	
	
	@Procedure(procedureName = "P_SEC_GET_USER_BY_TOKEN")
	public String runGetUserByToken(String p_token, Integer pout_user_id);	

}
