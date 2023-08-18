import java.util.Arrays;
import java.util.Comparator;

/**
 * 2023.08.18
 * 문자열 내 마음대로 정렬하기
 */
public class _12915 {

    public static String[] solution(String[] strings, int n) {

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                }
                return o1.charAt(n) - o2.charAt(n);
            }
        });
        return strings;
    }
    public static void main(String[] args) {
        String[] strings = {"sabe", "abcd", "cdx"};
        String[] answer = solution(strings,0 );

        for (String s : answer) {
            System.out.println("s = " + s);
        }
    }
}
