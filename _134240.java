/**
 * 2023.08.18
 * 푸드 파이트 대회
 */
public class _134240 {
    public static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {

            sb.append(Integer.toString(i).repeat(food[i] / 2));
        }
        String answer = sb + "0";
        sb.reverse();
        answer += sb;
        System.out.println("answer = " + answer);

        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {1,7,1,2};
        solution(arr);
    }
}
