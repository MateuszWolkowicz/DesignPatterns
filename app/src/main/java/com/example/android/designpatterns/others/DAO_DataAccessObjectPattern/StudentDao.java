package com.example.android.designpatterns.others.DAO_DataAccessObjectPattern;

import java.util.List;

/**
 * Created by MateuszW on 2018-05-01.
 */

public interface  StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
