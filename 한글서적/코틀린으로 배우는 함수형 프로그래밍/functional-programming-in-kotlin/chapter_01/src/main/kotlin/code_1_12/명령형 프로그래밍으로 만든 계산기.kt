package code_1_12

fun main(args: Array<String>) {
    val calculator = SimpleCalculator()

    println(calculator.calculate('+', 3, 1)) // "4" 출력
    println(calculator.calculate('-', 3, 1)) // "2" 출력
}

class SimpleCalculator {

    fun calculate(operator: Char, num1: Int, num2: Int): Int = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        else -> throw IllegalArgumentException()
    }
}
