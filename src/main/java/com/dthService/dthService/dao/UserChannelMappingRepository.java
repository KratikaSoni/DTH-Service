package com.dthService.dthService.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dthService.dthService.model.UserChannelMapping;

public interface UserChannelMappingRepository extends JpaRepository<UserChannelMapping, Long> {

	
	@Query("select u.channelId from UserChannelMapping u where u.userId = ?1")
	List<Long> findByUserId(Long userId);

}
