package level1.practice;
/**
 *  자연수 뒤집어 배열로 만들기
 */
public class Solution12 {
    public static void main(String[] args) {
        System.out.println(solution(12345));
    }
    static int[] solution(long n) {
        int[] answer = {};
        String arr[] = String.valueOf(n).split("");
        answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[arr.length - 1 - i]);
        }
        return answer;
    }
}
