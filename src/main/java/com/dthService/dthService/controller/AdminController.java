package com.dthService.dthService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dthService.dthService.model.Channel;
import com.dthService.dthService.model.User;
import com.dthService.dthService.service.ChannelService;
import com.dthService.dthService.service.UserService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private ChannelService channelService;
	@Autowired
	private UserService userService;
	
	//Save New channels
	@PostMapping("/saveChannel")
	public Channel addChannel(@RequestBody Channel channel){
		return channelService.addChannel(channel);
	} 
	
	//get List of channels
	@GetMapping("/channels")
	public List<Channel> getChannels(){
		
		return channelService.getChannels();
	}
	
	//Save New Users
	@PostMapping("/saveUser")
	public String addUser(@RequestBody User user){
		
		userService.addUser(user);
		return "User Saved";
		
	} 
	
	
}
