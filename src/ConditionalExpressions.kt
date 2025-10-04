fun main() {
    // Примеры с if/else
    print("Введите первое число: ")
    val number1 = readln().toInt()
    print("Введите второе число: ")
    val number2 = readln().toInt()

    val max = if (number1 > number2) number1 else number2
    println("Максимальное число - $max")
}