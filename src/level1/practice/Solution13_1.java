package level1.practice;
/**
 *  자릿수 더하기 (형 변환 없이 풀이)
 */
public class Solution13_1 {
    public static void main(String[] args) {
        System.out.println(solution(123));
    }

    static int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}