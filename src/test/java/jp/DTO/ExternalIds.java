package jp.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "upc"
})
public class ExternalIds {

    @JsonProperty("upc")
    private String upc;

    /**
     * No args constructor for use in serialization
     *
     */
    public ExternalIds() {
    }

    /**
     *
     * @param upc
     */
    public ExternalIds(String upc) {
        super();
        this.upc = upc;
    }

    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    public ExternalIds withUpc(String upc) {
        this.upc = upc;
        return this;
    }

}
