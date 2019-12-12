package CH4.CREATE_PATTERN.Proxy.dynamic;

import java.sql.Connection;

public class MemberServiceImpl implements IMemberService {
    @Override
    public void withdraw(Connection connection, Member member) throws Exception {
        new MemberDAO(connection).withdraw(member);
    }
}
