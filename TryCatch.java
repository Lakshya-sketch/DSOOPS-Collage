// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        try{
            try{
                int x = 10 / 0;
            }
            catch(ArithmeticException e){
                System.out.Println("Inner Catch");
            }
            }
        catch(Exception e){
                System.out.Println("Outer Catch");
        }
    }
}
