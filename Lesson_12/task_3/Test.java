package Lesson_12.task_3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
     List<Integer>list=new ArrayList<>();
        for (int i = 1; i <=10; i++) {
            list.add(i);
        }
        list.sort(new SortMyNumber());
        System.out.println(list);





    }
}

