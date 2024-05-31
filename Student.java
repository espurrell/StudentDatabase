import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
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
        System.out.println(firstName + " " + lastName + " " + gradeYear);

    }

    // generate an ID

    // enroll in courses

    // view balance

    // pay tuition

    // show status

}
