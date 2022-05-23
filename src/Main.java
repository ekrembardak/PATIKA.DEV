public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik","12121","MAT");
        Course fizik = new Course("Fizik","34343","FIZ");
        Course kimya = new Course("Kimya","56565","KIM");

        Teacher t1 = new Teacher("Albus Dumbledore","MAT","12121");
        Teacher t2 = new Teacher("Severus Snape","KIM","56565");

        Student s1 = new Student("Ekrem Bardak","1996",7,mat,kimya,fizik);
        Student s2 = new Student("Fatih Bardak","2002",8,mat,kimya,fizik);

        s1.addBulkExamNotes(75,40,60);
        s1.printNote();

        System.out.println(t1.getBranch());
        System.out.println(t1.getName());
   
}
    
}
