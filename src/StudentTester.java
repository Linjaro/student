
public class StudentTester {

    
    public static void main(String[] args) {
        Student x = new Student();
        x.setName("bob");
        
        x.setScore(1, 70);
        x.setScore(2,85);
        x.setScore(3,49);
        
        System.out.println("my name is "+ x.getName());
        
        for (int i = 1; i <=3; i++) {
            System.out.println("my scores for test "+i+" "+x.getScore(i));
        }
        System.out.println("my average is "+x.getAverage());
        System.out.println(x.toString());
    }
    
}
