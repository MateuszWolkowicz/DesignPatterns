package com.example.android.designpatterns.others.RepositoryPattern.Third;

/**
 * Created by MateuszW on 2018-05-03.
 */

public class User
{
    private String id;
    private String name;

    /* @var UserProfile */
    private UserProfile profile;

    public User(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void setProfile(UserProfile profile)
    {
        this.profile = profile;
    }

    public UserProfile getProfile()
    {
        return profile;
    }
}