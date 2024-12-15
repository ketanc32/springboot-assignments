package com.example.week1HW.HomeworkWeek1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup.type" , havingValue = "chocolate")
public class ChocolateSyrup implements Syrup{

    @Override
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}
