public class Course {
    private String id;
    private String name;
    private int numberOfCredits;
    private String description;
    private Section[] sections;

    sections = new Section[10];

    public void getNotFullSections(){
    int i=0;
    while i <= Section.count
        if (Section[i] == null) {
            System.out.println("Section not full: " + Section[i]);
            i += 1;
        }
    }

    public Course(String courseId, String courseName) {
        id = courseId;
        name = courseName;
    }
    public void setNumberOfCredits(int credits) {
        numberOfCredits = credits;
    }
    public void setDescription(String courseDescription) {
        description = courseDescription;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public String getDescription() {
        return description;
    }

    public Section createSection(String semester, String place, String time){
        return new Section(this, semester, place, time);
    }


}
