package com.company;

import java.util.*;

public class Experience {

    ArrayList<String> jobTitle;
    ArrayList<String> jobLocation;
    ArrayList<String> dateofJob;
    ArrayList<String> dutyOne;
    ArrayList<String> dutyTwo;

    public Experience() {

        this.jobTitle = new ArrayList<>();
        this.jobLocation = new ArrayList<>();
        this.dateofJob= new ArrayList<>();
        this.dutyOne = new ArrayList<>();
        this.dutyTwo = new ArrayList<>();
    }

    public ArrayList<String> getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(ArrayList<String> jobTitle) {
        this.jobTitle = jobTitle;
    }

    public ArrayList<String> getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(ArrayList<String> jobLocation) {
        this.jobLocation = jobLocation;
    }

    public ArrayList<String> getDateofJob() {
        return dateofJob;
    }

    public void setDateofJob(ArrayList<String> dateofJob) {
        this.dateofJob = dateofJob;
    }

    public ArrayList<String> getDutyOne() {
        return dutyOne;
    }

    public void setDutyOne(ArrayList<String> dutyOne) {
        this.dutyOne = dutyOne;
    }

    public ArrayList<String> getDutyTwo() {
        return dutyTwo;
    }

    public void setDutyTwo(ArrayList<String> dutyTwo) {
        this.dutyTwo = dutyTwo;
    }

    @Override
    public String toString() {
        String display="";

        for (int i = 0; i < jobTitle.size(); i++) {
            display += jobTitle.get(i)+"\n"+jobLocation.get(i)+", " + dateofJob.get(i) + "\n" + "- Duty 1, "+ dutyOne.get(i) +"\n" + "- Duty 2, "+dutyTwo.get(i)+"\n\n";
        }

        return display;

    }
}






