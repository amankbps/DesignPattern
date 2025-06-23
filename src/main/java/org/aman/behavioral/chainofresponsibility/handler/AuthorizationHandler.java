package org.aman.behavioral.chainofresponsibility.handler;

import org.aman.behavioral.chainofresponsibility.model.Request;

public class AuthorizationHandler implements RequestHandler{
    private final RequestHandler requestHandler;
    public AuthorizationHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }
    @Override
    public void handleRequest(Request request) {
        if(!"ADMIN".equals(request.userRole)){
            System.out.println("Access denied");
            return;
        }
        System.out.println("Access granted");
        requestHandler.handleRequest(request);

    }
}
