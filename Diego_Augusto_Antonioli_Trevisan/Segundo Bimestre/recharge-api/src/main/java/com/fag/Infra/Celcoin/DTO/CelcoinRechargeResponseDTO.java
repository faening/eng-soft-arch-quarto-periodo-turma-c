package com.fag.Infra.Celcoin.DTO;

public class CelcoinRechargeResponseDTO {
    private Integer nsuNameProvider;
    private Integer authentication;
    private CelcoinRechargeReceiptDTO receipt;
    private String settleDate;
    private String createDate;
    private Long transactionId;
    private String urlReceipt;
    private String errorCode;
    private String message;
    private Integer status;

    public Integer getNsuNameProvider() {
        return nsuNameProvider;
    }

    public void setNsuNameProvider(Integer nsuNameProvider) {
        this.nsuNameProvider = nsuNameProvider;
    }

    public Integer getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Integer authentication) {
        this.authentication = authentication;
    }

    public CelcoinRechargeReceiptDTO getReceipt() {
        return receipt;
    }

    public void setReceipt(CelcoinRechargeReceiptDTO receipt) {
        this.receipt = receipt;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getUrlReceipt() {
        return urlReceipt;
    }

    public void setUrlReceipt(String urlReceipt) {
        this.urlReceipt = urlReceipt;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}