import java.util.HashMap;

public class LibrarySystem {
    public static void main(String[] args) {
        // ISBN (key) -> Book title (value)
        HashMap<String, String> library = new HashMap<>(16, 0.75f);

        library.put("1234", "Java");
        library.put("5678", "CPP");
        library.put("9012", "Python");

        //O(1) lookup

        System.out.println(library.get("1234"));

        //Load factor = no of entries / number of buckets
        // default is  0.75
        System.out.println("Size : " + library.size());
    }
}