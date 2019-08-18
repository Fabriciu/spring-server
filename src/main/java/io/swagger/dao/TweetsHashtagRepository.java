package io.swagger.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.swagger.dao.model.TweetsHashtag;

public interface TweetsHashtagRepository extends MongoRepository<TweetsHashtag, String>{

}
