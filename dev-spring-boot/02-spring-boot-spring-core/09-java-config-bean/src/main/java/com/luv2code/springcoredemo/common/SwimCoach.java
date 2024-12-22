package com.luv2code.springcoredemo.common;

public class SwimCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warmup";
    }

    public SwimCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

}
