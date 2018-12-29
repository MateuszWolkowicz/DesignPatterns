package com.example.android.designpatterns.StructuralPatterns.CompositePattern.DepartmentsHierarchy;

public class SalesDepartment implements Department {
    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
