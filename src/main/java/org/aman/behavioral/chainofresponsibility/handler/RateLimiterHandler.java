package org.aman.behavioral.chainofresponsibility.handler;

import org.aman.behavioral.chainofresponsibility.model.Request;

public class RateLimiterHandler implements RequestHandler {
    private final RequestHandler nextHandler;
    public RateLimiterHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public void handleRequest(Request request) {

        if(request.requestCount>=100){
            System.out.println("Rate limit reached");
            return;
        }
        System.out.println("within rate limit");
        nextHandler.handleRequest(request);

    }
}
