/*
문제 10. 스코프 함스
다음 요구사항에 맞게 printEmail 함수를 작성하세요
1. nullable 한 문자열 email 을 입력받습니다.
2. 스코프 함수 let 을 사용하여 email 이 널이 아닌 경우에만 (safe call) 다음 메시지를 출력하세요
 - "입력된 이메일: [email]"
 3. email 이 널 값인 경우(elvis 연산자) 스코프 함수 run 을 사용하여, 해당 범위 블록에서
 "에메일이 입력되지 않았습니다." 를 출력하세요.

 출력예시
 fun main() {
    printEmail("abc@abc.com")
    printEmail(null)
}
실행결과
입력된 이메일: abc@abc.com
이메일이 입력되지 않았습니다.
 */
