import java.util.HashMap;
// hashmaps are not sorted or ordered
class Hash{
    public static void main(String[] args){
        HashMap<String, Integer> scores = new HashMap<String, Integer>();

        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);

        scores.forEach((name, score) -> {
            System.out.println(name + ": " + score);
        });
        
        scores.putIfAbsent("David", 88);
        scores.replace("Bob", 89); // replaces the key value
        System.out.println(scores.toString());
        System.out.println(scores.get("Alice"));

        System.out.println(scores.get("Eve")); // will return null
        System.out.println(scores.getOrDefault("Eve", -1)); // will return -1

        scores.remove("Charlie");
        System.out.println(scores.toString());

        System.out.println(scores.size());

        System.out.println(scores.containsKey("Alice")); // false if not present
        System.out.println(scores.containsValue(85)); // Integer.valueOf(85) is also valid

        scores.clear();
        System.out.println(scores.isEmpty());
    }
}