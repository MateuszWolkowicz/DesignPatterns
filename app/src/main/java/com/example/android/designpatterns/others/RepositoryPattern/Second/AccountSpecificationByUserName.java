package com.example.android.designpatterns.others.RepositoryPattern.Second;

/**
 * Created by MateuszW on 2018-05-02.
 */

public class AccountSpecificationByUserName  implements AccountSpecification, HibernateSpecification {

    private String desiredUserName;

    public AccountSpecificationByUserName(String desiredUserName) {
        super();
        this.desiredUserName = desiredUserName;
    }

    @Override
    public boolean specified(Account account) {
        return account.hasUseName(desiredUserName);
    }

    @Override
    public String toCriteria() {
        return  desiredUserName;
    }

}
