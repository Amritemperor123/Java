class Strings{
    public static void main(String[] args){
        // in case of literal strings, 
        // JVM does not create a new object in system memory 
        // if a string with similar value already exists
        String name = "Hello";
        System.out.println(name);

        // in case of new keyword, JVM creates a new different object in system memory regardless
        String anothername = new String("Hello");
        System.out.println(anothername);

        String place = "World";
        String concatenation = name + " " + place; // concatenation
        String stringFormat = String.format("%s %s", name, place); // string format
        // %s for string
        // %d for int
        // %f for float
        // %c for char
        // %b for boolean
        System.out.println(concatenation);
        System.out.println(stringFormat);

        System.out.println(name.length()); // length of string
        System.out.println(name.isEmpty()); // check if string is empty
        System.out.println(name.toUpperCase()); // displays in upper case, but does not change the original string
        System.out.println(name.toLowerCase()); // displays in lower case, but does not change the original string

        String uppercaseName = "HELLO";
        System.out.println(name.equalsIgnoreCase(uppercaseName)); // will be true

        String sentance = "This is a sample sentence."; 
        System.out.println(sentance.replace("sample", "simple")); // does not change the actual variable

        System.out.println(sentance.contains("is")); //returns true or false
    }
}