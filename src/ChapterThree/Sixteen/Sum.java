package ChapterThree.Sixteen;


import java.util.ArrayList;

public class Sum {
    public static int sum(ArrayList<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
    public static void main(String[] args) {
        // Try your method here
    }

}
