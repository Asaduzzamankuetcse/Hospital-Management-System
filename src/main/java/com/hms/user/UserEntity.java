package com.hms.user;

import java.beans.Transient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name="hms_tb_s_user")
public class UserEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter
	@Setter 
	private int userId;
	@Getter
	@Setter
	private String username;
	@Getter
	@Setter
	private String password;
	public UserEntity() {
		//super();
	}
	public UserEntity(String username, String password) {
		//super();
		this.username = username;
		this.password = password;
	}
	
	
	
	
}
