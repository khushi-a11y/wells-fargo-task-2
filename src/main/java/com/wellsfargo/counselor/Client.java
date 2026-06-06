package com.wellsfargo.counselor;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String name;
    private String address;
    private String contact;

    @ManyToOne
    private FinancialAdvisor financialAdvisor;

    @OneToOne
    private Portfolio portfolio;

    public Client() {
    }

    public Client(String name, String address, String contact) {
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}