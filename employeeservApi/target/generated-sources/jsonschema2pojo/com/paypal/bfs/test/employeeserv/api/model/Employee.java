
package com.paypal.bfs.test.employeeserv.api.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Employee resource
 * <p>
 * Employee resource object
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "first_name",
    "last_name",
    "date_of_birth",
    "address1",
    "address2",
    "city",
    "state",
    "country",
    "zip_code"
})
public class Employee {

    /**
     * employee id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("employee id")
    private Integer id;
    /**
     * first name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    @JsonPropertyDescription("first name")
    private String firstName;
    /**
     * last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    @JsonPropertyDescription("last name")
    private String lastName;
    /**
     * date of birth
     * 
     */
    @JsonProperty("date_of_birth")
    @JsonPropertyDescription("date of birth")
    private String dateOfBirth;
    /**
     * line 1
     * (Required)
     * 
     */
    @JsonProperty("address1")
    @JsonPropertyDescription("line 1")
    private String address1;
    /**
     * line 2
     * 
     */
    @JsonProperty("address2")
    @JsonPropertyDescription("line 2")
    private String address2;
    /**
     * city
     * (Required)
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("city")
    private String city;
    /**
     * state
     * (Required)
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("state")
    private String state;
    /**
     * country
     * (Required)
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("country")
    private String country;
    /**
     * zip code
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    @JsonPropertyDescription("zip code")
    private String zipCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * employee id
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * employee id
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * first name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * first name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * date of birth
     * 
     */
    @JsonProperty("date_of_birth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * date of birth
     * 
     */
    @JsonProperty("date_of_birth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * line 1
     * (Required)
     * 
     */
    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    /**
     * line 1
     * (Required)
     * 
     */
    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * line 2
     * 
     */
    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }

    /**
     * line 2
     * 
     */
    @JsonProperty("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * city
     * (Required)
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * city
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * state
     * (Required)
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * state
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * country
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * country
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * zip code
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * zip code
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Employee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("address1");
        sb.append('=');
        sb.append(((this.address1 == null)?"<null>":this.address1));
        sb.append(',');
        sb.append("address2");
        sb.append('=');
        sb.append(((this.address2 == null)?"<null>":this.address2));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
