package level1;
/**
 *  핸드폰 번호 가리기
 */
public class Solution5 {
    class Solution {
        public String solution(String phone_number) {
            String answer = "";

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < phone_number.length() - 4; i++) {
                sb.append("*");
            }
            sb.append(phone_number.substring(phone_number.length() - 4));

            answer = sb.toString();

            return answer;
        }
    }
}
