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
import org.joda.time.LocalDate;
import org.killbill.billing.client.model.gen.Credit;
import org.killbill.billing.client.model.gen.InvoiceItem;

import java.util.ArrayList;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Invoice extends KillBillObject {

    private BigDecimal amount = null;

    private String currency = null;

    private String status = null;

    private BigDecimal creditAdj = null;

    private BigDecimal refundAdj = null;

    private UUID invoiceId = null;

    private LocalDate invoiceDate = null;

    private LocalDate targetDate = null;

    private String invoiceNumber = null;

    private BigDecimal balance = null;

    private UUID accountId = null;

    private String bundleKeys = null;

    private List<Credit> credits = null;

    private List<InvoiceItem> items = null;

    private Boolean isParentInvoice = false;

    private UUID parentInvoiceId = null;

    private UUID parentAccountId = null;

    public Invoice amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Invoice currency(String currency) {
        this.currency = currency;
        return this;
    }

    
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Invoice status(String status) {
        this.status = status;
        return this;
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Invoice creditAdj(BigDecimal creditAdj) {
        this.creditAdj = creditAdj;
        return this;
    }

    
    public BigDecimal getCreditAdj() {
        return creditAdj;
    }

    public void setCreditAdj(BigDecimal creditAdj) {
        this.creditAdj = creditAdj;
    }

    public Invoice refundAdj(BigDecimal refundAdj) {
        this.refundAdj = refundAdj;
        return this;
    }

    
    public BigDecimal getRefundAdj() {
        return refundAdj;
    }

    public void setRefundAdj(BigDecimal refundAdj) {
        this.refundAdj = refundAdj;
    }

    public Invoice invoiceId(UUID invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }

    
    public UUID getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(UUID invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Invoice invoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    
    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Invoice targetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
        return this;
    }

    
    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public Invoice invoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Invoice balance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Invoice accountId(UUID accountId) {
        this.accountId = accountId;
        return this;
    }

    
    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public Invoice bundleKeys(String bundleKeys) {
        this.bundleKeys = bundleKeys;
        return this;
    }

    
    public String getBundleKeys() {
        return bundleKeys;
    }

    public void setBundleKeys(String bundleKeys) {
        this.bundleKeys = bundleKeys;
    }

    public Invoice credits(List<Credit> credits) {
        this.credits = credits;
        return this;
    }

    public Invoice addCreditsItem(Credit creditsItem) {
        if (this.credits == null) {
            this.credits = new ArrayList<Credit>();
        }
        this.credits.add(creditsItem);
        return this;
    }

    
    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    public Invoice items(List<InvoiceItem> items) {
        this.items = items;
        return this;
    }

    public Invoice addItemsItem(InvoiceItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<InvoiceItem>();
        }
        this.items.add(itemsItem);
        return this;
    }

    
    public List<InvoiceItem> getItems() {
        return items;
    }

    public void setItems(List<InvoiceItem> items) {
        this.items = items;
    }

    public Invoice isParentInvoice(Boolean isParentInvoice) {
        this.isParentInvoice = isParentInvoice;
        return this;
    }

    
    public Boolean isIsParentInvoice() {
        return isParentInvoice;
    }

    public void setIsParentInvoice(Boolean isParentInvoice) {
        this.isParentInvoice = isParentInvoice;
    }

    public Invoice parentInvoiceId(UUID parentInvoiceId) {
        this.parentInvoiceId = parentInvoiceId;
        return this;
    }

    
    public UUID getParentInvoiceId() {
        return parentInvoiceId;
    }

    public void setParentInvoiceId(UUID parentInvoiceId) {
        this.parentInvoiceId = parentInvoiceId;
    }

    public Invoice parentAccountId(UUID parentAccountId) {
        this.parentAccountId = parentAccountId;
        return this;
    }

    
    public UUID getParentAccountId() {
        return parentAccountId;
    }

    public void setParentAccountId(UUID parentAccountId) {
        this.parentAccountId = parentAccountId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Invoice invoice = (Invoice) o;
        return Objects.equals(this.amount, invoice.amount) &&
        Objects.equals(this.currency, invoice.currency) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.creditAdj, invoice.creditAdj) &&
        Objects.equals(this.refundAdj, invoice.refundAdj) &&
        Objects.equals(this.invoiceId, invoice.invoiceId) &&
        Objects.equals(this.invoiceDate, invoice.invoiceDate) &&
        Objects.equals(this.targetDate, invoice.targetDate) &&
        Objects.equals(this.invoiceNumber, invoice.invoiceNumber) &&
        Objects.equals(this.balance, invoice.balance) &&
        Objects.equals(this.accountId, invoice.accountId) &&
        Objects.equals(this.bundleKeys, invoice.bundleKeys) &&
        Objects.equals(this.credits, invoice.credits) &&
        Objects.equals(this.items, invoice.items) &&
        Objects.equals(this.isParentInvoice, invoice.isParentInvoice) &&
        Objects.equals(this.parentInvoiceId, invoice.parentInvoiceId) &&
        Objects.equals(this.parentAccountId, invoice.parentAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency, status, creditAdj, refundAdj, invoiceId, invoiceDate, targetDate, invoiceNumber, balance, accountId, bundleKeys, credits, items, isParentInvoice, parentInvoiceId, parentAccountId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Invoice {\n");
        
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    creditAdj: ").append(toIndentedString(creditAdj)).append("\n");
        sb.append("    refundAdj: ").append(toIndentedString(refundAdj)).append("\n");
        sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
        sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
        sb.append("    targetDate: ").append(toIndentedString(targetDate)).append("\n");
        sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    bundleKeys: ").append(toIndentedString(bundleKeys)).append("\n");
        sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    isParentInvoice: ").append(toIndentedString(isParentInvoice)).append("\n");
        sb.append("    parentInvoiceId: ").append(toIndentedString(parentInvoiceId)).append("\n");
        sb.append("    parentAccountId: ").append(toIndentedString(parentAccountId)).append("\n");
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

