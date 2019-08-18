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
 * TweetsTweets
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-17T18:27:50.720Z")

public class TweetsTweets   {
  @JsonProperty("hashtag")
  private String hashtag = null;

  @JsonProperty("lang")
  private String lang = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("dayHour")
  private Integer dayHour = null;

  public TweetsTweets hashtag(String hashtag) {
    this.hashtag = hashtag;
    return this;
  }

  /**
   * Get hashtag
   * @return hashtag
  **/
  @ApiModelProperty(value = "")


  public String getHashtag() {
    return hashtag;
  }

  public void setHashtag(String hashtag) {
    this.hashtag = hashtag;
  }

  public TweetsTweets lang(String lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
  **/
  @ApiModelProperty(value = "")


  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public TweetsTweets location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public TweetsTweets count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public TweetsTweets dayHour(Integer dayHour) {
    this.dayHour = dayHour;
    return this;
  }

  /**
   * Get dayHour
   * @return dayHour
  **/
  @ApiModelProperty(value = "")


  public Integer getDayHour() {
    return dayHour;
  }

  public void setDayHour(Integer dayHour) {
    this.dayHour = dayHour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetsTweets tweetsTweets = (TweetsTweets) o;
    return Objects.equals(this.hashtag, tweetsTweets.hashtag) &&
        Objects.equals(this.lang, tweetsTweets.lang) &&
        Objects.equals(this.location, tweetsTweets.location) &&
        Objects.equals(this.count, tweetsTweets.count) &&
        Objects.equals(this.dayHour, tweetsTweets.dayHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashtag, lang, location, count, dayHour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetsTweets {\n");
    
    sb.append("    hashtag: ").append(toIndentedString(hashtag)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    dayHour: ").append(toIndentedString(dayHour)).append("\n");
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

