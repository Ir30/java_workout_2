public class MathFunction_q3 {
    int multiply(int a,int b){
        return a*b;
    }

    float multiply(float a,float b){
        return a*b;
    }
    float multiply(int a,float b){
        return a*b;
    }
    public static void main(String[] args) {
        MathFunction_q3 m = new MathFunction_q3();
        
        System.out.println(m.multiply(10, 30));
        System.out.println(m.multiply(10.50f, 2.89f));
        System.out.println(m.multiply(2, 10.6f));
    }

    
}
