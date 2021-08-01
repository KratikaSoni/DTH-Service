package com.dthService.dthService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dthService.dthService.dao.ChannelRepository;
import com.dthService.dthService.dao.UserChannelMappingRepository;
import com.dthService.dthService.dao.UserRepositiory;
import com.dthService.dthService.model.Channel;
import com.dthService.dthService.model.User;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	UserRepositiory userRepositiory;
	
	@Autowired
	ChannelRepository channelRepository;
	
	@Autowired
	 UserChannelMappingRepository  userChannelMappingRepository;
	
	@Override
	public User addUser(User user) {
		
		return userRepositiory.save(user);
	}
	
	public List<Channel> getSubscribedChannelList(Long userId){
		
		return channelRepository.findAllById(userChannelMappingRepository.findByUserId(userId));
	}

	@Override
	public double getMonthBill(Long user_id) {
		
		List<Channel> lis=channelRepository.findAllById(userChannelMappingRepository.findByUserId(user_id));
		return lis.stream().mapToDouble(l->l.getPrice()).sum();
	}
	

}
