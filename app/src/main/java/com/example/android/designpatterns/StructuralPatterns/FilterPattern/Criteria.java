package com.example.android.designpatterns.StructuralPatterns.FilterPattern;

import java.util.List;

/**
 * Created by MateuszW on 2018-03-22.
 */

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
