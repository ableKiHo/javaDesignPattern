package CH4.CREATE_PATTERN.Builder.Effective;

public class BuilderPatternMain {
    public static void main(String[] args) {
        //TODO 1.점층적 생성자 패턴
        TelescopingConstructorMember member1 = new TelescopingConstructorMember("엄기호");
        TelescopingConstructorMember member2 = new TelescopingConstructorMember("엄기호", "청주");
        TelescopingConstructorMember member3 = new TelescopingConstructorMember("엄기호", "청주", "운동");

        printMember("점층적 생성자 패턴" , member3);

        //TODO 2.자바빈 패턴
        JavaBeanMember member4 = new JavaBeanMember();
        member4.setName("엄기호");
        member4.setLocation("청주");
        member4.setHobby("운동");
        printMember("자바빈 패턴" , member4);

        //TODO 3.빌더 패턴
        BuilderMember member5 = new BuilderMember.Builder("엄기호")
                                                            .location("청주")
                                                            .hobby("운동")
                                                            .build();
        printMember("빌더 패턴" , member5);

    }
    public static void printMember(String type, Object member ) {
        System.out.println(type + " :" + member.toString());
        System.out.println("=============================================================================");
    }
}
