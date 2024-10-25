package com.Entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
     String name;
     List<String> hobbies;
     Map<String,String> pets;
     Set<String> mySet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getPets() {
        return pets;
    }

    public void setPets(Map<String, String> pets) {
        this.pets = pets;
    }

    public Set<String> getMySet() {
        return mySet;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", pets=" + pets +
                ", mySet=" + mySet +
                '}';
    }
}
