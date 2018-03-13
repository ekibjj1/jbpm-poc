
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
    "type",
    "orderItem"
})
public class OrderItemRelationship {

    @JsonProperty("type")
    private String type;
    @JsonProperty("orderItem")
    private OrderItem_ orderItem;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrderItemRelationship() {
    }

    /**
     * 
     * @param orderItem
     * @param type
     */
    public OrderItemRelationship(String type, OrderItem_ orderItem) {
        super();
        this.type = type;
        this.orderItem = orderItem;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("orderItem")
    public OrderItem_ getOrderItem() {
        return orderItem;
    }

    @JsonProperty("orderItem")
    public void setOrderItem(OrderItem_ orderItem) {
        this.orderItem = orderItem;
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
