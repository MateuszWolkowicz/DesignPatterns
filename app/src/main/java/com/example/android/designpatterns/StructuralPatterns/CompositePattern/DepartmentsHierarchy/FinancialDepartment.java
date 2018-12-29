package com.example.android.designpatterns.StructuralPatterns.CompositePattern.DepartmentsHierarchy;

public class FinancialDepartment implements Department {

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
