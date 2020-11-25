package jp.DTO;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "href",
        "items",
        "limit",
        "next",
        "offset",
        "previous",
        "total"
})
public class Albums {

    @JsonProperty("href")
    private String href;
    @JsonProperty("items")
    private List<Item> items = null;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("next")
    private String next;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("previous")
    private String previous;
    @JsonProperty("total")
    private Integer total;

    /**
     * No args constructor for use in serialization
     *
     */
    public Albums() {
    }

    /**
     *
     * @param next
     * @param total
     * @param offset
     * @param previous
     * @param limit
     * @param href
     * @param items
     */
    public Albums(String href, List<Item> items, Integer limit, String next, Integer offset, String previous, Integer total) {
        super();
        this.href = href;
        this.items = items;
        this.limit = limit;
        this.next = next;
        this.offset = offset;
        this.previous = previous;
        this.total = total;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    public Albums withHref(String href) {
        this.href = href;
        return this;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Albums withItems(List<Item> items) {
        this.items = items;
        return this;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Albums withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    @JsonProperty("next")
    public String getNext() {
        return next;
    }

    @JsonProperty("next")
    public void setNext(String next) {
        this.next = next;
    }

    public Albums withNext(String next) {
        this.next = next;
        return this;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Albums withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    @JsonProperty("previous")
    public String getPrevious() {
        return previous;
    }

    @JsonProperty("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public Albums withPrevious(String previous) {
        this.previous = previous;
        return this;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Albums withTotal(Integer total) {
        this.total = total;
        return this;
    }

}