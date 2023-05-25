package pl.camp.it.context.authentocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cos")
public class Authenticator implements IAuthenticator {
    public void authenticate() {
        System.out.println("metoda authenticate z klasy Authenticator !!!");
    }
}
