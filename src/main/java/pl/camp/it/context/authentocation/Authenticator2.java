package pl.camp.it.context.authentocation;

import org.springframework.stereotype.Component;

@Component("cos")
public class Authenticator2 implements IAuthenticator {
    public void authenticate() {
        System.out.println("metoda authenticate z klasy Authenticator2 !!!");
    }
}
