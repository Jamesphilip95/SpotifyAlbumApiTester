package jp.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "spotify"
})
public class ExternalUrls___ {

    @JsonProperty("spotify")
    private String spotify;

    /**
     * No args constructor for use in serialization
     *
     */
    public ExternalUrls___() {
    }

    /**
     *
     * @param spotify
     */
    public ExternalUrls___(String spotify) {
        super();
        this.spotify = spotify;
    }

    @JsonProperty("spotify")
    public String getSpotify() {
        return spotify;
    }

    @JsonProperty("spotify")
    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }

    public ExternalUrls___ withSpotify(String spotify) {
        this.spotify = spotify;
        return this;
    }

}