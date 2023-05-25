package pl.camp.it.context.authentocation;

import org.springframework.stereotype.Component;

@Component
public class Authenticator3 implements IAuthenticator {
    @Override
    public void authenticate() {
        System.out.println("Cos nowego");
    }
}
