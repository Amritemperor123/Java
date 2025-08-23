class Integer{
    // global variable
    // global variabbles have a default value
   
    // for int, it's 0
    static int intGlobal = 20;   

    // same for byte and short
    // for long, it's 0L, longer integer with L suffix
    // for float, it's 0.0f, decimal with f suffix
    // for double, it's 0.0d, decimal with d suffix
    // for char, it's '\u0000', null character
    // for boolean, it's false
    public static void main(String[] args) {
        // local variable

        // integers
        int localInt = 2147483647; // -2147483648 to 2147483647, 32 bits
        byte localByte = 127; // -128 to 127, 8 bits
        short localShort = 32767; // -32768 to 32767, 16 bits
        long localLong = 9223372036854775807L; // -2^63 to 2^63-1, 64 bits

        // decimal 
        double localDouble = 10.5; // 15 decimal digits, 64 bits
        float localFloat = 10.5f; // 7 decimal digits, 32 bits

        // booleans
        boolean localBoolean = true; //true of false, dependant on context

        // character
        char localChar = 'A'; // 16 bits, stores Unicode variables

        System.out.println("All Variables: " + localInt + " " + localByte + " " + localShort + " " + localLong + " " + localDouble + " " + localFloat + " " + localBoolean + " " + localChar);
    }
}