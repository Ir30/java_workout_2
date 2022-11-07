class faculty{
    int faculty_id;
    float salary;

}
class FullTimeFaculty extends faculty{
    float basic;
    float allowance;
    void input_detiles(int id,float basic_pay,float allowance){
        faculty_id=id;
        basic = basic_pay;
        this.allowance=allowance;
        salary = basic+allowance;
    }
    void display(){
        System.out.println("faculty_id : "+faculty_id);
        System.out.println("Basic Pay : "+basic);
        System.out.println("allowance : "+allowance);
        System.out.println("salary : "+salary);
        System.out.println("------------------------");
        System.out.println();
    }
}
class PartTimeFaculty extends faculty{
    int hr;
    float rate;
    void input_detiles(int id,int hr,float rate){
        faculty_id=id;
        this.hr=hr;
        this.rate=rate;
        salary = rate*hr;
    }
    void display(){
        System.out.println("faculty_id : "+faculty_id);
        System.out.println("Rate : "+rate);
        System.out.println("Hours : "+hr);
        System.out.println("salary : "+salary);
        System.out.println("------------------------");
        System.out.println();
    }
}
public class Driverclass_q1{
    public static void main(String[] args) {
        FullTimeFaculty E1 = new FullTimeFaculty();
        E1.input_detiles(101,15000,5000);

        FullTimeFaculty E2 = new FullTimeFaculty();
        E2.input_detiles(102,20000,5000);

        PartTimeFaculty E3 = new PartTimeFaculty();
        E3.input_detiles(103, 40, 200);

        PartTimeFaculty E4 = new PartTimeFaculty();
        E4.input_detiles(104, 50, 300);

        E1.display();
        E2.display();
        E3.display();
        E4.display();

    }

}