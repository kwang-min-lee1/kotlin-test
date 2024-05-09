/*
문제9. 지연 초기화
- 2개의 지연 초기화된 프로퍼티를 갖는 User 클래스 선언하세요
1. lateinit 키워드를 사용하여 문자열  username 을 선언하세요
2. username 은 initUsername 함수를 통해 지연 초기화 됩니다.
3. lazy 키워드를 사용하여 welcomeMessage 를 선언하세요
4. welcomeMessage 은 getter 가 호출될 때 "환영합니다. , [username] 님!" 으로 지연 초기화됩니다.
5. main 함수에서 User 객체를 생성하고, username 을 초기화하고, welcomeMessage 를 출력하세요.

 출력예시
 환영합니다. 홍길동 님!
 */

// 2개의 지연 초기화된 프로퍼티를 갖는 User 클래스 선언하세요
class User {
    // 1. lateinit 키워드를 사용하여 문자열  username 을 선언하세요
    lateinit var username: String

    // 3. lazy 키워드를 사용하여 welcomeMessage 를 선언하세요
    // 4. welcomeMessage 은 getter 가 호출될 때 "환영합니다. , [username] 님!" 으로 지연 초기화됩니다.
    val welcomeMessage: String by lazy {
        "환영합니다. ${username} 님!"
    }

    // 2. username 은 initUsername 함수를 통해 지연 초기화 됩니다.
    fun initUsername(name: String) {
        this.username = name
        }
}

//  5. main 함수에서 User 객체를 생성하고, username 을 초기화하고, welcomeMessage 를 출력하세요.
fun main() {
    val user = User()
    user.initUsername("홍길동")
    println(user.welcomeMessage)
}




