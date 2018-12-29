package com.example.android.designpatterns.others.RepositoryPattern.Third;

import java.util.List;

/**
 * Created by MateuszW on 2018-05-03.
 */

public interface UserDao {
    User find(String id);

    List<User> findAll();
}
