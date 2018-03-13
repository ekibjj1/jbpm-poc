
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
    "externalId",
    "priority",
    "description",
    "category",
    "state",
    "orderDate",
    "completionDate",
    "requestedStartDate",
    "requestedCompletionDate",
    "expectedCompletionDate",
    "notificationContact",
    "channel",
    "note",
    "relatedParty",
    "orderItem"
})
public class ProductOrder {

    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("externalId")
    private String externalId;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("description")
    private String description;
    @JsonProperty("category")
    private String category;
    @JsonProperty("state")
    private String state;
    @JsonProperty("orderDate")
    private String orderDate;
    @JsonProperty("completionDate")
    private String completionDate;
    @JsonProperty("requestedStartDate")
    private String requestedStartDate;
    @JsonProperty("requestedCompletionDate")
    private String requestedCompletionDate;
    @JsonProperty("expectedCompletionDate")
    private String expectedCompletionDate;
    @JsonProperty("notificationContact")
    private String notificationContact;
    @JsonProperty("channel")
    private Channel channel;
    @JsonProperty("note")
    private List<Note> note = null;
    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty = null;
    @JsonProperty("orderItem")
    private List<OrderItem> orderItem = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductOrder() {
    }

    /**
     * 
     * @param orderDate
     * @param expectedCompletionDate
     * @param orderItem
     * @param relatedParty
     * @param state
     * @param requestedStartDate
     * @param externalId
     * @param requestedCompletionDate
     * @param id
     * @param category
     * @param priority
     * @param description
     * @param channel
     * @param notificationContact
     * @param href
     * @param note
     * @param completionDate
     */
    public ProductOrder(String id, String href, String externalId, String priority, String description, String category, String state, String orderDate, String completionDate, String requestedStartDate, String requestedCompletionDate, String expectedCompletionDate, String notificationContact, Channel channel, List<Note> note, List<RelatedParty> relatedParty, List<OrderItem> orderItem) {
        super();
        this.id = id;
        this.href = href;
        this.externalId = externalId;
        this.priority = priority;
        this.description = description;
        this.category = category;
        this.state = state;
        this.orderDate = orderDate;
        this.completionDate = completionDate;
        this.requestedStartDate = requestedStartDate;
        this.requestedCompletionDate = requestedCompletionDate;
        this.expectedCompletionDate = expectedCompletionDate;
        this.notificationContact = notificationContact;
        this.channel = channel;
        this.note = note;
        this.relatedParty = relatedParty;
        this.orderItem = orderItem;
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

    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    @JsonProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("orderDate")
    public String getOrderDate() {
        return orderDate;
    }

    @JsonProperty("orderDate")
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @JsonProperty("completionDate")
    public String getCompletionDate() {
        return completionDate;
    }

    @JsonProperty("completionDate")
    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    @JsonProperty("requestedStartDate")
    public String getRequestedStartDate() {
        return requestedStartDate;
    }

    @JsonProperty("requestedStartDate")
    public void setRequestedStartDate(String requestedStartDate) {
        this.requestedStartDate = requestedStartDate;
    }

    @JsonProperty("requestedCompletionDate")
    public String getRequestedCompletionDate() {
        return requestedCompletionDate;
    }

    @JsonProperty("requestedCompletionDate")
    public void setRequestedCompletionDate(String requestedCompletionDate) {
        this.requestedCompletionDate = requestedCompletionDate;
    }

    @JsonProperty("expectedCompletionDate")
    public String getExpectedCompletionDate() {
        return expectedCompletionDate;
    }

    @JsonProperty("expectedCompletionDate")
    public void setExpectedCompletionDate(String expectedCompletionDate) {
        this.expectedCompletionDate = expectedCompletionDate;
    }

    @JsonProperty("notificationContact")
    public String getNotificationContact() {
        return notificationContact;
    }

    @JsonProperty("notificationContact")
    public void setNotificationContact(String notificationContact) {
        this.notificationContact = notificationContact;
    }

    @JsonProperty("channel")
    public Channel getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @JsonProperty("note")
    public List<Note> getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(List<Note> note) {
        this.note = note;
    }

    @JsonProperty("relatedParty")
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    @JsonProperty("orderItem")
    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    @JsonProperty("orderItem")
    public void setOrderItem(List<OrderItem> orderItem) {
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
