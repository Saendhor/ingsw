package ChainOfResponsability.handler;

import ChainOfResponsability.*;

/* Handler */
public interface SupportHandler {
    void handleRequest(Request request);
    void setNextHandler(SupportHandler nextHandler);
}