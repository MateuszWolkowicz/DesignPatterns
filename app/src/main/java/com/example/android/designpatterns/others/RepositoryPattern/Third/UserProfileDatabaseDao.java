package com.example.android.designpatterns.others.RepositoryPattern.Third;

import java.util.List;

/**
 * Created by MateuszW on 2018-05-03.
 */

public class UserProfileDatabaseDao implements UserProfileDao
{


    @Override
    public User find(String id) {
        return null;
    }

    @Override
    public List<User> findByUserId(String id) {
        return null;
    }
}
