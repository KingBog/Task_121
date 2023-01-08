package Lesson_12.task_3;

import java.util.Comparator;

public class SortMyNumber implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1==0){
            return 0;
        }else if (o2==0) {
            return -1;
        }else if (o1%2!=0&& o2%2!=0){
            return o2-o1;
        }else if (o1%2==0 && o2%2==0){
            return o1-o2;
        }else if (o1%2==0&&o2%2!=0){
            return -1;
        }else if (o1%2!=0&&o2%2==0){
            return 1;
        }else return 0;
    }
}
