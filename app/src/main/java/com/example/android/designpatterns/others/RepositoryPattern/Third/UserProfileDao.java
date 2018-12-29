package com.example.android.designpatterns.others.RepositoryPattern.Third;

import java.util.List;

/**
 * Created by MateuszW on 2018-05-03.
 */

public interface UserProfileDao {

    User find(String id);

    List<User> findByUserId(String id);
}
