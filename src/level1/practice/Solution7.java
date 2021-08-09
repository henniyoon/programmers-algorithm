package level1.practice;
/**
 *  짝수와 홀수
 */
public class Solution7 {
    class Solution {
        public String solution(int num) {
            String answer = "";
            if (num % 2 == 0) {
                answer = "Even";
            } else {
                answer = "Odd";
            }
            return answer;
            // 삼항 연산자를 활용한 깔끔한 한 줄 풀이..!
//            return num % 2 == 0 ? "Even" : "Odd";
        }
    }
}
