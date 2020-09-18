
public class StudentTester {

    
    public static void main(String[] args) {
        Student z,zz,y,x = new Student();
        y = new Student("amy",95,83,80);
        z= new Student(x);//this is a copy, independant
        x.setName("bob");
        
        x.setScore(1, 70);
        x.setScore(2,85);
        x.setScore(3,49);
        
        //zz is now a pointer/refrence to x, if u change zz, u change x 
        zz=x; //because the word new was not used
        System.out.println("my name is "+ x.getName());
        
        for (int i = 1; i <=3; i++) {
            System.out.println("my scores for test "+i+" "+x.getScore(i));
        }
       
        System.out.println("my average is "+x.getAverage());
        System.out.println("\n\n");
        System.out.println(x.toString());
        System.out.println("\n\n");
        System.out.println(y);
        System.out.println("\n\n");
        System.out.println(z);
        System.out.println("\n\n");
        System.out.println(zz);
        System.out.println("\n\n");
        
        System.out.println("change x's mark to 50s, using zz as a refrence");
        zz.setScore(1,50);
        zz.setScore(2,50);
        zz.setScore(3,50);
        for (int i = 1; i <=3; i++) {
            System.out.println("x's scores for test "+i+" "+x.getScore(i)+" using zz");
        }
    }
    
}
