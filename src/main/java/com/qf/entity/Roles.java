package com.qf.entity;

public class Roles {
    private Integer roleId;

    private String roleName;

    private String state;

    private String permissionsStr;

    private Integer isDelete;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getPermissionsStr() {
        return permissionsStr;
    }

    public void setPermissionsStr(String permissionsStr) {
        this.permissionsStr = permissionsStr == null ? null : permissionsStr.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}