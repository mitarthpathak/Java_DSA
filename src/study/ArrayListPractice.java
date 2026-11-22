package study;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args){
        String[] name = new String[5];
        name[0]= "mitarth";
        name[1]= "deep";
        //this above is just the array example
        //an array has a fixed size
        //now let's see the arrayList<>
        ArrayList<String> names = new ArrayList<>();
        names.add("mitarth");
        for (String n:name){
        System.out.println(n);}
        System.out.println(names);
    }
}
