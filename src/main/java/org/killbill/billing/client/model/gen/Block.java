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
import org.killbill.billing.catalog.api.BlockType;
import org.killbill.billing.client.model.gen.InternationalPrice;
import org.killbill.billing.client.model.gen.Unit;

import java.util.ArrayList;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Block extends KillBillObject {

    private BlockType type = null;

    private Double size = null;

    private Unit unit = null;

    private InternationalPrice price = null;

    private Double minTopUpCredit = null;

    public Block type(BlockType type) {
        this.type = type;
        return this;
    }

    
    public BlockType getType() {
        return type;
    }

    public void setType(BlockType type) {
        this.type = type;
    }

    public Block size(Double size) {
        this.size = size;
        return this;
    }

    
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Block unit(Unit unit) {
        this.unit = unit;
        return this;
    }

    
    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Block price(InternationalPrice price) {
        this.price = price;
        return this;
    }

    
    public InternationalPrice getPrice() {
        return price;
    }

    public void setPrice(InternationalPrice price) {
        this.price = price;
    }

    public Block minTopUpCredit(Double minTopUpCredit) {
        this.minTopUpCredit = minTopUpCredit;
        return this;
    }

    
    public Double getMinTopUpCredit() {
        return minTopUpCredit;
    }

    public void setMinTopUpCredit(Double minTopUpCredit) {
        this.minTopUpCredit = minTopUpCredit;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Block block = (Block) o;
        return Objects.equals(this.type, block.type) &&
        Objects.equals(this.size, block.size) &&
        Objects.equals(this.unit, block.unit) &&
        Objects.equals(this.price, block.price) &&
        Objects.equals(this.minTopUpCredit, block.minTopUpCredit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, size, unit, price, minTopUpCredit);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Block {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    minTopUpCredit: ").append(toIndentedString(minTopUpCredit)).append("\n");
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

