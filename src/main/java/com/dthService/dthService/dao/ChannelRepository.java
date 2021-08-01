package com.dthService.dthService.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.dthService.dthService.model.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
	
	@Query("select c from Channel c where c.name = ?1")
	  Channel findByName(String name);
}
