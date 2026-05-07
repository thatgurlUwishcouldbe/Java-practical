public class student {
    private String id;
    private String name;
    static course[] academicrecord;

    public student(String id, String name, course c) {
        this.id = id;
        this.name = name;
        for (int i = 1; i < academicrecord.length; i++) {
            if(academicrecord[i] == null)
                academicrecord[i] = c;
        }
    }
    
    public student(String id, String name,course c, int x) {
        this.id = id;
        this.name = name;
        academicrecord = new course[x];
        academicrecord[0] = c;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i <academicrecord.length ; i++) {
            result+=academicrecord[i] + " ";
        } 
        return result;
    }  
}
