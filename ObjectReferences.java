// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    int roll;
    String name;
    
    Main(int r, String n){
        roll = r;
        name = n;
    }
    
    public static void main(String[] args) {
        Main m1 = new Main();
        System.out.print(m1);
        Main m3 = new Main(r:101, n:"Lakshya");
        Main m4 = new Main(r:101, n:"Lakshya");
        
        System.out.println(m3);
        System.out.println(m4);
    }
}

class Student{
    int roll;
    String name;
    
    Student(int r, String n){
        roll = r;
        name = n;
    }
    
    public String toString(){
        return roll+" "+name;
    }
    
    public static void Student(String[] args) {
        Main m1 = new Student();
        System.out.print(m1);
        Main m3 = new Main(r:101, n:"Lakshya");
        Main m4 = new Main(r:101, n:"Lakshya");
        
        System.out.println(m3);
        System.out.println(m4);
    }
}
