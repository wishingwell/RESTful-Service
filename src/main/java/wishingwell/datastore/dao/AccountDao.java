package wishingwell.datastore.dao;

import wishingwell.model.entity.Account;

public interface AccountDao {
    public Account getAccountByEmail(String email);
}
