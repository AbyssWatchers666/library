package com.qf.entity;

public class Permissions {
    private Integer permissionId;

    private String permissionName;

    private String permissionStr;

    private Byte permissionType;

    private String path;

    private String img;

    private Byte order;

    private Integer fatherNode;

    private Integer isDelete;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getPermissionStr() {
        return permissionStr;
    }

    public void setPermissionStr(String permissionStr) {
        this.permissionStr = permissionStr == null ? null : permissionStr.trim();
    }

    public Byte getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(Byte permissionType) {
        this.permissionType = permissionType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Byte getOrder() {
        return order;
    }

    public void setOrder(Byte order) {
        this.order = order;
    }

    public Integer getFatherNode() {
        return fatherNode;
    }

    public void setFatherNode(Integer fatherNode) {
        this.fatherNode = fatherNode;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}