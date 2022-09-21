package devoxx.challenges;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("---------");
        try (ExecutorService e = Executors.newVirtualThreadPerTaskExecutor()) {
            Thread.sleep(2000);
            e.submit(() -> System.out.println("Spock"));
            e.submit(() -> System.out.println("Worf"));
        }
        System.out.println("---------");
    }
}


