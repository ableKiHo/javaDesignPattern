package CH4.CREATE_PATTERN.Builder.Effective;

public class JavaBeanMember {

    //TODO 장점: 각 인자의 값을 쉽게 알수 있다. 단점: 1회의 호출로 객체 생성이 끝나지 않는다. setter 제공으로 immutable 클래스 불가.

    private String name;
    private String location;
    private String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "JavaBeanMember{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
