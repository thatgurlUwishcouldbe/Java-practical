public class test {
    
    //Binary Search
    public static boolean FindByName(student s, course c) {
        sort(s.academicrecord);
        String target = c.getName();
        int left = 0;
        int right = s.academicrecord.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target.equalsIgnoreCase(s.academicrecord[mid].getName()))// found
            {
                return true;
            } else if (target.compareToIgnoreCase(s.academicrecord[mid].getName()) < 0)//نسحب على اليمين
            {
                left = mid + 1;
            } else//نسحب على اليسار
            {
                right = mid - 1;
            }
        }
        return false;
    }

    //Linear Search
    public static void FindByID(student s, course c) {

        int key = c.getId();

        for (int i = 0; i < s.academicrecord.length; i++) {
            if (s.academicrecord[i].getId() == key) {
                System.out.println("Found");
            }
            System.out.println("NOT Found");
        }
    }
    //Selection Sort
    public static void sort(course[] arr) {
        for (int i = 0; i < arr.length; i++) { //تمشي عليهم
            int minIndex = i;
            for (int j = 0; j < arr.length; j++) {// اللي تقارن
                if (arr[i].getName().compareToIgnoreCase(arr[minIndex].getName()) < 0) {
                    minIndex = j;
                }
            }
            //swap
            course temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
