import java.util.Random;
class Medicine{
    static String name="Pharma";
    static String address = "New Delhi";

    void displayLabel(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println();
        System.out.println("----------------------");
    }
}

class Tablet extends Medicine{
    String label = "store in a cool dry place";
    void displayLabel(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println(label);
        System.out.println();
        System.out.println("----------------------");
    }

}

class Syrup extends Medicine{
    String label = "store away from sunlight";
    void displayLabel(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println(label);
        System.out.println();
        System.out.println("----------------------");
    }

}

class Ointment extends Medicine{
    String label = "for external use only";
    void displayLabel(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println(label);
        System.out.println();
        System.out.println("----------------------");
    }

}
public class TestMedicine_q4 {
      public static void main(String[] args) {
        Random r =new Random();
    
        for(int i=1;i<=3;i++){
            int choice = r.nextInt(4-1)+1;
            // System.out.println(choice);

            switch(choice){
                case 1:{
                    Tablet t = new Tablet();
                    t.displayLabel();
                    break;
                }
                case 2:{
                    Syrup s = new Syrup();
                    s.displayLabel();
                    break;
                }
                case 3:{
                    Ointment o = new Ointment();
                    o.displayLabel();
                }   
            }
        }
      }
}
