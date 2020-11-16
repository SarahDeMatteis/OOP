package app;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(multiplyTwoNumbers(5, 77));

        Person harry = new Person(14, "Harry", 70);
        Person carson = new Person(21, "Carson", 65);
        
        System.out.println(harry.getName() + " is " + harry.getAge() + " years old.");
        System.out.println(carson.getName() + " is " + carson.getAge() + " years old.");

        Burger cheeseburger = new Burger("Cheeseburger", 0, 1, 2, true, false, 560, false);
        System.out.println(cheeseburger.getName());    
        System.out.println(cheeseburger.getCalories());    

        Cookie sugarCookie = new Cookie("Sugar", 300, true);
        System.out.println(sugarCookie.getType());

    }

    public static void cool(){
        System.out.println("cool");
        
    }

    public static int addTwoNumbers(int x, int y){
        return x + y;
    }

    public static int multiplyTwoNumbers(int x, int y){
        return x * y;    
    }

    






}