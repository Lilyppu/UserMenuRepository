package com.UserMenu.Models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SEC_LOGIN_TOKEN")
public class SecLoginToken {
	
	@Id
	@Column(name="USER_ID", length=20)
	private String sltUserId;
	
	@Column(name="TOKEN", length=50)
	private String sltToken;
	
	@Column (name="EXP_DATETIME")
	private Date sltExpDateTime;	

}
