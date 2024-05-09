/*
문제7. 람다식
다음 요구사항을 List 컬렉션의 함수형 프로그래밍 메서드와 람다식을 활용하여 작성하세요.
1. 'Person' data class 를 정의하세요
2. 'List<Person>'의 데이터를 나이순 내림차순으로 정렬하세요
3. 나이 25세 이상의 사람들만 필터링하세요
4. 필터링된 모든 이름에 '님' 접미사를 추가하고 나이에 (xx세)가 추가된 문자열로 변환하세요
5. 리스트의 요소에 접근하여 변환된 내용을 한줄에 하나씩 출력하세요
- 각 요구사항에 최대한 람다식을 사용하세요
 */

// 1. 'Person' data class 를 정의하세요
data class Person (var name: String, var age: Int)

fun main() {
    // 2. 'List<Person>'의 데이터를 나이순 내림차순으로 정렬하세요
    val people = listOf(
        Person("홍길동",25),
        Person("김철수",32),
        Person("이영희",28),
        Person("박지성",21),
        Person("최수민",30)
    ).sortedByDescending { it.age }

    // 3. 나이 25세 이상의 사람들만 필터링하세요
    val filteredPeople = people.filter { it.age >= 25 }

    // 4. 필터링된 모든 이름에 '님' 접미사를 추가하고 나이에 (xx세)가 추가된 문자열로 변환하세요
    val mapPeople = filteredPeople.map { "${it.name}님  (${it.age}세)" }

    // 5. 리스트의 요소에 접근하여 변환된 내용을 한줄에 하나씩 출력하세요
    mapPeople.forEach{ println(it) }
}