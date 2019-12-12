package CH4.CREATE_PATTERN.Proxy.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;

public class MemberWithdrawMain {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:jdbc:mysql://localhost:3306/" , "user" , "password");
        Member member = new Member();

        //TODO 트랜잭션 자체 처리 (try - catch - finally)
        try {

            MemberService memberService = new MemberService();
            memberService.withdraw(connection, member);
        }catch (Exception e) {
            throw e;
        }finally {
            try {
                connection.close();
            }catch (Exception e) { }
        }

        // TODO 트랜잭션 자체 처리(try with resource)
        try (Connection connection2 = DriverManager.getConnection("jdbc:jdbc:mysql://localhost:3306/" , "user" , "password")) {
            Member member2 = new Member();
            MemberService memberService = new MemberService();
            memberService.withdraw(connection2, member2);

        } catch (Exception e) {
            throw e;
        }

        //TODO Proxy 트랜잭션 처리(try with resource)
        try (Connection connection2 = DriverManager.getConnection("jdbc:jdbc:mysql://localhost:3306/" , "user" , "password")) {
            Member member2 = new Member();
            IMemberService memberService = new TransactionalMemberServiceImpl();
            memberService.withdraw(connection2, member2);

        } catch (Exception e) {
            throw e;
        }

        // TODO 트랜잭션 처리가 필요한 기능을 새로 구현할 때마다 Transactional..... 구현체를 새로 만들어야...
        //  그래서 AOP!
    }
}
