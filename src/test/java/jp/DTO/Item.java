package jp.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "added_at",
        "album"
})
public class Item {

    @JsonProperty("added_at")
    private String addedAt;
    @JsonProperty("album")
    private Album album;

    /**
     * No args constructor for use in serialization
     *
     */
    public Item() {
    }

    /**
     *
     * @param addedAt
     * @param album
     */
    public Item(String addedAt, Album album) {
        super();
        this.addedAt = addedAt;
        this.album = album;
    }

    @JsonProperty("added_at")
    public String getAddedAt() {
        return addedAt;
    }

    @JsonProperty("added_at")
    public void setAddedAt(String addedAt) {
        this.addedAt = addedAt;
    }

    public Item withAddedAt(String addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    @JsonProperty("album")
    public Album getAlbum() {
        return album;
    }

    @JsonProperty("album")
    public void setAlbum(Album album) {
        this.album = album;
    }

    public Item withAlbum(Album album) {
        this.album = album;
        return this;
    }

}
