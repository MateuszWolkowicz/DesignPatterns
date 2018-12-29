package com.example.android.designpatterns.others.RepositoryPattern.Second;

import java.util.List;

/**
 * Created by MateuszW on 2018-05-02.
 */

public interface AccountRepository {

    void addAccount(Account account);
    void removeAccount(Account account);
    void updateAccount(Account account); // Think it as replace for set

    List query(AccountSpecification specification);

}
