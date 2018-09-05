/**
 * 
 */
package com.brainwave.anger.manager.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author kutesneh
 *
 */
@Entity
public class Registration {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USR_SEQ")
    @SequenceGenerator(sequenceName = "user_seq", allocationSize = 1, name = "USR_SEQ")
    private Long id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String phoneCountryCode;
	private String phoneNumber;
	private char isTermsAndConditionsAgreed;
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
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
	public char getIsTermsAndConditionsAgreed() {
		return isTermsAndConditionsAgreed;
	}
	/**
	 * @param isTermsAndConditionsAgreed the isTermsAndConditionsAgreed to set
	 */
	public void setIsTermsAndConditionsAgreed(char isTermsAndConditionsAgreed) {
		this.isTermsAndConditionsAgreed = isTermsAndConditionsAgreed;
	}
	/**
	 * @return the isTermsAndConditionsAgreed
	 *//*
	public Boolean getIsTermsAndConditionsAgreed() {
		return isTermsAndConditionsAgreed;
	}
	*//**
	 * @param isTermsAndConditionsAgreed the isTermsAndConditionsAgreed to set
	 *//*
	public void setIsTermsAndConditionsAgreed(Boolean isTermsAndConditionsAgreed) {
		this.isTermsAndConditionsAgreed = isTermsAndConditionsAgreed;
	}*/
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
