
package com.orange.jbpm_poc;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "ospExternalId"
})
public class OrderItem_ {

    @JsonProperty("id")
    private String id;
    @JsonProperty("ospExternalId")
    private String ospExternalId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrderItem_() {
    }

    /**
     * 
     * @param ospExternalId
     * @param id
     */
    public OrderItem_(String id, String ospExternalId) {
        super();
        this.id = id;
        this.ospExternalId = ospExternalId;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("ospExternalId")
    public String getOspExternalId() {
        return ospExternalId;
    }

    @JsonProperty("ospExternalId")
    public void setOspExternalId(String ospExternalId) {
        this.ospExternalId = ospExternalId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
