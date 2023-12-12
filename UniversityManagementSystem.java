package Adhyapan;
import java.util.ArrayList;
import java.util.List;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class UniversityStudent extends Person {
    private String studentId;
    private List<Course> courses;

    public UniversityStudent(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.print("Enrolled Courses: ");
        for (Course course : courses) {
            System.out.print(course.getCourseCode() + ", ");
        }
        System.out.println();
    }
}

class Teacher extends Person {
    private String employeeId;
    private List<Course> teachingCourses;

    public Teacher(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
        this.teachingCourses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        teachingCourses.add(course);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.print("Teaching Courses: ");
        for (Course course : teachingCourses) {
            System.out.print(course.getCourseCode() + " ");
        }
        System.out.println();
    }
}
class Course {
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public void displayInfo() {
        System.out.println("Course Code: " + courseCode + ", Course Name: " + courseName);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create instances of classes
        UniversityStudent student1 = new UniversityStudent("Md Haidar Ali", 22, "2001229093");
        Teacher teacher1 = new Teacher("Prof. Dhruv Jain", 30, "CST03SA78");
        Course course1 = new Course("CS101", "Introduction to Computer Science");
        // Enroll student in a course
        student1.enrollCourse(course1);
        // Assign a course to a teacher
        teacher1.assignCourse(course1);
        // Display information
        student1.displayInfo();
        System.out.println();
        teacher1.displayInfo();
        System.out.println();
        course1.displayInfo();
    }
}
