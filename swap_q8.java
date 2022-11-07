class A{
    int a = 10;
    int b = 30;
}
public class swap_q8 {
    static void swap(int a,int b){
        System.out.println("befor swaping a="+a+" b="+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("after swaping a="+a+" b="+b);
        System.out.println();
        System.out.println("---------------------");
    }
    public static void main(String[] args) {
        int a = 40;
        int b = 60;
        swap(a, b);
        
        A o1 = new A();

        swap(o1.a, o1.b);
    }
    
}
