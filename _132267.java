/**
 * 2023.08.18
 * 콜라 문제
 */
public class _132267 {
    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            answer += n/a*b;
            n = n%a + n/a*b;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 1, 20));
    }
}
