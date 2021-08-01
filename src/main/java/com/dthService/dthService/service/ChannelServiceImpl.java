package com.dthService.dthService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dthService.dthService.dao.ChannelRepository;
import com.dthService.dthService.dao.UserChannelMappingRepository;
import com.dthService.dthService.model.Channel;
import com.dthService.dthService.model.UserChannelMapping;

@Service
public class ChannelServiceImpl implements ChannelService{

	@Autowired
	ChannelRepository channelRepository;
	
	
	@Autowired
	 UserChannelMappingRepository  userChannelMappingRepository;
	
	@Override
	public List<Channel> getChannels() {
		return channelRepository.findAll();
	}
	
	@Override
	public Channel getChannelByName(String name) {
		return channelRepository.findByName(name);
	}

	@Override
	public Channel addChannel(Channel channel) {
		if(channelRepository.findByName(channel.getName())==null) {
		return channelRepository.save(channel);
		}
		
		return channelRepository.findByName(channel.getName());
	}

	@Override
	public void suscribeChannel(Long user_id, String name) {
		UserChannelMapping userChannelMapping= 
				new UserChannelMapping(user_id,channelRepository.findByName(name).getId());
		
		userChannelMappingRepository.save(userChannelMapping);
	}
	
	@Override
	public void unSuscribeChannel(Long user_id, String name) {
		
		UserChannelMapping userChannelMapping= 
				new UserChannelMapping(user_id,channelRepository.findByName(name).getId());
		
		userChannelMappingRepository.delete(userChannelMapping);
	}

	@Override
	public List<Channel> getChannels(Long user_id) {
		// TODO Auto-generated method stub
		return null;
	}
}
