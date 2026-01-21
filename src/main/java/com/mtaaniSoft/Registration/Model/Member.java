package com.mtaaniSoft.Registration.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "principal_member")
public class Member { //Member class

    @Id
    @Column(name = "id_number", nullable = false, unique = true)
    private String idNumber;

    @Column(name = "member_name", nullable = false)
    private String memberName;

    @Column(name = "primary_phone_number")
    private String primaryPhoneNumber;

    @Column(name = "status")
    private String status;

    @Column(name = "policy_matured")
    private Boolean policyMatured;

    @Column(name = "ward")
    private String ward;

    @Column(name = "subcounty")
    private String subCounty;

    @Column(name = "county")
    private String county;

    @Column(name = "group_name")
    private String groupName;

    // --- Constructors ---
    public Member() {
        // default constructor required by JPA
    }

    public Member(String idNumber, String memberName, String primaryPhoneNumber,
                  String status, Boolean policyMatured, String ward,
                  String subCounty, String county, String groupName) {
        this.idNumber = idNumber;
        this.memberName = memberName;
        this.primaryPhoneNumber = primaryPhoneNumber;
        this.status = status;
        this.policyMatured = policyMatured;
        this.ward = ward;
        this.subCounty = subCounty;
        this.county = county;
        this.groupName = groupName;
    }

    // --- Getters and Setters ---
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getPolicyMatured() {
        return policyMatured;
    }

    public void setPolicyMatured(Boolean policyMatured) {
        this.policyMatured = policyMatured;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getSubCounty() {
        return subCounty;
    }

    public void setSubCounty(String subCounty) {
        this.subCounty = subCounty;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
