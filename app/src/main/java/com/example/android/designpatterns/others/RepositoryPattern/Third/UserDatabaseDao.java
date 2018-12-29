package com.example.android.designpatterns.others.RepositoryPattern.Third;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MateuszW on 2018-05-03.
 */

public class UserDatabaseDao implements UserDao
{
    public User find(String id)
    {

        return new User(id,"Name" + id);
    }

    public List<User> findAll()
    {
        List<User> listUser = new ArrayList();
        listUser.add(new User("1","Name 1"));
        listUser.add(new User("2","Name 2"));
        return listUser;
    }
}
