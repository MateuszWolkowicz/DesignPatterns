package com.example.android.designpatterns.CreationalPatterns.BuilderPattern.User;

public class User {

    private String firstName;
    private String lastName;
    private int age;

    private User(final Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
    }
    // if some parameters are required
//    private User(String firstName, String lastName, int age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private int age;

        public Builder setFirstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(final int age) {
            this.age = age;
            return this;
        }

        public User create() {
            return new User(this);
            // if some parameters are required
//            User user = new User(firstName, lastName, age);
//            if (user.firstName.isEmpty()) {
//                throw new IllegalStateException(
//                        "First name can not be empty!");
//            }
//            return user;
        }
    }
}
