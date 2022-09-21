import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class VirtualThreads {
    public static void main(String[] args) {
        System.out.println("---------");
        try (ExecutorService e = Executors.newVirtualThreadPerTaskExecutor()) {
            e.submit(() -> System.out.println("1"));
            e.submit(() -> System.out.println("2"));
        }
        System.out.println("---------");
    }
}


