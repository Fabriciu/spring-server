package io.swagger.dao.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Document(collection = "mostFollowedUsers")
public class MostFollowedUsers {

	@Id
	private String id;
	private String user_id;
	private String user_name;
	private String user_screen_name;
	private int user_followers_count;
	
}
