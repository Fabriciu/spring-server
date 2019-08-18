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
import io.swagger.dao.UsersRepository;
import io.swagger.dao.model.MostFollowedUsers;
import io.swagger.model.Users;
import io.swagger.model.UsersUsers;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-17T18:27:50.720Z")

@Controller
public class UsersApiController implements UsersApi {

	private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	private UsersRepository usersRepository;

	@org.springframework.beans.factory.annotation.Autowired
	public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Users> usersMostFollowedGet(@NotNull @ApiParam(value = "Quantidade de usuários a retornar", required = true) @Valid @RequestParam(value = "count", required = true) Integer count) {

		List<MostFollowedUsers> mostFollowedUsers = usersRepository.findAll(); 

		List<UsersUsers> usersUsers = new ArrayList<UsersUsers>();

		int items = 0;

		for(MostFollowedUsers usersIndex : mostFollowedUsers) {
			if(items < count) {
				UsersUsers user = new UsersUsers();
				user.setId(usersIndex.getId());
				user.setName(usersIndex.getUser_name());
				user.setScreenName(usersIndex.getUser_screen_name());
				user.setFollowers(usersIndex.getUser_followers_count());
				usersUsers.add(user);
				items++;
			}
		}

		Users users = new Users();
		users.setUsers(usersUsers);

		return new ResponseEntity<Users>(users, HttpStatus.OK);

	}

}
