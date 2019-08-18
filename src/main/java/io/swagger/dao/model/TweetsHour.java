package io.swagger.dao.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Document(collection = "tweetsPerHour")
public class TweetsHour {

	@Id
	private String id;
	private int dayHour;
	private int tweets;
	
}
