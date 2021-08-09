package level1;
/**
 *  정수 제곱근 판별
 */
public class Solution1 {

    public static void main(String[] args) {
        System.out.println(solution(121));
    }

    public static long solution(long n) {
        long answer = 0;

        long x = (long) Math.sqrt(n);

        if (n == Math.pow(x, 2)) {
            answer = (long) Math.pow(x + 1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }
}
