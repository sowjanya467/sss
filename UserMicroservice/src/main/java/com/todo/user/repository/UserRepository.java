package com.todo.user.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.todo.user.model.User;

/*************************************************************************************************************
 *
 * purpose:User repository that extends mongo repository
 * 
 * @author sowjanya467
 * @version 1.0
 * @since 10-07-18
 *
 **************************************************************************************************/

@Repository
public interface UserRepository extends MongoRepository<User, String> 
{
	public Optional<User> findByEmailId(String emailId);

}
