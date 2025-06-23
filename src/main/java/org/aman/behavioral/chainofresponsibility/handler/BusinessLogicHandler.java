package org.aman.behavioral.chainofresponsibility.handler;

import org.aman.behavioral.chainofresponsibility.model.Request;

public class BusinessLogicHandler implements RequestHandler{

    @Override
    public void handleRequest(Request request) {
        System.out.println("Processing Request...");
    }
}
