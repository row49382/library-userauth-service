package com.row49382.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "USER_ROLE_MAPPING")
public class UserRoleMapping {
    @Id
    @Column(name = "user_role_mapping_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userRoleId;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "role")
    private String role;

    public long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
