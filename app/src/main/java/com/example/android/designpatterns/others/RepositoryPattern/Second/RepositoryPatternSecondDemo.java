package com.example.android.designpatterns.others.RepositoryPattern.Second;

import java.util.List;

/**
 * Created by MateuszW on 2018-05-02.
 */

public class RepositoryPatternSecondDemo {
    private final AccountRepository repository;

    public RepositoryPatternSecondDemo(AccountRepository repository) {
        this.repository = repository;
        final List ageRange = repository.query(new AccountSpecificationByAgeRange(5,10));
        final List userName = repository.query(new AccountSpecificationByUserName("Ok"));
    }



}
