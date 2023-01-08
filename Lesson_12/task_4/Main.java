package Lesson_12.task_4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple orange cherry");
        list.add("samsung acer macbook");
        list.add("java ruby python");
        list.add("netflix appletv amedia");
        File file=new File("text.txt");
        File file1=new File("text1.txt");
        File file2=new File("text2.txt");
        while (true) {
            Scanner scn= new Scanner(System.in);
            System.out.println("1. отсортируйте строки в алфавитном порядке\n" +
                    "2. отсортируйте строки в алфавитном порядке по одному словe\n" +
                    "3. отсортируйте эти строки по длине (по возрастанию");
            int value=scn.nextInt();
            if (value==1){
                saveYourText(file,list);
            }else if (value==2){
                System.out.println("Введитет индек слова");
                int index=scn.nextInt();
                SortbyIndex sortbyIndex=new SortbyIndex(index);
                list.sort(sortbyIndex);
                saveYuorText2(file1,list);
            }else if (value==3){
                SortLengs sortLengs=new SortLengs();
                list.sort(sortLengs);
                saveYuorText2(file2,list);
            }
        }
    }
    public static void saveYuorText2(File file,List<String>list){
        try (PrintWriter printWriter=new PrintWriter(file)){
            for (String st:list){
                printWriter.println(st);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void saveYourText(File file,List<String>list){
        list.sort(null);
        try (PrintWriter pw=new PrintWriter(file)){
            for (String st:list)
                pw.println(st);
            } catch (IOException e){
            e.printStackTrace();
        }
    }
}
class SortbyIndex implements Comparator<String>{
    int index;

    public SortbyIndex(int index) {
        this.index = index;
    }

    @Override
    public int compare(String o1, String o2) {
        String[]data1=o1.split(" ");
        String[]data2=o2.split(" ");
        return data1[index].compareTo(data2[index]);
    }
}
class SortLengs implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}
