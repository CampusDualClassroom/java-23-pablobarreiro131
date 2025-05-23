package com.campusdual.classroom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> map = new HashMap<>();
        map.put("person", new Person("John","Smith"));
        map.put("teacher", new Teacher("María","Montessori","Educación"));
        map.put("police", new PoliceOfficer("Jake","Peralta","B-99"));
        map.put("doctor", new Doctor("Gregory","House", "Nefrología e infectología"));
        return map;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        if(map.put("police", value)!= null) return value;
        else return null;



    }

    public static void printMapValues(Map<String, Person> map) {
        map.forEach((k,v) -> v.getDetails());
    }

    public static void main(String[] args) {
        Map<String, Person> map = createHashMap();
        PoliceOfficer charles = new PoliceOfficer("Charles","Boyle","B-99");
        addMapValue(map, "police", charles);
        printMapValues(map);

    }
    
}
