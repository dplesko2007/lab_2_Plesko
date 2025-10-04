fun main() {
    // Примеры с диапазонами
    val numbers = 1..100
    val symbols = 'a'..'z'

    print("Введите ваш уровень: ")
    val level = readln().toInt()

    if (level in 1..50) {
        println("Уровень $level соответствует требованиям!")
    } else {
        println("Высокий уровень! Вход запрещён!")
    }
}