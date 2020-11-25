package jp.DTO;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "album_type",
        "artists",
        "copyrights",
        "external_ids",
        "external_urls",
        "genres",
        "href",
        "id",
        "images",
        "label",
        "name",
        "popularity",
        "release_date",
        "release_date_precision",
        "total_tracks",
        "tracks",
        "type",
        "uri"
})
public class Album {

    @JsonProperty("album_type")
    private String albumType;
    @JsonProperty("artists")
    private List<Artist> artists = null;
    @JsonProperty("copyrights")
    private List<Copyright> copyrights = null;
    @JsonProperty("external_ids")
    private ExternalIds externalIds;
    @JsonProperty("external_urls")
    private ExternalUrls_ externalUrls;
    @JsonProperty("genres")
    private List<Object> genres = null;
    @JsonProperty("href")
    private String href;
    @JsonProperty("id")
    private String id;
    @JsonProperty("images")
    private List<Image> images = null;
    @JsonProperty("label")
    private String label;
    @JsonProperty("name")
    private String name;
    @JsonProperty("popularity")
    private Integer popularity;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("release_date_precision")
    private String releaseDatePrecision;
    @JsonProperty("total_tracks")
    private Integer totalTracks;
    @JsonProperty("tracks")
    private Tracks tracks;
    @JsonProperty("type")
    private String type;
    @JsonProperty("uri")
    private String uri;

    /**
     * No args constructor for use in serialization
     *
     */
    public Album() {
    }

    /**
     *
     * @param images
     * @param copyrights
     * @param releaseDate
     * @param externalIds
     * @param externalUrls
     * @param label
     * @param type
     * @param uri
     * @param tracks
     * @param artists
     * @param totalTracks
     * @param genres
     * @param albumType
     * @param popularity
     * @param name
     * @param releaseDatePrecision
     * @param href
     * @param id
     */
    public Album(String albumType, List<Artist> artists, List<Copyright> copyrights, ExternalIds externalIds, ExternalUrls_ externalUrls, List<Object> genres, String href, String id, List<Image> images, String label, String name, Integer popularity, String releaseDate, String releaseDatePrecision, Integer totalTracks, Tracks tracks, String type, String uri) {
        super();
        this.albumType = albumType;
        this.artists = artists;
        this.copyrights = copyrights;
        this.externalIds = externalIds;
        this.externalUrls = externalUrls;
        this.genres = genres;
        this.href = href;
        this.id = id;
        this.images = images;
        this.label = label;
        this.name = name;
        this.popularity = popularity;
        this.releaseDate = releaseDate;
        this.releaseDatePrecision = releaseDatePrecision;
        this.totalTracks = totalTracks;
        this.tracks = tracks;
        this.type = type;
        this.uri = uri;
    }

    @JsonProperty("album_type")
    public String getAlbumType() {
        return albumType;
    }

    @JsonProperty("album_type")
    public void setAlbumType(String albumType) {
        this.albumType = albumType;
    }

    public Album withAlbumType(String albumType) {
        this.albumType = albumType;
        return this;
    }

    @JsonProperty("artists")
    public List<Artist> getArtists() {
        return artists;
    }

    @JsonProperty("artists")
    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Album withArtists(List<Artist> artists) {
        this.artists = artists;
        return this;
    }

    @JsonProperty("copyrights")
    public List<Copyright> getCopyrights() {
        return copyrights;
    }

    @JsonProperty("copyrights")
    public void setCopyrights(List<Copyright> copyrights) {
        this.copyrights = copyrights;
    }

    public Album withCopyrights(List<Copyright> copyrights) {
        this.copyrights = copyrights;
        return this;
    }

    @JsonProperty("external_ids")
    public ExternalIds getExternalIds() {
        return externalIds;
    }

    @JsonProperty("external_ids")
    public void setExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
    }

    public Album withExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
        return this;
    }

    @JsonProperty("external_urls")
    public ExternalUrls_ getExternalUrls() {
        return externalUrls;
    }

    @JsonProperty("external_urls")
    public void setExternalUrls(ExternalUrls_ externalUrls) {
        this.externalUrls = externalUrls;
    }

    public Album withExternalUrls(ExternalUrls_ externalUrls) {
        this.externalUrls = externalUrls;
        return this;
    }

    @JsonProperty("genres")
    public List<Object> getGenres() {
        return genres;
    }

    @JsonProperty("genres")
    public void setGenres(List<Object> genres) {
        this.genres = genres;
    }

    public Album withGenres(List<Object> genres) {
        this.genres = genres;
        return this;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    public Album withHref(String href) {
        this.href = href;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Album withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Album withImages(List<Image> images) {
        this.images = images;
        return this;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public Album withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Album withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("popularity")
    public Integer getPopularity() {
        return popularity;
    }

    @JsonProperty("popularity")
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Album withPopularity(Integer popularity) {
        this.popularity = popularity;
        return this;
    }

    @JsonProperty("release_date")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("release_date")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Album withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    @JsonProperty("release_date_precision")
    public String getReleaseDatePrecision() {
        return releaseDatePrecision;
    }

    @JsonProperty("release_date_precision")
    public void setReleaseDatePrecision(String releaseDatePrecision) {
        this.releaseDatePrecision = releaseDatePrecision;
    }

    public Album withReleaseDatePrecision(String releaseDatePrecision) {
        this.releaseDatePrecision = releaseDatePrecision;
        return this;
    }

    @JsonProperty("total_tracks")
    public Integer getTotalTracks() {
        return totalTracks;
    }

    @JsonProperty("total_tracks")
    public void setTotalTracks(Integer totalTracks) {
        this.totalTracks = totalTracks;
    }

    public Album withTotalTracks(Integer totalTracks) {
        this.totalTracks = totalTracks;
        return this;
    }

    @JsonProperty("tracks")
    public Tracks getTracks() {
        return tracks;
    }

    @JsonProperty("tracks")
    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    public Album withTracks(Tracks tracks) {
        this.tracks = tracks;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Album withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    public Album withUri(String uri) {
        this.uri = uri;
        return this;
    }

}






