
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
    "name",
    "priceType",
    "description",
    "unitOfMeasure",
    "recurringChargePeriod",
    "applicationDuration",
    "priority",
    "price"
})
public class OrderItemPriceAlteration {

    @JsonProperty("name")
    private String name;
    @JsonProperty("priceType")
    private String priceType;
    @JsonProperty("description")
    private String description;
    @JsonProperty("unitOfMeasure")
    private String unitOfMeasure;
    @JsonProperty("recurringChargePeriod")
    private String recurringChargePeriod;
    @JsonProperty("applicationDuration")
    private Integer applicationDuration;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("price")
    private Price_ price;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrderItemPriceAlteration() {
    }

    /**
     * 
     * @param recurringChargePeriod
     * @param price
     * @param applicationDuration
     * @param priority
     * @param description
     * @param name
     * @param priceType
     * @param unitOfMeasure
     */
    public OrderItemPriceAlteration(String name, String priceType, String description, String unitOfMeasure, String recurringChargePeriod, Integer applicationDuration, Integer priority, Price_ price) {
        super();
        this.name = name;
        this.priceType = priceType;
        this.description = description;
        this.unitOfMeasure = unitOfMeasure;
        this.recurringChargePeriod = recurringChargePeriod;
        this.applicationDuration = applicationDuration;
        this.priority = priority;
        this.price = price;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("priceType")
    public String getPriceType() {
        return priceType;
    }

    @JsonProperty("priceType")
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("unitOfMeasure")
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    @JsonProperty("recurringChargePeriod")
    public String getRecurringChargePeriod() {
        return recurringChargePeriod;
    }

    @JsonProperty("recurringChargePeriod")
    public void setRecurringChargePeriod(String recurringChargePeriod) {
        this.recurringChargePeriod = recurringChargePeriod;
    }

    @JsonProperty("applicationDuration")
    public Integer getApplicationDuration() {
        return applicationDuration;
    }

    @JsonProperty("applicationDuration")
    public void setApplicationDuration(Integer applicationDuration) {
        this.applicationDuration = applicationDuration;
    }

    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("price")
    public Price_ getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price_ price) {
        this.price = price;
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
