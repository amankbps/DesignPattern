package org.aman.behavioral.chainofresponsibility.handler;

import org.aman.behavioral.chainofresponsibility.model.Request;

public interface RequestHandler {
    void handleRequest(Request request);
}
