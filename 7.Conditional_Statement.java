import java.util.Scanner;

class conditions{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a:");
        int a = scanner.nextInt();
        System.out.print("Enter value for b:");
        int b = scanner.nextInt();
        if(a > b){
            System.out.println("a is greater than b");
        }
        else if(a == b) {
            System.out.println("a is equal to b");
        }
        else{
            System.out.println("b is greater than a");
        }


        System.out.print("Enter another number:");
        int c = scanner.nextInt();
        int remainder = c % 2;
        switch (remainder) {
            case 0:
                System.out.println("c is even");
                break;
            case 1:
                System.out.println("c is odd");
                break;
            default:
                System.out.println("c is zero");
        }
        scanner.close();
    }
}