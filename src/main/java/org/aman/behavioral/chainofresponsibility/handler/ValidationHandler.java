package org.aman.behavioral.chainofresponsibility.handler;

import org.aman.behavioral.chainofresponsibility.model.Request;

public class ValidationHandler implements RequestHandler{
    private final RequestHandler nextHandler;
    public ValidationHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public void handleRequest(Request request) {
        if(request.payload==null || request.payload.trim().isEmpty()){
            System.out.println("Invalid Payload");
            return;
        }
        System.out.println("Payload valid");
        nextHandler.handleRequest(request);

    }
}
