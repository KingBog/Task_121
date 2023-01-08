package Lesson_12.task_5;

import Lesson_12.task_2.RealEstate;

import java.util.Comparator;

public class MySotrComparetor implements Comparator<RealEstate> {

    @Override
    public int compare(RealEstate o1, RealEstate o2) {
        int num = o1.getPrice() - o2.getPrice();
        if (num != 0) {
            return o1.getPrice() - o2.getPrice();
        } else {
            int num2 = o2.getPlost() - o1.getPlost();
            if (num2 != 0) {
                return num2;
            }else {
                return o2.getRoom()- o1.getRoom();


            }
        }
    }
}




