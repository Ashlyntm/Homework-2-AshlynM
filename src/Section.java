public class Section {
    private String semester;
    private String place;
    private String daysAndTimes;
    private Course course;

    private Student[] students;
    private int initialCapacity;

    students = new Student[10];
    initialCapacity = 10;

    public Section(Course theCourse, String theSemester, String thePlace, String theDaysAndTimes) {
        course = theCourse;
        place = thePlace;
        daysAndTimes = theDaysAndTimes;
        semester = theSemester;
    }
    public String getPlace() {
        return place;
    }
    public String getDaysAndTimes() {
        return daysAndTimes;
    }
    public String getSemester() {
        return semester;
    }
    public Course getCourse() {
        return course;
    }
    public void setPlace(String newPlace) {
        place = newPlace;
    }
    public void setDaysAndTiems(String newDaysAndTimes) {
        daysAndTimes = newDaysAndTimes;
    }
}
