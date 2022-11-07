class OneBhk{
    float roomArea;
    float hallArea;
    float price;


    OneBhk(){
      roomArea = 500;
      hallArea = 800;
      price = 300000; 
    }
    OneBhk(float r_aria,float h_aria,float price){
        roomArea = r_aria;
        hallArea = h_aria;
        this.price = price;  
    }

    void Show(){
        System.out.println("Room Area : "+roomArea);
        System.out.println("Hall Area : "+hallArea);
        System.out.println("Price : "+price);
        System.out.println("---------------------");
        System.out.println();
    }
}

class TwoBhk extends OneBhk{
    public static float bhk2_amount=0;

    float room2Aria;

    TwoBhk(){
      super();
      room2Aria = 500;
      price = 400000;  
      bhk2_amount = bhk2_amount+price;
    }
    TwoBhk(float r_aria,float r2_aria,float h_aria,float price){
        super(r_aria,h_aria,price);
        room2Aria  = r2_aria;
        bhk2_amount = bhk2_amount+price;

    }

    void Show(){
        System.out.println("Room Area : "+roomArea);
        System.out.println("Room 2 Aria : "+room2Aria);
        System.out.println("Hall Area : "+hallArea);
        System.out.println("Price : "+price);
        System.out.println("---------------------");
        System.out.println();

    }
}
public class DrivrClass_q2 {
    public static void main(String[] args) {
        TwoBhk f1 = new TwoBhk();
        TwoBhk f2 = new TwoBhk(400,300,500,350000);
        TwoBhk f3 = new TwoBhk(600,400,500,600000);

        f1.Show();
        f2.Show();
        f3.Show();

        System.out.println("Number of total 2 BHK  flats:"+TwoBhk.bhk2_amount);
        
    }
}
