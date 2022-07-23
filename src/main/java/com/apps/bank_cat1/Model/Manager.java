package com.apps.bank_cat1.Model;

import javax.persistence.*;

@Entity
@Table (name = "MANAGER")
public class Manager {

    @Id
    @Column (name = "MANAGER_ID")
    private Long managerId;
    @ManyToOne
    @JoinColumn (name = "BANK_NAME")
    private Account account;
    @Column (name = "MANAGER_NAME")
    private String managerName;
    @Column (name = "MANAGER_EMAIL")
    private String managerEmail;
    @Column (name = "MANAGER_PHONE")
    private int managerPhone;


    public Manager() {
    }

    public Manager(Long managerId, Account account, String managerName, String managerEmail, int managerPhone) {
        this.managerId = managerId;
        this.account = account;
        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.managerPhone = managerPhone;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public int getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(int managerPhone) {
        this.managerPhone = managerPhone;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", account=" + account +
                ", managerName='" + managerName + '\'' +
                ", managerEmail='" + managerEmail + '\'' +
                ", managerPhone=" + managerPhone +
                '}';
    }
}
