package com.dthService.dthService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserChannelMapping {
	
	
	@Id
	@GeneratedValue
	private long id;
	

	private Long userId;
	
	private long channelId;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public long getChannelId() {
		return channelId;
	}

	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}

	public UserChannelMapping(long id, Long userId, long channelId) {
		super();
		this.id = id;
		this.userId = userId;
		this.channelId = channelId;
	}
	
	public UserChannelMapping(Long userId, long channelId) {
		this.userId = userId;
		this.channelId = channelId;
	}

	public UserChannelMapping() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
