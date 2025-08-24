import java.util.Arrays;
class ArrayEx{
    // arrays are reference type variables
    // which means that if I create a copy of an array, the new array won't be a separate copy
    // instead, it will refer to the same memory location
    // that means changes made to the copied array will also affect the original array
    public static void main(String[] arg){
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        System.out.println(Arrays.toString(vowels));

        System.out.println(vowels.length); // length is a property in this case

        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));

        int startIndex = 1;
        int endIndex = 4; // exclusive indexing
        Arrays.sort(vowels, startIndex, endIndex);
        System.out.println(Arrays.toString(vowels));

        // binary search only works on sorted arrays
        // the result of a binary search will be -ve if the element is not found
        // value of the negative output = - (insertion point) - 1
        // insertion point is where the missing item should have been
        char key = 'o';
        int foundItemIndex = Arrays.binarySearch(vowels, key);
        System.out.println(foundItemIndex);

        int anotherFoundItemIndex = Arrays.binarySearch(vowels, startIndex, endIndex, 'x');
        System.out.println(anotherFoundItemIndex);

        // Arrays.fill(vowels, 'z');
        // fills the entire array with 'z'
        // works with starting and ending index

        // following method creates a copy of the original array without referencing
        char copyArray[] = Arrays.copyOf(vowels, vowels.length);
        char anotherCopyArray[] = Arrays.copyOfRange(vowels, startIndex, endIndex); // for larger copies, default value is inserted and for smaller copies, the array is truncated
        System.out.println(Arrays.toString(copyArray));
        System.out.println(Arrays.toString(anotherCopyArray));

        // relational operators such as == won't return true even if it's an identical copy
        System.out.println(Arrays.equals(vowels, copyArray));
    }
}