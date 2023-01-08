package Lesson_12.task_2;

import Lesson_12.task_5.MySotrComparetor;
import Lesson_12.task_6.MySortComporator6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RealEstate>list=new ArrayList<>(List.of(new RealEstate(100,50,3),
                new RealEstate(100,60,2),
                new RealEstate(100,50,3)));
        for (RealEstate resul:list){
            System.out.println(resul);
        }
        System.out.println("++++++++++++++++++++++++++++=");
        list.sort(null);
        for (RealEstate resul1:list){
            System.out.println(resul1);
        }
        System.out.println("+++++++++++++++++++++++++++++");
        MySotrComparetor mls=new MySotrComparetor();
        list.sort(mls);
        for (RealEstate resul2:list){
            System.out.println(resul2);
        }
        System.out.println("+++++++++++++++++++++++++++++task6");
        MySortComporator6 msc6=new MySortComporator6();
        list.sort(msc6);
        for (RealEstate result3:list){
            System.out.println(result3);
        }

    }
}
