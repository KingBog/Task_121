package Lesson_12.task_6;

import Lesson_12.task_2.RealEstate;

import java.util.Comparator;

public class MySortComporator6 implements Comparator<RealEstate> {
    @Override
    public int compare(RealEstate o1, RealEstate o2) {
        int num=o2.getPlost()- o1.getPlost();
        if (num!=0){
            return num;
        }else {
            int num2=o2.getRoom()-o1.getRoom();
            if (num2!=0){
                return num2;
            }else{
                return o1.getPrice()-o2.getPrice();
            }
        }
    }
}
