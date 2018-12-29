package com.example.android.designpatterns.StructuralPatterns.CompositePattern.DepartmentsHierarchy;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    List<Department> departmentList = new ArrayList<>();

    public void addDepartment(Department department) {
        departmentList.add(department);
    }


    @Override
    public void printDepartmentName() {
        for (Department department : departmentList) {
            department.printDepartmentName();
        }
    }



}
