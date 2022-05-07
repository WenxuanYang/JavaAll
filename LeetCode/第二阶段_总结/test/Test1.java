import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author Jerry.Y
 * @description
 * @create 2022-03-09-13:11
 */
public class Test1 {
    @Test
    public void test1() {
        List<String> list = Arrays.asList("111", "222", "333");
        list.stream().map(Test1::str2char).forEach((s) -> s.forEach(System.out::println));
    }

    public static Stream<Character> str2char(String str) {
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray())
            list.add(c);
        return list.stream();
    }
}
