package com.walkingtree.service;

import org.springframework.stereotype.Service;

import com.walkingtree.model.UserModel;

@Service
public interface UserService {

	public UserModel saveUserInMysql(UserModel user);
	public UserModel saveUserInElasticSearch(UserModel user);
	public UserModel getUserFromMysql(long id);
	public UserModel getUserFromElasticSearch(long id);
	public String sendUserToKafka(UserModel user) ;
}
