package com.wellsfargo.counselor;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    private String securityName;
    private String category;
    private String purchaseDate;
    private double purchasePrice;
    private int quantity;

    public Security() {
    }

    public Security(String securityName, String category,
                    String purchaseDate, double purchasePrice,
                    int quantity) {

        this.securityName = securityName;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Long securityId) {
        this.securityId = securityId;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }
}