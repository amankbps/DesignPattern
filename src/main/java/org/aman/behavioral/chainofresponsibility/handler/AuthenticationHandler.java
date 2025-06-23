package org.aman.behavioral.chainofresponsibility.handler;

import org.aman.behavioral.chainofresponsibility.model.Request;

public class AuthenticationHandler implements RequestHandler {
     private final RequestHandler nextHandler;
     public AuthenticationHandler(RequestHandler nextHandler) {
         this.nextHandler = nextHandler;
     }

    @Override
    public void handleRequest(Request request) {
        if(request.user==null){
            System.out.println("Authentication Failed");
            return;
        }
        System.out.println("Authentication Successful");
        nextHandler.handleRequest(request);

    }
}
