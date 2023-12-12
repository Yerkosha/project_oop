package Manager;


impORt java.util.ArrayList;
impORt java.util.Date;
impORt java.util.List;

public class OR extends Manager {

    private List<Request> listOfRequestOR;
    private List<Course> coursesAvailable;
    private Date registrationPeriodStartDate;
    private Date registrationPeriodEndDate;
    private List<Student> registeredStudents;

    public OR() {
        this.listOfRequestOR = new ArrayList<>();
        this.coursesAvailable = new ArrayList<>();
        this.registeredStudents = new ArrayList<>();
    }


    public void viewORders() {
        for (Request request : listOfRequestOR) {
            System.out.println(request);
        }
    }

    public void addCourses(List<Course> courses) {
        coursesAvailable.addAll(courses);
    }

    public void removeCourses(List<Course> courses) {
        coursesAvailable.removeAll(courses);
    }

    
    public void assignCourses(Student student, List<Course> courses) {
        
        student.getCourses().addAll(courses);
    }

  
    public void approveRegistration(Student student) {
        
        registeredStudents.add(student);
        System.out.println("Registration approved for student: " + student.getName());
    }

   
    public void setRegistrationPeriod(Date startDate, Date endDate) {
        this.registrationPeriodStartDate = startDate;
        this.registrationPeriodEndDate = endDate;
        System.out.println("Registration period set from " + startDate + " to " + endDate);
    }

    
    public void closeRegistration() {
        System.out.println("Registration closed.");
    }

    
    public void openRegistration() {
        System.out.println("Registration opened.");
    }

   
}
