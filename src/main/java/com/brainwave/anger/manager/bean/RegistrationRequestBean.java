/**
 * 
 */
package com.brainwave.anger.manager.bean;

/**
 * @author kutesneh
 *
 */
public class RegistrationRequestBean {
	
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String phoneCountryCode;
	private String phoneNumber;
	private boolean isTermsAndConditionsAgreed;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the isTermsAndConditionsAgreed
	 */
	public boolean isTermsAndConditionsAgreed() {
		return isTermsAndConditionsAgreed;
	}
	/**
	 * @param isTermsAndConditionsAgreed the isTermsAndConditionsAgreed to set
	 */
	public void setTermsAndConditionsAgreed(boolean isTermsAndConditionsAgreed) {
		this.isTermsAndConditionsAgreed = isTermsAndConditionsAgreed;
	}
	/**
	 * @return the phoneCountryCode
	 */
	public String getPhoneCountryCode() {
		return phoneCountryCode;
	}
	/**
	 * @param phoneCountryCode the phoneCountryCode to set
	 */
	public void setPhoneCountryCode(String phoneCountryCode) {
		this.phoneCountryCode = phoneCountryCode;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
