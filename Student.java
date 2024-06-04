import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
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

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

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
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }

            else {
                break;
            }
        } while (1 != 0);

        System.out.println("ENROLLED IN:" + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    // view balance

    // pay tuition

    // show status

}
