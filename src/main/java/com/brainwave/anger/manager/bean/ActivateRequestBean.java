/**
 * 
 */
package com.brainwave.anger.manager.bean;

/**
 * @author kutesneh
 *
 */
public class ActivateRequestBean {
	
	private String email;
	private String activationCode;
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the activationCode
	 */
	public String getActivationCode() {
		return activationCode;
	}
	/**
	 * @param activationCode the activationCode to set
	 */
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}
		
}
