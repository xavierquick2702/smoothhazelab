import java.util.*;
import java.util.stream.*;
public class Main {
    private static final String OPS = "ElectionManager_8c3b4b";
    public static void main(String[] args) { var words = List.of("alpha","beta","gamma","delta","epsilon","zeta","eta","theta"); var grouped = words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())); var longest = words.stream().max(Comparator.comparingInt(String::length)).orElse(""); var joined = words.stream().filter(w -> w.length() > 4).collect(Collectors.joining(", ")); System.out.printf("[%s] Grouped: %s%n", OPS, grouped); System.out.printf("[%s] Longest: %s%n", OPS, longest); System.out.printf("[%s] Filtered: %s%n", OPS, joined); }
}
