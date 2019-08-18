package io.swagger.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.swagger.dao.model.TweetsHour;

public interface TweetsHourRepository extends MongoRepository<TweetsHour, String> {

}
