
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
    "productOrder",
    "error"
})
public class ProductOrderingDTO {

    @JsonProperty("productOrder")
    private ProductOrder productOrder;
    @JsonProperty("error")
    private Error error;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductOrderingDTO() {
    }

    /**
     * 
     * @param productOrder
     * @param error
     */
    public ProductOrderingDTO(ProductOrder productOrder, Error error) {
        super();
        this.productOrder = productOrder;
        this.error = error;
    }

    @JsonProperty("productOrder")
    public ProductOrder getProductOrder() {
        return productOrder;
    }

    @JsonProperty("productOrder")
    public void setProductOrder(ProductOrder productOrder) {
        this.productOrder = productOrder;
    }

    @JsonProperty("error")
    public Error getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Error error) {
        this.error = error;
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
