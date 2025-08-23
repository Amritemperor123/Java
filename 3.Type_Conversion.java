class Conversion {
    public static void main(String[] args){
        double doubleValue1 = 10.68;
        int intValue1 = (int) doubleValue1; // explicit conversion
        System.out.println("Explicit conversion from double to int: " + intValue1);

        int intValue2 = 10;
        double doubleValue2 = intValue2; // implicit conversion
        System.out.println("Implicit conversion from int to double: " + doubleValue2);
    }
}