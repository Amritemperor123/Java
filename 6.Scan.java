import java.util.Scanner; //to scan values, import this utility
class scan{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //create a scanner object

        System.out.println("Enter an integer: ");
        int value = scanner.nextInt(); //scan an integer
        System.out.println(value);
        // nextInt method takes only the integer as the input 
        // and when the <enter> key is pressed 
        // it's kept at the input buffer. 
        // so, if there are any nextLine methods after this, 
        // then the nextLine method will read the <enter> in the input buffer as an input.
        scanner.nextLine(); // to clean up after nextInt

        // another way to tackle this problem is to avoid using nextInt:
        // int value = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Enter a name:");
        String name = scanner.nextLine(); //scan a string
        System.out.println(name);   

        scanner.close(); //close the scanner object **must be done**
    }
}