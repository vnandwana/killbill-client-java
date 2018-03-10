/*
 * Kill Bill
 * Kill Bill is an open-source billing and payments platform
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import org.killbill.billing.ObjectType;

import java.util.ArrayList;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class CustomField extends KillBillObject {

    private UUID customFieldId = null;

    private UUID objectId = null;

    private ObjectType objectType = null;

    private String name = null;

    private String value = null;

    public CustomField customFieldId(UUID customFieldId) {
        this.customFieldId = customFieldId;
        return this;
    }

    
    public UUID getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(UUID customFieldId) {
        this.customFieldId = customFieldId;
    }

    public CustomField objectId(UUID objectId) {
        this.objectId = objectId;
        return this;
    }

    
    public UUID getObjectId() {
        return objectId;
    }

    public void setObjectId(UUID objectId) {
        this.objectId = objectId;
    }

    public CustomField objectType(ObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    
    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public CustomField name(String name) {
        this.name = name;
        return this;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomField value(String value) {
        this.value = value;
        return this;
    }

    
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomField customField = (CustomField) o;
        return Objects.equals(this.customFieldId, customField.customFieldId) &&
        Objects.equals(this.objectId, customField.objectId) &&
        Objects.equals(this.objectType, customField.objectType) &&
        Objects.equals(this.name, customField.name) &&
        Objects.equals(this.value, customField.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customFieldId, objectId, objectType, name, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomField {\n");
        
        sb.append("    customFieldId: ").append(toIndentedString(customFieldId)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

