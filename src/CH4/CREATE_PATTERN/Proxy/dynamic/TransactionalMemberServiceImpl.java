package CH4.CREATE_PATTERN.Proxy.dynamic;

import java.sql.Connection;

public class TransactionalMemberServiceImpl implements IMemberService {
    private IMemberService subject;

    public TransactionalMemberServiceImpl() {
        this.subject = new MemberServiceImpl();
    }

    @Override
    public void withdraw(Connection connection, Member member) throws Exception {
        if(connection == null) {
            throw new IllegalArgumentException("Connection cannot be null");
        }

        try {
            connection.setAutoCommit(false);
            subject.withdraw(connection, member);
            connection.commit();
        }catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
