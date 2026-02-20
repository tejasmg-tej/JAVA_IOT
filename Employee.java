public class Employee {
    int id;
    String name;
    double salary;
    Employee(int id,String n, double s){
        this.id=id;
        name=n;
        salary=s;
    }
    void display(){
        System.out.println("ID: "+id+" NAME:"+name+" salary:"+salary);
    }
    public static void main(String[] args) {
        Employee ob=new Employee(114,"Tejas",50000);
        ob.display();
}
}
