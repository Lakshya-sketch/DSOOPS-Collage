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

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
class Main {
    static void checkAge(int age) {
        if(age < 18){
            throw new InvalidAgeException("Age must be 18+");
        }
        System.out.println("Valid Age");
    }
    
    public static void main(String[] args){
        try{
            checkAge(15);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}



class Main {
    public static void main(String[] args) {
        int x = 100;
        int y;
        try{
            x = x / 10;
        }
        catch (ArithmeticException e){
            System.out.println("Caught");
        }
        finally{
            try{
            y = x / 10;
            }
           catch (ArithmeticException e){
                System.out.println("Caught");
            }
    finally{
           System.out.println("Finally Block Inner");
           }
            System.out.println("Finally Block");
        }
        
        try{
            System.out.println("A");
            int x = 5/0;
            System.out.println("B");
        }
        catch(ArithmeticException e){
            System.out.println("C");
        }
        finally{
            System.out.println("D");
        }
        System.out.println("E");
    }
}
