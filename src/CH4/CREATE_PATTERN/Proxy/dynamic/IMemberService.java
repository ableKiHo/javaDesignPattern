package CH4.CREATE_PATTERN.Proxy.dynamic;

import java.sql.Connection;

public interface IMemberService {
    public void withdraw(Connection connection, Member member) throws Exception;
}
