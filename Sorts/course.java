public class course {
    private int id;
    private String name;
    private int hours;
    private int grade;

    public course(int id, String name, int hours, int grade) {
        this.id = id;
        this.name = name;
        this.hours = hours;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public int getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "the Course:" + name + " its ID is" + id +", hours" + hours + ", grade" + grade;
    } 
}
