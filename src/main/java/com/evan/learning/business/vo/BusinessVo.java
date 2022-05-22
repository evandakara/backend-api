package com.evan.learning.business.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class BusinessVo implements Serializable {
    private Long id;
    private String logo;
    private String logoUrl;
    private String image;
    private String imageUrl;
    private String businessCode;
    private String businessName;
    private String businessCategory;
    private String businessCore;
    private String businessOwner;
    private Integer daysLeft;
    private Integer totalInvestor;
    private BigDecimal targetInvestment;
    private BigDecimal targetInvestmentCal;
    private String roi;
    private Boolean isActiveMarket;
    private Boolean isSale;
    private String status;
    private String type;
    private String actualStatus;
    private BigDecimal totalInvestment;
    private Integer progress;
    private Integer availableSlot;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(String businessCategory) {
        this.businessCategory = businessCategory;
    }

    public String getBusinessCore() {
        return businessCore;
    }

    public void setBusinessCore(String businessCore) {
        this.businessCore = businessCore;
    }

    public String getBusinessOwner() {
        return businessOwner;
    }

    public void setBusinessOwner(String businessOwner) {
        this.businessOwner = businessOwner;
    }

    public Integer getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(Integer daysLeft) {
        this.daysLeft = daysLeft;
    }

    public Integer getTotalInvestor() {
        return totalInvestor;
    }

    public void setTotalInvestor(Integer totalInvestor) {
        this.totalInvestor = totalInvestor;
    }

    public BigDecimal getTargetInvestment() {
        return targetInvestment;
    }

    public void setTargetInvestment(BigDecimal targetInvestment) {
        this.targetInvestment = targetInvestment;
    }

    public BigDecimal getTargetInvestmentCal() {
        return targetInvestmentCal;
    }

    public void setTargetInvestmentCal(BigDecimal targetInvestmentCal) {
        this.targetInvestmentCal = targetInvestmentCal;
    }

    public String getRoi() {
        return roi;
    }

    public void setRoi(String roi) {
        this.roi = roi;
    }

    public Boolean getActiveMarket() {
        return isActiveMarket;
    }

    public void setActiveMarket(Boolean activeMarket) {
        isActiveMarket = activeMarket;
    }

    public Boolean getSale() {
        return isSale;
    }

    public void setSale(Boolean sale) {
        isSale = sale;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActualStatus() {
        return actualStatus;
    }

    public void setActualStatus(String actualStatus) {
        this.actualStatus = actualStatus;
    }

    public BigDecimal getTotalInvestment() {
        return totalInvestment;
    }

    public void setTotalInvestment(BigDecimal totalInvestment) {
        this.totalInvestment = totalInvestment;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getAvailableSlot() {
        return availableSlot;
    }

    public void setAvailableSlot(Integer availableSlot) {
        this.availableSlot = availableSlot;
    }
}
