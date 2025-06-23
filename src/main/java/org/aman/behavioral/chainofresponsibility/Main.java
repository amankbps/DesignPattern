package org.aman.behavioral.chainofresponsibility;

import org.aman.behavioral.chainofresponsibility.factory.RequestHandlerFactory;
import org.aman.behavioral.chainofresponsibility.handler.*;
import org.aman.behavioral.chainofresponsibility.model.Request;

public class Main {
    public static void main(String[] args) {

        //create handler
        Request request = new Request("Aman","ADMIN",10,"{data:123}");
        RequestHandler handle= RequestHandlerFactory.getRequestHandler();

       handle.handleRequest(request);
    }
}
