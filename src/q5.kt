import kotlin.math.sqrt
import kotlin.math.pow

/*
문제5. 함수
1. 두 점 사이의 거리를 계산하는 calculateDistance 함수를 작성하세요
- x1, y1 은 첫 번째 점의 좌표이며 기본값은 각각 0으로 설정하세요
- x2, y2 는 두번째 점의 좌표이며 기본값은 각각 0으로 설정하세요
- 두점 사이의 거리는 공식을 이용합니다.
- 제곱근은 kotlin.math.sqrt, 제곱은 kotlin.math.pow 를 사용하세요
2. 위 함수를 사용하여 아래와 같은 다양한 입력값을 통해 거리를 계산하고 출력하세요
- 함수 호출 시, 기본값, 일반순서 이름있는 인자를 각각 모두 사용하세요

 */
// 1. 두 점 사이의 거리를 계산하는 calculateDistance 함수를 작성하세요
fun calculateDistance (x1: Double = 0.0, y1: Double = 0.0, x2: Double = 0.0, y2: Double = 0.0): Double {
    val dx = (x2-x1).pow(2)
    val dy = (y2-y1).pow(2)
    return sqrt(dx + dy)
}

// 2. 위 함수를 사용하여 아래와 같은 다양한 입력값을 통해 거리를 계산하고 출력하세요
fun main() {

    val distance1 = calculateDistance(0.0,0.0,0.0,0.0)
    println("두 점 사이의 거리: ${distance1}")

    val distance2 = calculateDistance(3.0,4.0,0.0,0.0)
    println("두 점 사이의 거리: ${distance2}")

    val distance3 = calculateDistance(0.0,0.0,5.0,5.0)
    println("두 점 사이의 거리: ${distance3}")

    val distance4 = calculateDistance(10.0,0.0,0.0,10.0)
    println("두 점 사이의 거리: ${distance4}")
}
