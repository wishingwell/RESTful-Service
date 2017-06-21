package wishingwell.datastore.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import wishingwell.datastore.dao.AccountDao;
import wishingwell.model.entity.Account;
import wishingwell.model.mapper.AccountMapper;

import javax.sql.DataSource;

@Component
public class AccountDaoImpl implements AccountDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Account getAccountByEmail(String email) {
        return jdbcTemplate.queryForObject("SELECT * FROM account", new AccountMapper());
    }

}
