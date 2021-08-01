package com.dthService.dthService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dthService.dthService.model.Channel;
import com.dthService.dthService.service.ChannelService;
import com.dthService.dthService.service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private ChannelService channelService;
	@Autowired
	private UserService userService;
	
	//get List of channels
	@GetMapping("/allChannels")
	public List<Channel> getChannels(){
		
		return channelService.getChannels();
	}
	
	//get channel by name
	@GetMapping("/channels/{name}")
	public Channel getChannel(@PathVariable String name ){
		
		return this.channelService.getChannelByName(name);
		
	}
	//subscribe for a channel
	@PutMapping("/subscribe/{name}")
	public String susbcribeChannel(@PathVariable String name ){
		Long user_id=(long) 1;
		 this.channelService.suscribeChannel(user_id,name);
		 return name+" Susbcribed Successfully";
	}
	
	//UnSuscribe for a channel
	@DeleteMapping("/unSubscribe/{name}")
	public String unSusbcribeChannel(@PathVariable String name ){
		Long user_id=(long) 1;
		this.channelService.unSuscribeChannel(user_id,name);
		return name+" unSusbcribed Successfully";
	}
	
	
	//get list of Subscribe channels
	@GetMapping("/suscribedChannels")
	public List<Channel> getsuscribedChannels(){
		Long user_id=(long) 1;
		return userService.getSubscribedChannelList(user_id);
	}
	
	//get bill of Subscribed channels
	@PostMapping("/monthlBill")
	public String  getMonthBill(){
		Long user_id=(long) 1;
		return "Month Bill is: "+userService.getMonthBill(user_id);
	}


}
