package com.company;

public class Person {
    Education education;
    Experience jobs;
    Skills skill;
    private  String name ;
    private String email;
    private long phoneNumber;


    public Person() {
        this.education = new Education();
        this.jobs = new Experience();
        this.skill = new Skills();
        this.name = name;
        this.email = email;
        this.phoneNumber=phoneNumber;

    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Experience getJobs() {
        return jobs;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setJobs(Experience jobs) {
        this.jobs = jobs;
    }

    public Skills getSkill() {
        return skill;
    }

    public void setSkill(Skills skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Person setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString(){
        String display =name + "\n"+ email +"\n"+ phoneNumber +"\n\n";
        return display;

    }


}