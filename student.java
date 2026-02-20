public class student {
    int age;
    String name;
    student(){
            System.out.println("Default");
        }
    student(String n,int a){
        this();
        name=n;
        age=a;
    }
    void display(){
        System.out.println(name + " "+ age);
    }
    public static void main(String[] args) {
        student ob=new student("Tejas",20);
        ob.display();
    }

}
