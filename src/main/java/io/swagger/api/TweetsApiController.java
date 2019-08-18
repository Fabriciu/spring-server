package io.swagger.api;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.dao.TweetsHashtagRepository;
import io.swagger.dao.TweetsHourRepository;
import io.swagger.dao.model.TweetsHashtag;
import io.swagger.dao.model.TweetsHour;
import io.swagger.model.Tweets;
import io.swagger.model.TweetsTweets;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-17T18:27:50.720Z")

@Controller
public class TweetsApiController implements TweetsApi {

    private static final Logger log = LoggerFactory.getLogger(TweetsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    TweetsHashtagRepository tweetsHashtagRepository;
    
    @Autowired
    TweetsHourRepository tweetsHourRepository;
    
    @org.springframework.beans.factory.annotation.Autowired
    public TweetsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Tweets> tweetsCountGet(@NotNull @ApiParam(value = "Filtro", required = true, allowableValues = "perHour, perHashtagLangAndLocation") @Valid @RequestParam(value = "filter", required = true) String filter) {
        
    	if(filter.equals("perHour")) {
    		List<TweetsHour> tweetsPerHour = tweetsHourRepository.findAll();
    		
    		List<TweetsTweets> tweetsTweets = new ArrayList<TweetsTweets>();
    		
    		for(TweetsHour tweetsIndex : tweetsPerHour) {
    			TweetsTweets tweet = new TweetsTweets();
    			tweet.setCount(tweetsIndex.getTweets());
    			tweet.setDayHour(tweetsIndex.getDayHour());
    			tweetsTweets.add(tweet);
    		}
    		
    		Tweets tweets = new Tweets();
    		tweets.setTweets(tweetsTweets);
    		
    		return new ResponseEntity<Tweets>(tweets, HttpStatus.OK);
    		
    	} else {
    		List<TweetsHashtag> tweetsPerHashtag = tweetsHashtagRepository.findAll();
    		
    		List<TweetsTweets> tweetsTweets = new ArrayList<TweetsTweets>();
    		
    		for(TweetsHashtag tweetsIndex : tweetsPerHashtag) {
    			TweetsTweets tweet = new TweetsTweets();
    			tweet.setCount(tweetsIndex.getTweets());
    			tweet.setHashtag(tweetsIndex.getHashtag());
    			tweet.setLang(tweetsIndex.getLang());
    			tweet.setLocation(tweetsIndex.getUser_location());
    			tweetsTweets.add(tweet);
    		}
    		
    		Tweets tweets = new Tweets();
    		tweets.setTweets(tweetsTweets);
    		
    		return new ResponseEntity<Tweets>(tweets, HttpStatus.OK);
    	}
    	
    }

}
