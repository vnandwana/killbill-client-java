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
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import org.joda.time.DateTime;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.client.model.gen.InvoiceItem;
import org.killbill.billing.client.model.gen.PluginProperty;
import org.killbill.billing.payment.api.TransactionStatus;
import org.killbill.billing.payment.api.TransactionType;

import java.util.ArrayList;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class InvoicePaymentTransaction extends KillBillObject {

    private UUID transactionId = null;

    private String transactionExternalKey = null;

    private UUID paymentId = null;

    private String paymentExternalKey = null;

    private TransactionType transactionType = null;

    private BigDecimal amount = null;

    private Currency currency = null;

    private DateTime effectiveDate = null;

    private BigDecimal processedAmount = null;

    private String processedCurrency = null;

    private TransactionStatus status = null;

    private String gatewayErrorCode = null;

    private String gatewayErrorMsg = null;

    private String firstPaymentReferenceId = null;

    private String secondPaymentReferenceId = null;

    private List<PluginProperty> properties = null;

    private Boolean isAdjusted = false;

    private List<InvoiceItem> adjustments = null;

    public InvoicePaymentTransaction transactionId(UUID transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    
    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public InvoicePaymentTransaction transactionExternalKey(String transactionExternalKey) {
        this.transactionExternalKey = transactionExternalKey;
        return this;
    }

    
    public String getTransactionExternalKey() {
        return transactionExternalKey;
    }

    public void setTransactionExternalKey(String transactionExternalKey) {
        this.transactionExternalKey = transactionExternalKey;
    }

    public InvoicePaymentTransaction paymentId(UUID paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    
    public UUID getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(UUID paymentId) {
        this.paymentId = paymentId;
    }

    public InvoicePaymentTransaction paymentExternalKey(String paymentExternalKey) {
        this.paymentExternalKey = paymentExternalKey;
        return this;
    }

    
    public String getPaymentExternalKey() {
        return paymentExternalKey;
    }

    public void setPaymentExternalKey(String paymentExternalKey) {
        this.paymentExternalKey = paymentExternalKey;
    }

    public InvoicePaymentTransaction transactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    
    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public InvoicePaymentTransaction amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public InvoicePaymentTransaction currency(Currency currency) {
        this.currency = currency;
        return this;
    }

    
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public InvoicePaymentTransaction effectiveDate(DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    
    public DateTime getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public InvoicePaymentTransaction processedAmount(BigDecimal processedAmount) {
        this.processedAmount = processedAmount;
        return this;
    }

    
    public BigDecimal getProcessedAmount() {
        return processedAmount;
    }

    public void setProcessedAmount(BigDecimal processedAmount) {
        this.processedAmount = processedAmount;
    }

    public InvoicePaymentTransaction processedCurrency(String processedCurrency) {
        this.processedCurrency = processedCurrency;
        return this;
    }

    
    public String getProcessedCurrency() {
        return processedCurrency;
    }

    public void setProcessedCurrency(String processedCurrency) {
        this.processedCurrency = processedCurrency;
    }

    public InvoicePaymentTransaction status(TransactionStatus status) {
        this.status = status;
        return this;
    }

    
    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public InvoicePaymentTransaction gatewayErrorCode(String gatewayErrorCode) {
        this.gatewayErrorCode = gatewayErrorCode;
        return this;
    }

    
    public String getGatewayErrorCode() {
        return gatewayErrorCode;
    }

    public void setGatewayErrorCode(String gatewayErrorCode) {
        this.gatewayErrorCode = gatewayErrorCode;
    }

    public InvoicePaymentTransaction gatewayErrorMsg(String gatewayErrorMsg) {
        this.gatewayErrorMsg = gatewayErrorMsg;
        return this;
    }

    
    public String getGatewayErrorMsg() {
        return gatewayErrorMsg;
    }

    public void setGatewayErrorMsg(String gatewayErrorMsg) {
        this.gatewayErrorMsg = gatewayErrorMsg;
    }

    public InvoicePaymentTransaction firstPaymentReferenceId(String firstPaymentReferenceId) {
        this.firstPaymentReferenceId = firstPaymentReferenceId;
        return this;
    }

    
    public String getFirstPaymentReferenceId() {
        return firstPaymentReferenceId;
    }

    public void setFirstPaymentReferenceId(String firstPaymentReferenceId) {
        this.firstPaymentReferenceId = firstPaymentReferenceId;
    }

    public InvoicePaymentTransaction secondPaymentReferenceId(String secondPaymentReferenceId) {
        this.secondPaymentReferenceId = secondPaymentReferenceId;
        return this;
    }

    
    public String getSecondPaymentReferenceId() {
        return secondPaymentReferenceId;
    }

    public void setSecondPaymentReferenceId(String secondPaymentReferenceId) {
        this.secondPaymentReferenceId = secondPaymentReferenceId;
    }

    public InvoicePaymentTransaction properties(List<PluginProperty> properties) {
        this.properties = properties;
        return this;
    }

    public InvoicePaymentTransaction addPropertiesItem(PluginProperty propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<PluginProperty>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    
    public List<PluginProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<PluginProperty> properties) {
        this.properties = properties;
    }

    public InvoicePaymentTransaction isAdjusted(Boolean isAdjusted) {
        this.isAdjusted = isAdjusted;
        return this;
    }

    
    public Boolean isIsAdjusted() {
        return isAdjusted;
    }

    public void setIsAdjusted(Boolean isAdjusted) {
        this.isAdjusted = isAdjusted;
    }

    public InvoicePaymentTransaction adjustments(List<InvoiceItem> adjustments) {
        this.adjustments = adjustments;
        return this;
    }

    public InvoicePaymentTransaction addAdjustmentsItem(InvoiceItem adjustmentsItem) {
        if (this.adjustments == null) {
            this.adjustments = new ArrayList<InvoiceItem>();
        }
        this.adjustments.add(adjustmentsItem);
        return this;
    }

    
    public List<InvoiceItem> getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(List<InvoiceItem> adjustments) {
        this.adjustments = adjustments;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvoicePaymentTransaction invoicePaymentTransaction = (InvoicePaymentTransaction) o;
        return Objects.equals(this.transactionId, invoicePaymentTransaction.transactionId) &&
        Objects.equals(this.transactionExternalKey, invoicePaymentTransaction.transactionExternalKey) &&
        Objects.equals(this.paymentId, invoicePaymentTransaction.paymentId) &&
        Objects.equals(this.paymentExternalKey, invoicePaymentTransaction.paymentExternalKey) &&
        Objects.equals(this.transactionType, invoicePaymentTransaction.transactionType) &&
        Objects.equals(this.amount, invoicePaymentTransaction.amount) &&
        Objects.equals(this.currency, invoicePaymentTransaction.currency) &&
        Objects.equals(this.effectiveDate, invoicePaymentTransaction.effectiveDate) &&
        Objects.equals(this.processedAmount, invoicePaymentTransaction.processedAmount) &&
        Objects.equals(this.processedCurrency, invoicePaymentTransaction.processedCurrency) &&
        Objects.equals(this.status, invoicePaymentTransaction.status) &&
        Objects.equals(this.gatewayErrorCode, invoicePaymentTransaction.gatewayErrorCode) &&
        Objects.equals(this.gatewayErrorMsg, invoicePaymentTransaction.gatewayErrorMsg) &&
        Objects.equals(this.firstPaymentReferenceId, invoicePaymentTransaction.firstPaymentReferenceId) &&
        Objects.equals(this.secondPaymentReferenceId, invoicePaymentTransaction.secondPaymentReferenceId) &&
        Objects.equals(this.properties, invoicePaymentTransaction.properties) &&
        Objects.equals(this.isAdjusted, invoicePaymentTransaction.isAdjusted) &&
        Objects.equals(this.adjustments, invoicePaymentTransaction.adjustments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, transactionExternalKey, paymentId, paymentExternalKey, transactionType, amount, currency, effectiveDate, processedAmount, processedCurrency, status, gatewayErrorCode, gatewayErrorMsg, firstPaymentReferenceId, secondPaymentReferenceId, properties, isAdjusted, adjustments);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvoicePaymentTransaction {\n");
        
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    transactionExternalKey: ").append(toIndentedString(transactionExternalKey)).append("\n");
        sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
        sb.append("    paymentExternalKey: ").append(toIndentedString(paymentExternalKey)).append("\n");
        sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    processedAmount: ").append(toIndentedString(processedAmount)).append("\n");
        sb.append("    processedCurrency: ").append(toIndentedString(processedCurrency)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    gatewayErrorCode: ").append(toIndentedString(gatewayErrorCode)).append("\n");
        sb.append("    gatewayErrorMsg: ").append(toIndentedString(gatewayErrorMsg)).append("\n");
        sb.append("    firstPaymentReferenceId: ").append(toIndentedString(firstPaymentReferenceId)).append("\n");
        sb.append("    secondPaymentReferenceId: ").append(toIndentedString(secondPaymentReferenceId)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    isAdjusted: ").append(toIndentedString(isAdjusted)).append("\n");
        sb.append("    adjustments: ").append(toIndentedString(adjustments)).append("\n");
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

