package io.htfeeds.repository;

import org.springframework.data.repository.CrudRepository;

import io.htfeeds.entity.User;

/**
 * @author HTFeeds
 *
 * Oct 23, 2018
 */
public interface IUserRepository extends CrudRepository<User, Integer> {

}
