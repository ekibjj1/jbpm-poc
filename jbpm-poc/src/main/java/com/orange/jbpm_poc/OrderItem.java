
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
    "ospExternalId",
    "id",
    "action",
    "state",
    "quantity",
    "appointment",
    "billingAccount",
    "productOffering",
    "product",
    "orderItemPrice",
    "orderItemRelationship"
})
public class OrderItem {

    @JsonProperty("ospExternalId")
    private String ospExternalId;
    @JsonProperty("id")
    private String id;
    @JsonProperty("action")
    private String action;
    @JsonProperty("state")
    private String state;
    @JsonProperty("quantity")
    private String quantity;
    @JsonProperty("appointment")
    private String appointment;
    @JsonProperty("billingAccount")
    private List<BillingAccount> billingAccount = null;
    @JsonProperty("productOffering")
    private ProductOffering productOffering;
    @JsonProperty("product")
    private Product product;
    @JsonProperty("orderItemPrice")
    private OrderItemPrice orderItemPrice;
    @JsonProperty("orderItemRelationship")
    private List<OrderItemRelationship> orderItemRelationship = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrderItem() {
    }

    /**
     * 
     * @param product
     * @param id
     * @param ospExternalId
     * @param orderItemRelationship
     * @param orderItemPrice
     * @param state
     * @param action
     * @param quantity
     * @param productOffering
     * @param billingAccount
     * @param appointment
     */
    public OrderItem(String ospExternalId, String id, String action, String state, String quantity, String appointment, List<BillingAccount> billingAccount, ProductOffering productOffering, Product product, OrderItemPrice orderItemPrice, List<OrderItemRelationship> orderItemRelationship) {
        super();
        this.ospExternalId = ospExternalId;
        this.id = id;
        this.action = action;
        this.state = state;
        this.quantity = quantity;
        this.appointment = appointment;
        this.billingAccount = billingAccount;
        this.productOffering = productOffering;
        this.product = product;
        this.orderItemPrice = orderItemPrice;
        this.orderItemRelationship = orderItemRelationship;
    }

    @JsonProperty("ospExternalId")
    public String getOspExternalId() {
        return ospExternalId;
    }

    @JsonProperty("ospExternalId")
    public void setOspExternalId(String ospExternalId) {
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

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("quantity")
    public String getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("appointment")
    public String getAppointment() {
        return appointment;
    }

    @JsonProperty("appointment")
    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    @JsonProperty("billingAccount")
    public List<BillingAccount> getBillingAccount() {
        return billingAccount;
    }

    @JsonProperty("billingAccount")
    public void setBillingAccount(List<BillingAccount> billingAccount) {
        this.billingAccount = billingAccount;
    }

    @JsonProperty("productOffering")
    public ProductOffering getProductOffering() {
        return productOffering;
    }

    @JsonProperty("productOffering")
    public void setProductOffering(ProductOffering productOffering) {
        this.productOffering = productOffering;
    }

    @JsonProperty("product")
    public Product getProduct() {
        return product;
    }

    @JsonProperty("product")
    public void setProduct(Product product) {
        this.product = product;
    }

    @JsonProperty("orderItemPrice")
    public OrderItemPrice getOrderItemPrice() {
        return orderItemPrice;
    }

    @JsonProperty("orderItemPrice")
    public void setOrderItemPrice(OrderItemPrice orderItemPrice) {
        this.orderItemPrice = orderItemPrice;
    }

    @JsonProperty("orderItemRelationship")
    public List<OrderItemRelationship> getOrderItemRelationship() {
        return orderItemRelationship;
    }

    @JsonProperty("orderItemRelationship")
    public void setOrderItemRelationship(List<OrderItemRelationship> orderItemRelationship) {
        this.orderItemRelationship = orderItemRelationship;
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
