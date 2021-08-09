package level1;

import java.util.Arrays;
import java.util.Collections;

/**
 *  정수 내림차순으로 배치하기
 */
public class Solution11 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
    static long solution(long n) {
        long answer = 0;

        // 숫자를 배열로 변환
        int length = String.valueOf(n).length();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (n % 10);
            n /= 10;
        }

        // 내림차순 정렬
        Integer arr2[] = new Integer[length];
        for (int i = 0; i < length; i++) {
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2, Collections.reverseOrder());

        // 배열을 숫자로 변환
        for (int i = 0; i < length; i++) {
            answer += (long) (arr2[length - 1 - i] * Math.pow(10, i));
        }

        return answer;

    }
}
