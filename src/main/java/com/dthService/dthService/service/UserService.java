package com.dthService.dthService.service;

import java.util.List;

import com.dthService.dthService.model.Channel;
import com.dthService.dthService.model.User;

public interface UserService {

	public User addUser(User user);

	public List<Channel> getSubscribedChannelList(Long user_id);

	public double getMonthBill(Long user_id);
	
}
