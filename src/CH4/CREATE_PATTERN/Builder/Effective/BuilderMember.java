package CH4.CREATE_PATTERN.Builder.Effective;

public class BuilderMember {

    //TODO 장점: 인자의 의미를 알기 쉽다. setter가 제공되지 않는다. 한번에 객체를 생성한다. build()함수가 잘못된 값 체크를 할 수 있다.
    //TODO Lombok @Builder와 비슷하다.

    private final String name;
    private final String location;
    private final String hobby;

    public static class Builder {
        private final String name; //필수인자
        private String location = "출신지역 비공개"; //선택전 인자
        private String hobby = "취미 비공개"; //선택적 인자

        public Builder(String name) {
            this.name = name;
        }

        public Builder location(String s) {
            location = s;
            return this;
        }

        public Builder hobby(String s) {
            hobby = s;
            return this;
        }

        public BuilderMember build() {
            return new BuilderMember(this);
        }
    }

    private BuilderMember(Builder builder) {
        name = builder.name;
        location = builder.location;
        hobby = builder.hobby;
    }

    @Override
    public String toString() {
        return "BuilderMember{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
