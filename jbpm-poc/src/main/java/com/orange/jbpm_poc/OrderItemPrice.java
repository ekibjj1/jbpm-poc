
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
    "name",
    "priceType",
    "description",
    "unitOfMeasure",
    "recurringChargePeriod",
    "price",
    "orderItemPriceAlteration"
})
public class OrderItemPrice {

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
    @JsonProperty("price")
    private Price price;
    @JsonProperty("orderItemPriceAlteration")
    private List<OrderItemPriceAlteration> orderItemPriceAlteration = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrderItemPrice() {
    }

    /**
     * 
     * @param recurringChargePeriod
     * @param price
     * @param description
     * @param name
     * @param priceType
     * @param unitOfMeasure
     * @param orderItemPriceAlteration
     */
    public OrderItemPrice(String name, String priceType, String description, String unitOfMeasure, String recurringChargePeriod, Price price, List<OrderItemPriceAlteration> orderItemPriceAlteration) {
        super();
        this.name = name;
        this.priceType = priceType;
        this.description = description;
        this.unitOfMeasure = unitOfMeasure;
        this.recurringChargePeriod = recurringChargePeriod;
        this.price = price;
        this.orderItemPriceAlteration = orderItemPriceAlteration;
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

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("orderItemPriceAlteration")
    public List<OrderItemPriceAlteration> getOrderItemPriceAlteration() {
        return orderItemPriceAlteration;
    }

    @JsonProperty("orderItemPriceAlteration")
    public void setOrderItemPriceAlteration(List<OrderItemPriceAlteration> orderItemPriceAlteration) {
        this.orderItemPriceAlteration = orderItemPriceAlteration;
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
