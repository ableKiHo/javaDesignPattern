package CH4.CREATE_PATTERN.Builder.Effective;

public class TelescopingConstructorMember {

    //TODO 점층적 생성자 패턴
    //TODO 단점 : 인자수가 많을경우 호출 코드만으로 의미를 알수 없다. 장점: 1회 호출로 객체가 생성된다.

    private final String name;
    private final String location;
    private final String hobby;

    public TelescopingConstructorMember(String name) {
        this(name, "출신지역 비공개", "취미 비공개");
    }

    public TelescopingConstructorMember(String name, String location) {
        this(name, location, "취미 비공개");
    }

    public TelescopingConstructorMember(String name, String location, String hobby) {
        this.name = name;
        this.location = location;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "TelescopingConstructorMember{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
