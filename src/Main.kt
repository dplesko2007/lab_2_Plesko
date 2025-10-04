fun main() {
    fun main() {
        print("Введите первое число: ")
        val number1 = readln().toInt()
        print("Введите второе число: ")
        val number2 = readln().toInt()

        if (number1 > number2) {
            println("Число $number1 больше чем число $number2")
        } else {
            println("Число $number2 больше чем число $number1")
        }

        val max = if (number1 > number2) number1 else number2
        println("Максимальное число - $max")
    }

    val age = readln().toInt()
    val status = if (age >= 18) "Взрослый" else "Ребёнок"
    println(status)
    print("Введите урон: ")
    val damage = readln().toInt()
    print("Щит активен? (введите да или нет): ")
    val shieldActive = readln().lowercase() == "да"

    val finalDamage = if (shieldActive) damage / 2 else damage
    println("Полученный урон: $finalDamage")
    print("Введите ваш уровень: ")
    val level = readln().toInt()
    print("У вас есть VIP-статус? (true/false): ")
    val hasVIP = readln().toBoolean()

    if ((level >= 30 && hasVIP) || level >= 50) {
        println("Доступ разрешен!")
    } else {
        println("Доступ запрещен!")
    }
    val months = listOf("Python", "Kotlin", "C#", "C++", "Java")

    println(months[0])
    println(months.size)
    println("Kotlin" in months)

    val daysInMonth = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    print("Введите номер месяца (1–12): ")
    val input = readln().toInt()

    if (input in 1..12) {
        val days = daysInMonth[input - 1]
        println("В этом месяце $days дней.")
    } else {
        println("Некорректный номер месяца.")
    }
    val lowerCaseLetter: Char = 'a'
    val upperCaseLetter: Char = 'Q'
    val number: Char = '1'
    val space: Char = ' '
    val dollar: Char = '$'

    val ch = '\u0040'
    println(ch) // @

    val ch1 = 'a'
    println(ch1.code)
    val num = 97
    println(num.toChar())

    print("Введите символ: ")
    val inputChar: Char = readln().first()
    println("Вы ввели: $inputChar")

    val ch2 = 'b'
    val ch3 = ch2 + 1
    val ch4 = ch3 - 2

    var ch5 = 'A'
    ch5 += 10
    println(ch5)
    println(++ch5)
    println(++ch5)
    println(--ch5)

    println("Первая строка\nВторая строка")
    println("Табуляция\tздесь")
    println("Кавычки: \"Текст в кавычках\"")
    println("Обратный слеш: \\")

    println('a' < 'c')
    println('x' >= 'z')
    println('D' == 'D')
    println('Q' != 'q')
    println('A' < 'a')

    val one = '1'
    val capital = 'A'
    val small = 'e'

    println(one.isDigit())
    println(one.isLetter())
    println(capital.isLetterOrDigit())
    println(capital.isUpperCase())
    println(capital.isLowerCase())
    println(small.uppercase())
    println(small.uppercaseChar())
}
