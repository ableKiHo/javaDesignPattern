package BONUS.PATTERN.Async;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AnyOfTest {
    private String buildMessage(int index) {
        try {
            Thread.sleep(2 * index *100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Completed!! [" + index + "]";
    }

    @Test
    public void anyOfTest() throws Exception{
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> buildMessage(2));
        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> buildMessage(1));
        CompletableFuture<String> cf3 = CompletableFuture.supplyAsync(() -> buildMessage(3));

        List<CompletableFuture<String>> completableFutures = Arrays.asList(cf1, cf2, cf3);

        CompletableFuture.anyOf(completableFutures.toArray(new CompletableFuture[3]))
                .thenAcceptAsync(result -> System.out.println(result));

        Thread.sleep(11 * 1000L);
    }
}
