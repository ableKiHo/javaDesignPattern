package CH4.CREATE_PATTERN.adapter.web;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AdapterDemo {
    public static void main(String[] args) {

        WebRequester webRequester = new OldWebRequester();
        webRequester.requestHandler();

        //TODO Adaptee를 감싸고, Target Interface 만을 클라이언트에게 드러낸다.
        //TODO Target Interface 를 구현하여 클라이언트가 예상하는 인터페이스가 되도록 Adaptee의 인터페이스를 간접적으로 변경
        //TODO Adaptee가 기대하는 방식으로 클라이언트의 요청을 간접적으로 변경
        //TODO 호환되지 않는 우리의 인터페이스와 Adaptee를 함께사용
        System.out.println("===========================================");
        WebAdapter adapter = new WebAdapter(new FancyRequester());
        WebClient client = new WebClient(adapter);
        client.doWork();

        // TODO JDK EXAMPLE
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
}
