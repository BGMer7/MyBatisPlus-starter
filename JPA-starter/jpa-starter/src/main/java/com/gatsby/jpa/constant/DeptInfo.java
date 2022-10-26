package com.gatsby.jpa.constant;

public enum DeptInfo {

    FINANCE("0001", "shanghai", 2, "Nick"),
    HUMAN_RESOURCE("0002", "shanghai", 3, "Tony");
    private String code;
    private String location;
    private int headcount;
    private String manager;

    DeptInfo(String code, String location, int headcount, String manager) {
        this.code = code;
        this.location = location;
        this.headcount = headcount;
        this.manager = manager;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHeadcount() {
        return headcount;
    }

    public void setHeadcount(int headcount) {
        this.headcount = headcount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
