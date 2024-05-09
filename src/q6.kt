/*
문제6 클래스
1. 동물의 기본 특징을 담고 있는 Animal 추상 클래스를 작성하세요
- name(이름) 프로퍼티를 가지며 이를 생성자에서 초기화 하세요
- sound() 추상 메서드를 선언하세요
- move() 기본 메서드를 구현하세요 ( ## 가 움직입니다.)
2. Animal 클래스를 상속받는 Cat 와 Dog 클래스를 각각 작성하세요
- 각 클래스는 sound() 메서드를 구현하여 고유한 울음소리(야용, 멍멍)를 출력하세요
3. Runnable 인터페이스를 구현하는 Cat과 Dog 클래스에서 run() 메서드를 작성하세요
4. Cat 과 Dog 객체를 생성하고 sound() move() run() 메서드를 호출하여 결과를 출력하세요
 */

// 1. 동물의 기본 특징을 담고 있는 Animal 추상 클래스를 작성하세요
abstract class Animal (var name: String) {
    abstract fun sound()

    fun move() {
        println("${name}가 움직입니다.")
    }
}

// 2. Animal 클래스를 상속받는 Cat 와 Dog 클래스를 각각 작성하세요
class Dog(name: String): Animal(name), Runnable {
    override fun sound() {
        println("개 ${name}이: 멍멍")
    }


    override fun run() {
        println("개 ${name}가 달립니다.")

    }
}
class Cat(name: String): Animal(name), Runnable {
    override fun sound() {
        println("고양이 ${name}이: 야옹")
    }

    override fun run() {
        println("고양이 ${name}가 달립니다.")
    }
}
//3. Runnable 인터페이스를 구현하는 Cat 과 Dog 클래스에서 run() 메서드를 작성하세요
interface Runnable {
    fun run() = println("달립니다")
}

// 4. Cat 과 Dog 객체를 생성하고 sound() move() run() 메서드를 호출하여 결과를 출력하세요
fun main() {
    val cat = Cat("냥냥이")
    val dog = Dog("바둑이")

    cat.sound()
    cat.move()
    cat.run()

    dog.sound()
    dog.move()
    dog.run()
}