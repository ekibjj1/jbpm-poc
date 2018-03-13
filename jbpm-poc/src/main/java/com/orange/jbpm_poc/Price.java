
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
    "taxIncludedAmount",
    "dutyFreeAmount",
    "taxRate",
    "currencyCode",
    "percentage"
})
public class Price {

    @JsonProperty("taxIncludedAmount")
    private Integer taxIncludedAmount;
    @JsonProperty("dutyFreeAmount")
    private Integer dutyFreeAmount;
    @JsonProperty("taxRate")
    private Integer taxRate;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("percentage")
    private Integer percentage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Price() {
    }

    /**
     * 
     * @param currencyCode
     * @param taxRate
     * @param percentage
     * @param dutyFreeAmount
     * @param taxIncludedAmount
     */
    public Price(Integer taxIncludedAmount, Integer dutyFreeAmount, Integer taxRate, String currencyCode, Integer percentage) {
        super();
        this.taxIncludedAmount = taxIncludedAmount;
        this.dutyFreeAmount = dutyFreeAmount;
        this.taxRate = taxRate;
        this.currencyCode = currencyCode;
        this.percentage = percentage;
    }

    @JsonProperty("taxIncludedAmount")
    public Integer getTaxIncludedAmount() {
        return taxIncludedAmount;
    }

    @JsonProperty("taxIncludedAmount")
    public void setTaxIncludedAmount(Integer taxIncludedAmount) {
        this.taxIncludedAmount = taxIncludedAmount;
    }

    @JsonProperty("dutyFreeAmount")
    public Integer getDutyFreeAmount() {
        return dutyFreeAmount;
    }

    @JsonProperty("dutyFreeAmount")
    public void setDutyFreeAmount(Integer dutyFreeAmount) {
        this.dutyFreeAmount = dutyFreeAmount;
    }

    @JsonProperty("taxRate")
    public Integer getTaxRate() {
        return taxRate;
    }

    @JsonProperty("taxRate")
    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("percentage")
    public Integer getPercentage() {
        return percentage;
    }

    @JsonProperty("percentage")
    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
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
