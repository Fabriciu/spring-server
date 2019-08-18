package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TweetsTweets;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Tweets
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-17T18:27:50.720Z")

public class Tweets   {
  @JsonProperty("tweets")
  @Valid
  private List<TweetsTweets> tweets = null;

  public Tweets tweets(List<TweetsTweets> tweets) {
    this.tweets = tweets;
    return this;
  }

  public Tweets addTweetsItem(TweetsTweets tweetsItem) {
    if (this.tweets == null) {
      this.tweets = new ArrayList<TweetsTweets>();
    }
    this.tweets.add(tweetsItem);
    return this;
  }

  /**
   * Get tweets
   * @return tweets
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<TweetsTweets> getTweets() {
    return tweets;
  }

  public void setTweets(List<TweetsTweets> tweets) {
    this.tweets = tweets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tweets tweets = (Tweets) o;
    return Objects.equals(this.tweets, tweets.tweets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tweets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tweets {\n");
    
    sb.append("    tweets: ").append(toIndentedString(tweets)).append("\n");
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

