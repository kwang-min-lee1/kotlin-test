/*
문제 3. 컬렉션
1. List 를 이용하여 학생들의 이름 리스트를 선언하고, 이를 출력하시오
2. Map 을 이용하여 학생의 이름을 키(key)로, 점수를 값(value)으로 저장하고 이를 출력하시오
3. 코틀린에서 가변리스트와 블변리스트의 차이를 서술하시오.
 */


fun main() {
    // 1. List 를 이용하여 학생들의 이름 리스트를 선언하고, 이를 출력하시오
    val nameList = listOf("홍길동", "김영희", "박철수")
    println("학생들: ${nameList}")

    // 2. Map 을 이용하여 학생의 이름을 키(key)로, 점수를 값(value)으로 저장하고 이를 출력하시오
    val nameMap = mapOf("홍길동" to 90, "김영희" to 85, "박철수" to 92)
    println("학생점수: ${nameMap}")

    // 3. 코틀린에서 가변리스트와 블변리스트의 차이를 서술하시오.
    // 불변(immutable) 은 읽기는 가능하지만 수정은 불가능
    // 가변(mutable) 은 변경이 가능하다.

}



