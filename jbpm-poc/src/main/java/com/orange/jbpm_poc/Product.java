
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
    "place",
    "productCharacteristic",
    "relatedParty",
    "productRelationship"
})
public class Product {

    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("place")
    private List<Place> place = null;
    @JsonProperty("productCharacteristic")
    private List<ProductCharacteristic> productCharacteristic = null;
    @JsonProperty("relatedParty")
    private List<RelatedParty_> relatedParty = null;
    @JsonProperty("productRelationship")
    private List<ProductRelationship> productRelationship = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param id
     * @param productRelationship
     * @param productCharacteristic
     * @param relatedParty
     * @param place
     * @param href
     */
    public Product(String id, String href, List<Place> place, List<ProductCharacteristic> productCharacteristic, List<RelatedParty_> relatedParty, List<ProductRelationship> productRelationship) {
        super();
        this.id = id;
        this.href = href;
        this.place = place;
        this.productCharacteristic = productCharacteristic;
        this.relatedParty = relatedParty;
        this.productRelationship = productRelationship;
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

    @JsonProperty("place")
    public List<Place> getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(List<Place> place) {
        this.place = place;
    }

    @JsonProperty("productCharacteristic")
    public List<ProductCharacteristic> getProductCharacteristic() {
        return productCharacteristic;
    }

    @JsonProperty("productCharacteristic")
    public void setProductCharacteristic(List<ProductCharacteristic> productCharacteristic) {
        this.productCharacteristic = productCharacteristic;
    }

    @JsonProperty("relatedParty")
    public List<RelatedParty_> getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(List<RelatedParty_> relatedParty) {
        this.relatedParty = relatedParty;
    }

    @JsonProperty("productRelationship")
    public List<ProductRelationship> getProductRelationship() {
        return productRelationship;
    }

    @JsonProperty("productRelationship")
    public void setProductRelationship(List<ProductRelationship> productRelationship) {
        this.productRelationship = productRelationship;
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
