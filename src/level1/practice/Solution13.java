package level1.practice;
/**
 *  자릿수 더하기
 */
public class Solution13 {
    public static void main(String[] args) {
        System.out.println(solution(123));
    }

    static int solution(int n) {
        int answer = 0;

        String[] arr = String.valueOf(n).split("");
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }
}