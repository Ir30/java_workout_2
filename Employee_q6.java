class Employee{
    String name;
    int emp_id;
    int ass1;
    int ass2;
    int ass3;
    String result;

    Employee(String name,int id,int ass1,int ass2,int ass3){
        this.name = name;
        emp_id = id;
        this.ass1 = ass1;
        this.ass2 = ass2;
        this.ass3 = ass3;
        if(ass1>70 && ass2>70 && ass3>70)
        {
            result = "Promoted";
        }
        else{
            result = "Demoted";
        }
    }

    void Display(){
        System.out.println("Total: "+(ass1+ass2+ass3));
        System.out.println("Percentage: "+(ass1+ass2+ass3)/3+"%");
    }

}
public class Employee_q6 {
    public static void main(String[] args) {
        Employee e = new Employee("Raju", 101, 74, 78, 96);
        e.Display();
    }
}
