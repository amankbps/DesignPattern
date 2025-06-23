package org.aman.behavioral.chainofresponsibility.model;

public class Request {
    public String user;
    public String userRole;
    public int requestCount;
    public String payload;
    public Request(String user, String userRole, int requestCount, String payload) {
        this.user = user;
        this.userRole = userRole;
        this.requestCount = requestCount;
        this.payload = payload;
    }
}
