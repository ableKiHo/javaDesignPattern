package BONUS.PATTERN.Async;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class AllOfTest {

    private String buildMessage() {
        try {
            Thread.sleep(5 * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Completed!!";
    }

    @Test
    public void allOfTest() throws Exception {

        //TODO 동시에 3개의 Rest 요청을 보내고 3개의 요청이 완료 되면 Callback을 진행
        //TODO CompletableFuture.allOf 사용
        //TODO 5초 뒤 "Completed!!"를 반환하는 buildMessage 메서드를 동시에 3개 호출
        //TODO 완료되면 그 결과를 마지막 thenAcceptAsync에서 모두 모아서 처리
        //TODO 선후 관계가 없는 데이터를 동시에 조회 할때 사용 가능

        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(this::buildMessage);
        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(this::buildMessage);
        CompletableFuture<String> cf3 = CompletableFuture.supplyAsync(this::buildMessage);

        List<CompletableFuture<String>> completableFutures = Arrays.asList(cf1, cf2, cf3);

        CompletableFuture.allOf(completableFutures.toArray(new CompletableFuture[3]))
                .thenApplyAsync(result -> completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList()))
                .thenAcceptAsync(messages -> messages.forEach(System.out::println));

        Thread.sleep(11 * 1000L);
    }
}
