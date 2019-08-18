package io.swagger.dao.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Document(collection = "tweetsPerLangAndLocation")
public class TweetsHashtag {

	@Id
	private String id;
	private String hashtag;
	private int tweets;
	private String lang;
	private String user_location;
	
}
