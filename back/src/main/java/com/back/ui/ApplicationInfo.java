package com.back.ui;


import javax.annotation.ManagedBean;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@ManagedBean
@Scope("session")
public class ApplicationInfo {

	
	private String text = "hello Mehdi dzdezde";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	} 
}
