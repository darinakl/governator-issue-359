import com.google.inject.AbstractModule;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(InterfaceB.class).to(B.class);
        bind(A.class);
        bind(B.class);
    }
}
