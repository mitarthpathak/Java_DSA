package study;

import java.util.HashMap;

public class HashMapPratice {
    public static void main(String[] args){
        //there can be Map and HashMap
        HashMap<String, Integer> studentData = new HashMap<>();
        studentData.put("mitarth",190);
        studentData.put("navneet",203);
        studentData.put("faizan",193);
        System.out.println(studentData);
        //to get a particular ID
        System.out.println(studentData.get("mitarth"));
        System.out.println(studentData.isEmpty());
    }
}
