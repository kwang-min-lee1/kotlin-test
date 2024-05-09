/*
문제8 Null Safety
다음 요구사항에 맞게 printName 함수를 작성하세요
1. nullable 한 문자열 name 을 입력받습니다.
2. name 이 null 이 아닌 경우, 첫번째 문자를 성으로, 나머지 문자열을 이름으로 출력하세요
3. name 이 null 인 경우, "김" 과 "무명" 을 사용하여 출력하세요
4. Safe Call 연산자와 엘비스 연산자를 사용하세요
 */

fun main() {

    // 1. nullable 한 문자열 name 을 입력받습니다.
    println("이름을 입력하세요: ")
    val name: String? = readLine()

    // 2. name 이 null 이 아닌 경우, 첫번째 문자를 성으로, 나머지 문자열을 이름으로 출력하세요
    // 3. name 이 null 인 경우, "김" 과 "무명" 을 사용하여 출력하세요
    if (name.isNullOrEmpty()) {
        println("성: 김, 이름: 무명")
        return
    }
    println("성: ${name[0]}, 이름: ${name[1]}${name[2]}")


}
