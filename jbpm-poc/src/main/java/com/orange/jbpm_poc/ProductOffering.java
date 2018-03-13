
package com.orange.jbpm_poc;

import java.util.HashMap;
import java.util.List;
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
    "href",
    "bundledProductOffering"
})
public class ProductOffering {

    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("bundledProductOffering")
    private List<BundledProductOffering> bundledProductOffering = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductOffering() {
    }

    /**
     * 
     * @param id
     * @param bundledProductOffering
     * @param href
     */
    public ProductOffering(String id, String href, List<BundledProductOffering> bundledProductOffering) {
        super();
        this.id = id;
        this.href = href;
        this.bundledProductOffering = bundledProductOffering;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("bundledProductOffering")
    public List<BundledProductOffering> getBundledProductOffering() {
        return bundledProductOffering;
    }

    @JsonProperty("bundledProductOffering")
    public void setBundledProductOffering(List<BundledProductOffering> bundledProductOffering) {
        this.bundledProductOffering = bundledProductOffering;
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
