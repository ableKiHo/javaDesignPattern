package CH4.CREATE_PATTERN.Proxy.dynamic;

import java.sql.Connection;

public class MemberDAO {
    private Connection connection;

    public MemberDAO(Connection connection) {
        this.connection = connection;
    }

    public void withdraw(Member member) {
        System.out.println("MemberDAO.withdraw");
    }
}
