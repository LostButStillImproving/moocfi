package ChapterThree.Seventeen;


import java.util.ArrayList;

public class RemoveLast {

    public static void removeLast(ArrayList<String> strings) {
        strings.removeIf(i -> strings.indexOf(i) == strings.size() - 1 );
    }

    public static void main(String[] args) {

    }

}
