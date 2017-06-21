package wishingwell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wishingwell.datastore.dao.AccountDao;
import wishingwell.model.entity.Account;

@RestController
public class AccountController {

    private AccountDao accountDao;

    @RequestMapping(value = "/v1/account", method = RequestMethod.GET)
    public Account handleGet(@RequestParam("email") String email) {
        return accountDao.getAccountByEmail(email);
    }

    @Autowired
    @Qualifier("accountDaoImpl")
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
