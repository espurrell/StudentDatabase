import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600; // static - not specific to object
    private static int id = 1001;

    // constructor - prompt for name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1-Freshman\n2-Sophmore\n3-Junior\n4-Senior\n Enter student class level: ");
        this.gradeYear = in.nextInt();

        this.courses = "";

        setStudentID();

    }

    // generate an ID
    private void setStudentID() {
        // gradelevel + ID
        id++; // increment id each time one is created
        this.studentID = gradeYear + "" + id;

    }

    // enroll in courses

    public void enroll() {
        // get inside a loop, user hits 0 when done enrolling
        do {
            System.out.print("Enter course to enroll, Q to quit: ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }

            else {
                break;
            }
        } while (1 != 0);

        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    // view balance

    public void viewBalance() {
        System.out.println("Your balance is $" + tuitionBalance);
    }

    // pay tuition

    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment amount $: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);

    }

    // show status

    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudentID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
