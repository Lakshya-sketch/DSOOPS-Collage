
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
