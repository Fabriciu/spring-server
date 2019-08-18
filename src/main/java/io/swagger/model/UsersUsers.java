package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UsersUsers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-17T18:27:50.720Z")

public class UsersUsers   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("screen_name")
  private String screenName = null;

  @JsonProperty("followers")
  private Integer followers = null;

  public UsersUsers id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UsersUsers name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UsersUsers screenName(String screenName) {
    this.screenName = screenName;
    return this;
  }

  /**
   * Get screenName
   * @return screenName
  **/
  @ApiModelProperty(value = "")


  public String getScreenName() {
    return screenName;
  }

  public void setScreenName(String screenName) {
    this.screenName = screenName;
  }

  public UsersUsers followers(Integer followers) {
    this.followers = followers;
    return this;
  }

  /**
   * Get followers
   * @return followers
  **/
  @ApiModelProperty(value = "")


  public Integer getFollowers() {
    return followers;
  }

  public void setFollowers(Integer followers) {
    this.followers = followers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersUsers usersUsers = (UsersUsers) o;
    return Objects.equals(this.id, usersUsers.id) &&
        Objects.equals(this.name, usersUsers.name) &&
        Objects.equals(this.screenName, usersUsers.screenName) &&
        Objects.equals(this.followers, usersUsers.followers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, screenName, followers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersUsers {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    screenName: ").append(toIndentedString(screenName)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

