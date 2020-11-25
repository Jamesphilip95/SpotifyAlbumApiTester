package jp.DTO;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "artists",
        "disc_number",
        "duration_ms",
        "explicit",
        "external_urls",
        "href",
        "id",
        "is_local",
        "is_playable",
        "name",
        "preview_url",
        "track_number",
        "type",
        "uri"
})
public class Item_ {

    @JsonProperty("artists")
    private List<Artist_> artists = null;
    @JsonProperty("disc_number")
    private Integer discNumber;
    @JsonProperty("duration_ms")
    private Integer durationMs;
    @JsonProperty("explicit")
    private Boolean explicit;
    @JsonProperty("external_urls")
    private ExternalUrls___ externalUrls;
    @JsonProperty("href")
    private String href;
    @JsonProperty("id")
    private String id;
    @JsonProperty("is_local")
    private Boolean isLocal;
    @JsonProperty("is_playable")
    private Boolean isPlayable;
    @JsonProperty("name")
    private String name;
    @JsonProperty("preview_url")
    private String previewUrl;
    @JsonProperty("track_number")
    private Integer trackNumber;
    @JsonProperty("type")
    private String type;
    @JsonProperty("uri")
    private String uri;

    /**
     * No args constructor for use in serialization
     *
     */
    public Item_() {
    }

    /**
     *
     * @param isPlayable
     * @param previewUrl
     * @param trackNumber
     * @param externalUrls
     * @param type
     * @param uri
     * @param isLocal
     * @param explicit
     * @param discNumber
     * @param artists
     * @param name
     * @param href
     * @param id
     * @param durationMs
     */
    public Item_(List<Artist_> artists, Integer discNumber, Integer durationMs, Boolean explicit, ExternalUrls___ externalUrls, String href, String id, Boolean isLocal, Boolean isPlayable, String name, String previewUrl, Integer trackNumber, String type, String uri) {
        super();
        this.artists = artists;
        this.discNumber = discNumber;
        this.durationMs = durationMs;
        this.explicit = explicit;
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.isLocal = isLocal;
        this.isPlayable = isPlayable;
        this.name = name;
        this.previewUrl = previewUrl;
        this.trackNumber = trackNumber;
        this.type = type;
        this.uri = uri;
    }

    @JsonProperty("artists")
    public List<Artist_> getArtists() {
        return artists;
    }

    @JsonProperty("artists")
    public void setArtists(List<Artist_> artists) {
        this.artists = artists;
    }

    public Item_ withArtists(List<Artist_> artists) {
        this.artists = artists;
        return this;
    }

    @JsonProperty("disc_number")
    public Integer getDiscNumber() {
        return discNumber;
    }

    @JsonProperty("disc_number")
    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    public Item_ withDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
        return this;
    }

    @JsonProperty("duration_ms")
    public Integer getDurationMs() {
        return durationMs;
    }

    @JsonProperty("duration_ms")
    public void setDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
    }

    public Item_ withDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    @JsonProperty("explicit")
    public Boolean getExplicit() {
        return explicit;
    }

    @JsonProperty("explicit")
    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
    }

    public Item_ withExplicit(Boolean explicit) {
        this.explicit = explicit;
        return this;
    }

    @JsonProperty("external_urls")
    public ExternalUrls___ getExternalUrls() {
        return externalUrls;
    }

    @JsonProperty("external_urls")
    public void setExternalUrls(ExternalUrls___ externalUrls) {
        this.externalUrls = externalUrls;
    }

    public Item_ withExternalUrls(ExternalUrls___ externalUrls) {
        this.externalUrls = externalUrls;
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

    public Item_ withHref(String href) {
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

    public Item_ withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("is_local")
    public Boolean getIsLocal() {
        return isLocal;
    }

    @JsonProperty("is_local")
    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    public Item_ withIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
        return this;
    }

    @JsonProperty("is_playable")
    public Boolean getIsPlayable() {
        return isPlayable;
    }

    @JsonProperty("is_playable")
    public void setIsPlayable(Boolean isPlayable) {
        this.isPlayable = isPlayable;
    }

    public Item_ withIsPlayable(Boolean isPlayable) {
        this.isPlayable = isPlayable;
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

    public Item_ withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("preview_url")
    public String getPreviewUrl() {
        return previewUrl;
    }

    @JsonProperty("preview_url")
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public Item_ withPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    @JsonProperty("track_number")
    public Integer getTrackNumber() {
        return trackNumber;
    }

    @JsonProperty("track_number")
    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Item_ withTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
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

    public Item_ withType(String type) {
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

    public Item_ withUri(String uri) {
        this.uri = uri;
        return this;
    }

}
