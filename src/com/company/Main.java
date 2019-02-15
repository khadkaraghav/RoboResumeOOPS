package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void a(String s){  // making method of System.out.println
        System.out.println(s);
    }

    public static void main(String[] args) {

        Person person = new Person();        //instantiate the Person class with person object
        Scanner keyboard = new Scanner(System.in);

        String name="",email="";//store the candidate info
        Long phoneNumber;

        ArrayList<String> uni = new ArrayList<>(); //
        ArrayList<String>degree = new ArrayList<>();
        ArrayList<Integer>date = new ArrayList<>();

        ArrayList<String> titles = new ArrayList<>(); //  using Arraylist to store job details
        ArrayList<String>locations = new ArrayList<>();
        ArrayList<String>dates = new ArrayList<>();
        ArrayList<String> dutyFirst = new ArrayList<>();
        ArrayList<String>dutySecond = new ArrayList<>();

        ArrayList<String> store = new ArrayList<>();

        HashMap<String,String> skills = new HashMap<>(); // using hashmap to store skills and proficiency as they both are same String type

        a("PLEASE FILL ALL THE DETAILS TO BUILD YOUR RESUME");

        a("Enter your Name:");
        name = keyboard.nextLine();
        a("Enter your Email");
        email = keyboard.nextLine();
        a("Enter your Phone Number");
        phoneNumber = keyboard.nextLong();

        person.setEmail(email);   // storing the name and the email to print
        person.setName(name);
        person.setPhoneNumber(phoneNumber);


        educationAdd(uni,degree,date);   //calling the method to add education details

        workListAdd(titles,locations,dates,dutyFirst,dutySecond); // calling the method to add previous experiences

        skillsListAdd(skills); // calling the method to add skills and proficency

        person.skill.setSkills(skills);


        person.jobs.setJobTitle(titles);           // storing all the values in different Arraylists in the Experience class
        person.jobs.setJobLocation(locations);
        person.jobs.setDutyTwo(dutySecond);
        person.jobs.setDutyOne(dutyFirst);
        person.jobs.setDateofJob(dates);


        person.education.setDateOfGraduation(date);   // storing all the values of Education history
        person.education.setUniversity(uni);
        person.education.setDegree(degree);


        a(person.toString());

        a("EDUCATION\n===========================================");
        a(person.education.toString());
        a("WORK EXPERIENCE\n===========================================");
        a(person.jobs.toString());
        a("SKILLS \n===========================================");
        a(person.skill.toString());

    }



    public static void educationAdd(ArrayList<String> uni, ArrayList<String> degree, ArrayList<Integer>date){   // add Education

        Scanner keyboard= new Scanner(System.in);
        Person person = new Person();
        String option="";
        int count =1;
        a("Enter your Education History"+"\n");
        do{

            a("Enter your degree");
            String degrees = keyboard.nextLine();
            a("Enter the name of your University");
            String universityName = keyboard.nextLine();
            a("Enter the year of Graduation");
            int dates = keyboard.nextInt();
            keyboard.nextLine();

            degree.add(degrees);
            uni.add(universityName);
            date.add(dates);

            person.education.setDegree(degree);
            person.education.setUniversity(uni);
            person.education.setDateOfGraduation(date);
            count++;
            a("Do you want to add more (y/n)");
            option = keyboard.nextLine();
            a("===========================================");
        }while(!option.equalsIgnoreCase("n") && count <=10);
    }


    public static void workListAdd(ArrayList<String>titles, ArrayList<String> locations, ArrayList<String>
            dates, ArrayList<String> duty1s, ArrayList<String> duty2s){

        Person person = new Person();
        Scanner keyboard= new Scanner(System.in);
        int count =1;
        String option="";
        a("Do you want to add your work experience (y/n)");
        String work =keyboard.nextLine();
        while(!work.equalsIgnoreCase("n")){
            a("Enter your Job Title ");
            String title = keyboard.nextLine();
            a("Enter the name of Company that you worked for ? ");
            String location = keyboard.nextLine();
            a("Enter the duration of your job");
            String date = keyboard.nextLine();
            a("Enter your Primary Duty");
            String dutyOne = keyboard.nextLine();
            a("Enter your Secondary Duty");
            String dutyTwo = keyboard.nextLine();

            titles.add(title);
            locations.add(location);
            dates.add(date);
            duty1s.add(dutyOne);
            duty2s.add(dutyTwo);

            person.jobs.setDateofJob(dates);
            person.jobs.setDutyOne(duty1s);
            person.jobs.setDutyTwo(duty2s);
            person.jobs.setJobLocation(locations);
            person.jobs.setJobTitle(titles);

            count++;
            a("Do you want to add more experiences (y/n):");
            work = keyboard.nextLine();
            a("===========================================");

        }
    }

    public static void skillsListAdd(HashMap<String, String> skills){
        Person person = new Person();
        Scanner keyboard = new Scanner(System.in);
        int count =1;
        String option ="";
        a("Skills Entry Field");
        do{
            a("Enter your skill ");
            String skill = keyboard.nextLine();
            a("Enter your proficiency in the skill (Novice / Fundamental / Intermediate / Advanced)");
            String rating = keyboard.nextLine();

            skills.put(skill,rating);
            person.skill.setSkills(skills);

            count++;
            a("Do you want to add more skills (y/n)");
            option = keyboard.nextLine();
            a("===========================================");
        }while(!option.equalsIgnoreCase("n"));
    }


}