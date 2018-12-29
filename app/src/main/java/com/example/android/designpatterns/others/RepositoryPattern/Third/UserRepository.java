package com.example.android.designpatterns.others.RepositoryPattern.Third;

/**
 * Created by MateuszW on 2018-05-03.
 */

public class UserRepository {
//      /* @var UserDatabaseDao */
//    private UserDatabaseDao userDao;
//
//    /* @var UserProfileDatabaseDao */
//    private UserProfileDatabaseDao userProfileDao;
//
//    public UserRepository()
//    {
//        this.userDao = new UserDatabaseDao();
//        this.userProfileDao = new UserProfileDatabaseDao();
//    }
//
//    public function find($id)
//    {
//        $row = $this->userDao->find($id);
//        $user = new User($row['id'], $row['name']);
//
//        $row = $this->userProfileDao->findByUserId($id);
//        if (isset($row['id'])) {
//            $profile = new UserProfile($row['id']);
//            $user->setProfile($profile);
//        }
//
//        return $user;
//    }
//
//    public function findAll()
//    {
//        $users = array();
//        $rows = $this->userDao->findAll();
//        foreach ($rows as $row) {
//        $users[] = new User($row['id'], $row['name']);
//    }
//        return new Users($users);
//    }
}
