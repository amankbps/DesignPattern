package org.aman.behavioral.chainofresponsibility.factory;

import org.aman.behavioral.chainofresponsibility.handler.*;

public class RequestHandlerFactory {

    public static RequestHandler getRequestHandler() {
        return new AuthenticationHandler(
                new AuthorizationHandler(
                        new RateLimiterHandler(
                                new ValidationHandler(
                                        new BusinessLogicHandler()
                                )
                        )
                )
        );
    }
}
