package jp.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "external_urls",
        "href",
        "id",
        "name",
        "type",
        "uri"
})
public class Artist {

    @JsonProperty("external_urls")
    private ExternalUrls externalUrls;
    @JsonProperty("href")
    private String href;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("uri")
    private String uri;

    /**
     * No args constructor for use in serialization
     *
     */
    public Artist() {
    }

    /**
     *
     * @param name
     * @param externalUrls
     * @param href
     * @param id
     * @param type
     * @param uri
     */
    public Artist(ExternalUrls externalUrls, String href, String id, String name, String type, String uri) {
        super();
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.name = name;
        this.type = type;
        this.uri = uri;
    }

    @JsonProperty("external_urls")
    public ExternalUrls getExternalUrls() {
        return externalUrls;
    }

    @JsonProperty("external_urls")
    public void setExternalUrls(ExternalUrls externalUrls) {
        this.externalUrls = externalUrls;
    }

    public Artist withExternalUrls(ExternalUrls externalUrls) {
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

    public Artist withHref(String href) {
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

    public Artist withId(String id) {
        this.id = id;
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

    public Artist withName(String name) {
        this.name = name;
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

    public Artist withType(String type) {
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

    public Artist withUri(String uri) {
        this.uri = uri;
        return this;
    }

}
