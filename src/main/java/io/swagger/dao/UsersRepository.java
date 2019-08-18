package io.swagger.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.swagger.dao.model.MostFollowedUsers;

public interface UsersRepository extends MongoRepository<MostFollowedUsers, String> {}
