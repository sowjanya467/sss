package com.todo.user.dto;

import java.io.Serializable;

import org.springframework.stereotype.Service;

/*************************************************************************************************************
 *
 * purpose:Mail dto
 * 
 * @author sowjanya467
 * @version 1.0
 * @since 10-07-18
 *
 **************************************************************************************************/
@Service
public class MailModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String toMailAddress;

	private String subject;

	private String body;

	public String getToMailAddress() {
		return toMailAddress;
	}

	public void setToMailAddress(String toMailAddress) {
		this.toMailAddress = toMailAddress;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "MailModel [toMailAddress=" + toMailAddress + ", subject=" + subject + ", body=" + body + "]";
	}

}
