/*
문제4. 반복문
1. for 반복문을 사용하여 1부터 10까지의 정수들을 출력하세요
2. 10부터 1까지의 정수들을 출력하세요 (중위함수 사용)
3. 1부터 20까지의 정수 중 홀수만 출력하세요 (중위함수 사용)
 */

fun main() {
    // 1. for 반복문을 사용하여 1부터 10까지의 정수들을 출력하세요
    for (i in 1..10) {
        println(i)
    }

    10 printTo 1  // 10부터 1까지 출력

    1 printOddsUpTo 20  // 1부터 20까지 홀수만 출력

}

// 2. 10부터 1까지의 정수들을 출력하세요 (중위함수 사용)
infix fun Int.printTo(to: Int) {
    if (this > to) {
        for (i in this downTo to) {
            println(i)
        }
    } else {
        for (i in this..to) {
            println(i)
        }
    }
}

// 3. 1부터 20까지의 정수 중 홀수만 출력하세요 (중위함수 사용)
infix fun Int.printOddsUpTo(to: Int) {
    for (i in this..to) {
        if (i % 2 != 0) {
            println(i)
        }
    }
}