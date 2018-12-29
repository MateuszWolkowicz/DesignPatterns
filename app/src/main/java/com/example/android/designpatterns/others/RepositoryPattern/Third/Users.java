package com.example.android.designpatterns.others.RepositoryPattern.Third;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MateuszW on 2018-05-03.
 */

public class Users
{
    private List<User> elements = new ArrayList();

    public Users(List<User> users)
    {
        for (User usersOne : users) {
                if ((users instanceof User)) {
                    elements.add(usersOne);
                }
        }
    }

    public List<User> toArray()
    {
        return elements;
    }
}