package level1.practice;
/**
 *  제일 작은 수 제거하기
 */
public class Solution10 {

    static int[] solution(int[] arr) {
        int[] answer = {};
        if (arr.length > 1) {
            answer = new int[arr.length - 1];

            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min) {
                    continue;
                } else {
                    answer[index] = arr[i];
                    index++;
                }
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}
