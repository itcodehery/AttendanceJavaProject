//incomplete
import java.time.DayOfWeek;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCreation;

import java.util.Calendar;
import java.time.*;

public class Student {
    int registrationID = 0000;
    String fullName;
    String courseSelected;
    DayOfWeek selectedDay;

    public Student(){
        registrationID += 1;
        String fullName;
        String courseSelected;
        DayOfWeek selectedDay;
        boolean loopControl = true;
        DateTimeAtCreation today = new DateTimeAtCreation(null);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Student: ");
        fullName = sc.nextLine();
        while(loopControl){
            System.out.println("Enter the course chosen: ");
            System.out.println("1. Keyboard");
            System.out.println("2. Piano");
            System.out.println("3. Guitar");
            System.out.println("4. Western Vocals");
            System.out.println("5. Hindustani Vocals");
            int ch = sc.nextInt();
            switch(ch){
                case 1: courseSelected = "Keyboard";
                break;

                case 2: courseSelected = "Piano";
                break;

                case 3: courseSelected = "Guitar";
                break;

                case 4: courseSelected = "Western Vocals";
                break;
                
                case 5: courseSelected = "Hindustani Vocals";
                break;

                default: System.out.println("Select an available choice: ");
                loopControl = false;
            }
        }
        System.out.println("Select a day of the week (1: Monday - 7: Sunday): ");
        int selectedIntegerDay = sc.nextInt();
        selectedDay = DayOfWeek.of(selectedIntegerDay);

    }

    public void changeSelectedDay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a new day of the week (1: Monday - 7: Sunday): ");
        int selectedNewDay = sc.nextInt();
        selectedDay = DayOfWeek.of(selectedNewDay);
        System.out.println("Selected Day has been changed successfully!");
        sc.close();
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean mainLoopControl = false;
        while (mainLoopControl) {
            System.out.println("Creating new student...");
            Student new1 = new Student();
        }
        
        
    }
}
