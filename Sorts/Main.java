public class Main {
    public static void main(String[] args) {
        
        course c1 = new course(111, "calac" , 4 , 5);
        course c2 = new course(222, "database" , 3 , 5);
        course c3 = new course(333, "java2" , 4 , 4);
        course cNOT = new course(000, "null" , 0 , 0);
        
        student s1 = new student("111", "reema",c1,4);
        student s2 = new student("222", "ola",c2);
        student s3 = new student("333", "hana",c3);
        
        System.out.println(test.FindByName(s1,c1));
        test.FindByID(s1,c1);
        test.FindByID(s3, cNOT);
    }
}
