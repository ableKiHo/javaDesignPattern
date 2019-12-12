package CH4.CREATE_PATTERN.Proxy.dynamic;

import java.sql.Connection;

public class MemberService {
    //탈퇴 기능
    public void withdraw(Connection connection, Member member) throws Exception {
        if(connection == null) {
            throw new IllegalArgumentException("Connection cannot be null");
        }
        try {
            connection.setAutoCommit(false);

            new MemberDAO(connection).withdraw(member);

            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
