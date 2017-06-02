package com.hms.configuration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="hms_tb_s_settings")
public class SettingsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter
	@Setter
	private Integer settingsId;
	@Getter
	@Setter
	private String name;
	
	public SettingsEntity() {
		//super();
	}

	public SettingsEntity(String name) {
		//super();
		this.name = name;
	}
	
	

}
