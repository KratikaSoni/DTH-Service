package com.dthService.dthService.service;

import java.util.List;

import com.dthService.dthService.model.Channel;

public interface ChannelService {
	
	public List<Channel> getChannels();

	public Channel getChannelByName(String name);

	public Channel addChannel(Channel channel);

	public void suscribeChannel(Long user_id, String name);

	public void unSuscribeChannel(Long user_id, String name);

	public List<Channel> getChannels(Long user_id);

}
