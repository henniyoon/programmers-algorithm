package level1.practice;
/**
 *  하샤드 수
 */
public class Solution8 {
    public static void main(String[] args) {
        System.out.println(solution(200));
    }

    static boolean solution(int x) {
        boolean answer = true;
        int sum = (x / 10000) + (x / 1000) + (x % 1000 / 100) + (x % 100 / 10) + (x % 10);
        System.out.println("sum = " + sum);
        if (x % sum != 0) {
            answer = false;
        }
        return answer;

    }
}
