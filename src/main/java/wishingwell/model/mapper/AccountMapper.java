package wishingwell.model.mapper;

import org.springframework.jdbc.core.RowMapper;
import wishingwell.model.entity.Account;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account = new Account();
        account.setEmail(rs.getString("email"));
        account.setFirstName(rs.getString("firstName"));
        account.setLastName(rs.getString("lastName"));
        return account;
    }
}
