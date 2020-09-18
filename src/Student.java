
public class Student {
    //Always start with instance variables, these make up the properties of your object
    //allways make the private
    //u can make things private to dictate how data is set, hae methods with limits on the values
    private String name;
    private int test1,test2,test3;
    
    /*
    constructor, gives data to props
    runs when new is used
    always public
    
    */
    public Student(){
        name="";
        test1=test2=test3=0;
    }
    
    public void setName(String n){
        name = n;
    }
    public void setScore(int i,int score){
        if(i==1)test1=score;
        else if (i==2)test2=score;
        else test3=score;
    }
    public String getName(){
        return name;
    }
    public int getScore(int i){
        if(i==1)return test1;
        else if (i==2)return test2;
        else return test3;
    }
    public double getAverage(){
        double average=(test1+test2+test3)/3.0;
        return average;
    }
    public int getHigh(){
        int high = Math.max(test1,test2);
        high = Math.max(test2, test3);
        return high;
    }
    
    public String toString(){
        String str;
        str = "Name:\t"+name;
        str += "\nTest1 = "+test1;
        str += "\nTest2 = "+test2;
        str += "\nTest3 = "+test3;
        str += "\n---------------------\nAverage = "+getAverage();
        return str;
    }
}
