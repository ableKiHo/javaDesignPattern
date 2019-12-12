package CH4.CREATE_PATTERN.Proxy.caching;

public class ProxyImageMain {
    public static void main(String[] args) {
        // TODO Proxy 패턴을 사용하는 경우는 실제 객체의 생성시간이 오래 걸리는 경우
        // TODO 간단한 초기 작업들은 Proxy에서 수행을 하고 가장 중요한 마지막 작업은 실제 객체가 수행

        Image image = new PorxyImage("Real_Big_Size_Image.png");

        System.out.println(">>>>>>>>>>>>>>>>>>>>image will be loaded from disk");
        image.display();
        System.out.println("===================================");
        System.out.println(">>>>>>>>>>>>>>>>>>>>image will not be loaded from disk");
        image.display();

    }
}
