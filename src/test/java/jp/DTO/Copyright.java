
package jp.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "text",
        "type"
})
public class Copyright {

    @JsonProperty("text")
    private String text;
    @JsonProperty("type")
    private String type;

    /**
     * No args constructor for use in serialization
     *
     */
    public Copyright() {
    }

    /**
     *
     * @param text
     * @param type
     */
    public Copyright(String text, String type) {
        super();
        this.text = text;
        this.type = type;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public Copyright withText(String text) {
        this.text = text;
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

    public Copyright withType(String type) {
        this.type = type;
        return this;
    }

}
