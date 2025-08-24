import java.util.ArrayList;
import java.util.Comparator;
class dynamicArray{
    public static void main(String[] args){
        // Integer is a wrappper for int data type
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        numbers.remove(2); // targets the index, not the value
        numbers.remove(Integer.valueOf(2)); // targets the value, not the index

        numbers.set(1, Integer.valueOf(5)); // replaces the value at index 1 with value 5

        System.out.println(numbers);
        System.out.println(numbers.get(2)); // targets the index

        numbers.sort(Comparator.naturalOrder()); // sorts in ascending order    
        numbers.sort(Comparator.reverseOrder()); // sorts in descending order

        System.out.println(numbers.size()); 
        
        System.out.println(numbers.contains(Integer.valueOf(10))); // true or false depending on the presence of the entry

        System.out.println(numbers.isEmpty()); // true or false depending on whether the array is empty or not

        numbers.forEach(number -> { // iterates through the array, does not change the original array
            System.out.println(number * 2); 
        });
        numbers.clear(); // emptying the array
    }
}