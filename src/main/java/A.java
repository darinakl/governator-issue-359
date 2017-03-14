import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class A {
    private InterfaceB b;

    @Inject
    public A(InterfaceB b) {
        this.b = b;
    }

    @PostConstruct
    public void useInstanceB() {
        b.printMe();
    }
}

