package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Education {

    ArrayList<String> degree;
    ArrayList<String> University;
    ArrayList<Integer> dateOfGraduation;

    public Education() {
        this.degree = new ArrayList<>();
        this.University = new ArrayList<>();

    }

    public ArrayList<String> getDegree() {
        return degree;
    }

    public void setDegree(ArrayList<String> degree) {
        this.degree = degree;
    }

    public ArrayList<String> getUniversity() {
        return University;
    }

    public void setUniversity(ArrayList<String> university) {
        University = university;
    }

    public ArrayList<Integer> getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(ArrayList<Integer> dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    @Override
    public String toString() {

        String display="";

        for (int i = 0; i < University.size(); i++) {
            display += degree.get(i)+","+"\n"+University.get(i) +", " + dateOfGraduation.get(i)+"\n\n";
        }

        return display;

    }
}
