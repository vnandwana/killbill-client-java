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

import java.util.ArrayList;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class AdminPayment extends KillBillObject {

    private String lastSuccessPaymentState = null;

    private String currentPaymentStateName = null;

    private String transactionStatus = null;

    public AdminPayment lastSuccessPaymentState(String lastSuccessPaymentState) {
        this.lastSuccessPaymentState = lastSuccessPaymentState;
        return this;
    }

    
    public String getLastSuccessPaymentState() {
        return lastSuccessPaymentState;
    }

    public void setLastSuccessPaymentState(String lastSuccessPaymentState) {
        this.lastSuccessPaymentState = lastSuccessPaymentState;
    }

    public AdminPayment currentPaymentStateName(String currentPaymentStateName) {
        this.currentPaymentStateName = currentPaymentStateName;
        return this;
    }

    
    public String getCurrentPaymentStateName() {
        return currentPaymentStateName;
    }

    public void setCurrentPaymentStateName(String currentPaymentStateName) {
        this.currentPaymentStateName = currentPaymentStateName;
    }

    public AdminPayment transactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }

    
    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdminPayment adminPayment = (AdminPayment) o;
        return Objects.equals(this.lastSuccessPaymentState, adminPayment.lastSuccessPaymentState) &&
        Objects.equals(this.currentPaymentStateName, adminPayment.currentPaymentStateName) &&
        Objects.equals(this.transactionStatus, adminPayment.transactionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastSuccessPaymentState, currentPaymentStateName, transactionStatus);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdminPayment {\n");
        
        sb.append("    lastSuccessPaymentState: ").append(toIndentedString(lastSuccessPaymentState)).append("\n");
        sb.append("    currentPaymentStateName: ").append(toIndentedString(currentPaymentStateName)).append("\n");
        sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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

