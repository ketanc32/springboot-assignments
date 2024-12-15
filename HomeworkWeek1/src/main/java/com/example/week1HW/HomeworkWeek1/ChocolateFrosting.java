package com.example.week1HW.HomeworkWeek1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frost.type" , havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
