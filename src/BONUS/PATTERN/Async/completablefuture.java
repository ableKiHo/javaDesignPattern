package BONUS.PATTERN.Async;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class completablefuture {

    Runnable task = () -> {
        try {
            TimeUnit.SECONDS.sleep(5L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("TASK completed");
    };

    @Test
    public void completableFuture() throws Exception {
        CompletableFuture.runAsync(task)
                .thenCompose(aVoid -> CompletableFuture.runAsync(task))
                .thenAcceptAsync(aVoid -> System.out.println("all tasks completed!!"))
                .exceptionally(throwable -> {
                    System.out.println("exception occurred!!");
                    return null;
                });

        try {
            TimeUnit.SECONDS.sleep(10L);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
