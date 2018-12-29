package com.example.android.designpatterns.CreationalPatterns.BuilderPattern.User;

public class UserBuilderBuilderPatternDemo {

    public void Create() {
        new User.Builder()
                .setAge(10)
                .create();
    }
}
