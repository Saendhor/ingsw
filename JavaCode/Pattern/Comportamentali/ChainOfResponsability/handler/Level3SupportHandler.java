package ChainOfResponsability.handler;

import ChainOfResponsability.*;

/* ConcreteHandler3 */
public class Level3SupportHandler implements SupportHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.CRITICAL) {
            System.out.println("Level 3 Support handled the request.");
        } else {
            System.out.println("Request cannot be handled.");
        }
    }

    public void setNextHandler(SupportHandler nextHandler) {
        // No next handler for Level 3
    }
}
