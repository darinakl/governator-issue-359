import com.netflix.governator.guice.LifecycleInjector;
import com.netflix.governator.guice.LifecycleInjectorBuilder;

public class Main {
    public static void main(String [] args) {
        LifecycleInjectorBuilder lifecycleInjectorBuilder = LifecycleInjector.builder().withModules(new Module());
        lifecycleInjectorBuilder.build().createInjector();
        System.out.println("DONE");
    }
}
