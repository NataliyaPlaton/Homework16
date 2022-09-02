import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        task3(List.of("один", "два", "три", "четыре", "один"));
        task4(List.of("один", "два", "три", "четыре", "один"));
        }

        public static void task1 (List < Integer > nums) {

            for (Integer num : nums) {
                if (num % 2 == 1) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }

        public static void task2 (List < Integer > nums) {
            Set<Integer> set = new TreeSet<>(nums);
            for (Integer num : set) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    public static void task3 (List < String > words) {
        Set<String> set = new TreeSet<>(words);
        for (String word : set) {
                System.out.print(word + " ");
            }
        System.out.println();
        }

    public static void task4 (List < String > words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }else{
                map.put(word,1);
            }
            for(Map.Entry<String,Integer> entry: map.entrySet()){
                if(entry.getValue() > 1){
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
            }
        }
    }
}

