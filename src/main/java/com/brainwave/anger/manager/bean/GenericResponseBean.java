/**
 * 
 */
package com.brainwave.anger.manager.bean;

import java.util.List;

import com.brainwave.anger.manager.constants.AngerManagerConstants;

/**
 * @author kutesneh
 *
 */
public class GenericResponseBean {
	
	private Long uniqueId;
	private Integer code;
	private String displayMessages;
	private List<String> technicalMessages;
	private AngerManagerConstants.EVENT event;
	private AngerManagerConstants.STATUS status;
	/**
	 * @return the uniqueId
	 */
	public Long getUniqueId() {
		return uniqueId;
	}
	/**
	 * @param uniqueId the uniqueId to set
	 */
	public void setUniqueId(Long uniqueId) {
		this.uniqueId = uniqueId;
	}
	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}
	/**
	 * @return the displayMessages
	 */
	public String getDisplayMessages() {
		return displayMessages;
	}
	/**
	 * @param displayMessages the displayMessages to set
	 */
	public void setDisplayMessages(String displayMessages) {
		this.displayMessages = displayMessages;
	}
	/**
	 * @return the technicalMessages
	 */
	public List<String> getTechnicalMessages() {
		return technicalMessages;
	}
	/**
	 * @param technicalMessages the technicalMessages to set
	 */
	public void setTechnicalMessages(List<String> technicalMessages) {
		this.technicalMessages = technicalMessages;
	}
	/**
	 * @return the event
	 */
	public AngerManagerConstants.EVENT getEvent() {
		return event;
	}
	/**
	 * @param event the event to set
	 */
	public void setEvent(AngerManagerConstants.EVENT event) {
		this.event = event;
	}
	/**
	 * @return the status
	 */
	public AngerManagerConstants.STATUS getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(AngerManagerConstants.STATUS status) {
		this.status = status;
	}

	
	
}
