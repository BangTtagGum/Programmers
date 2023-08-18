/**
 * 2023.08.18
 * 소수 만들기
 */
public class _12977 {

    public static int solution(int[] nums) {
        int answer = 0;

        int prime[] = new int[3000];
        for (int i = 2; i < 3000; i++) {
            if (prime[i] == 0) {
                for (int j = i + i; j < 3000; j += i) {
                    prime[j] = 1;
                }
            }
        }

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (prime[nums[i] + nums[j] + nums[k]] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,7,6,4};
        System.out.println(solution(arr));
    }
}
