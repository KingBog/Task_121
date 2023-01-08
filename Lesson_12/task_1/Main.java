package Lesson_12.task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Planet>planets=new ArrayList<>(List.of(
                new Planet("Сатурн",11.0),
                new Planet("Венера",10.2),
                new Planet("Марс",14.1),
                new Planet("Земля",12.5),
                new Planet("Меркурий",29.2),
                new Planet("Юпитер",20.4)));
        planets.sort(null);
        System.out.print(planets);

    }
}
