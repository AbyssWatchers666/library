package com.qf.entity;

public class ReaderTypes {
    private Integer readerTypeId;

    private String readerTypeName;

    private Byte borrowDay;

    private Byte borrowNumber;

    private Byte continueNumber;

    private Float deposit;

    private Integer isDelete;

    public Integer getReaderTypeId() {
        return readerTypeId;
    }

    public void setReaderTypeId(Integer readerTypeId) {
        this.readerTypeId = readerTypeId;
    }

    public String getReaderTypeName() {
        return readerTypeName;
    }

    public void setReaderTypeName(String readerTypeName) {
        this.readerTypeName = readerTypeName == null ? null : readerTypeName.trim();
    }

    public Byte getBorrowDay() {
        return borrowDay;
    }

    public void setBorrowDay(Byte borrowDay) {
        this.borrowDay = borrowDay;
    }

    public Byte getBorrowNumber() {
        return borrowNumber;
    }

    public void setBorrowNumber(Byte borrowNumber) {
        this.borrowNumber = borrowNumber;
    }

    public Byte getContinueNumber() {
        return continueNumber;
    }

    public void setContinueNumber(Byte continueNumber) {
        this.continueNumber = continueNumber;
    }

    public Float getDeposit() {
        return deposit;
    }

    public void setDeposit(Float deposit) {
        this.deposit = deposit;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}