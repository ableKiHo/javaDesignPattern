package CH4.CREATE_PATTERN.Singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestSingletonMain {
    public static void main(String[] args) {
        //TODO new 연산자를 사용못함.
        //TestSingleton errTestSingleton = new TestSingleton();
        TestSingleton testSingleton = TestSingleton.getInstance();

        //TODO 예제를 보면.....

        //TODO 싱글턴 패턴의 문제점은 멀티스레딩 환경에서 사용시 동기화 문제 등..이펙티브 자바 참고

        //TODO enum 타입을 이용하여 생성을 적극 권장. enum 타입은 생성등을 JVM이 알아서 처리함.
        TestEnumSingleton testEnumSingleton = TestEnumSingleton.INSTANCE;

        //TODO 보통 싱글턴 객체를 직접 만들어서 사용하지는 않음. 대신 프레임워크를 이용. 대표적인 사용 예는 스프링 빈.

        //TODO 싱글턴 객체가 상태값을 가지고 있다면?

        //TODO 싱클턴 특성상 상태관리에 주의를 기울여야.. 상태가 없는 무상태 형태로 만들어져야 하며

        //TODO 필요한 경우 로컬변수, 파라미터, 리턴 값등을 이용.
    }

    @Test
    public void singletonInstanceTest() {
        TestDto testDto1 = new TestDto();
        TestDto testDto2 = new TestDto();

        assertThat(testDto1.equals(testDto2), is(false));
        assertThat(testDto1 == testDto2, is(false));

        TestSingleton testSingleton1 = TestSingleton.getInstance();
        TestSingleton testSingleton2 = TestSingleton.getInstance();

        assertThat(testSingleton1 == testSingleton2, is(true));
        assertThat(testSingleton1.equals(testSingleton2), is(true));
    }

    @Test
    public void enumSingletonInstatnceTest() {
        TestEnumSingleton testEnumSingleton1 = TestEnumSingleton.INSTANCE;
        TestEnumSingleton testEnumSingleton2 = TestEnumSingleton.INSTANCE;

        assertThat(testEnumSingleton1 == testEnumSingleton2, is(true));
        assertThat(testEnumSingleton1.equals(testEnumSingleton2), is(true));

    }

    static class TestDto {
        public TestDto() {
            System.out.println("Dto Instance Created...");
        }
    }
}
