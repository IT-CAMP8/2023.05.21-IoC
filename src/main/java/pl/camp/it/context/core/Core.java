package pl.camp.it.context.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.camp.it.context.authentocation.Authenticator;
import pl.camp.it.context.authentocation.Authenticator2;
import pl.camp.it.context.authentocation.IAuthenticator;
import pl.camp.it.context.db.Database;

@Component
public class Core {
    @Autowired
    Database database;
    @Autowired
    @Qualifier("cos")
    private IAuthenticator authenticator10;

    /*public Core(@Autowired Authenticator authenticator) {
        this.authenticator = authenticator;
    }*/

    public void start() {
        System.out.println("metoda start z klasy core !!!");
        this.database.getCos();
        this.authenticator10.authenticate();
    }

    /*@Autowired
    public void setAuthenticator(Authenticator authenticator) {
        this.authenticator = authenticator;
    }*/
}
