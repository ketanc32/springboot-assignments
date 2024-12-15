package com.example.week1HW.HomeworkWeek1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    private Frosting frosting;

    @Autowired
    private Syrup syrup;

    public void bakeCake(){
        System.out.println("Baking a cake with "+
                frosting.getFrostingType()+
                " and "+
                syrup.getSyrupType());
    }
}
