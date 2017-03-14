import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by darinaklots on 14/03/2017.
 */
@Singleton
public class B implements InterfaceB {
    private final A a;

    @Inject
    public B(A a) {
        this.a = a;
    }

    @Override
    public void printMe() {
        System.out.println("Hello from class B");
    }
}
