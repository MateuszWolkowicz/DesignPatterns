package com.example.android.designpatterns.StructuralPatterns.CompositePattern.DepartmentsHierarchy;

public class CompositePatternDepartmentsDemo {


    public static void main(String[] args) {
        Department department1 = new FinancialDepartment();
        Department department2 = new SalesDepartment();

        HeadDepartment headDepartment = new HeadDepartment();

        headDepartment.addDepartment(department1);
        headDepartment.addDepartment(department2);

        headDepartment.printDepartmentName();
    }

}
