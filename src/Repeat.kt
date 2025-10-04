fun main() {
    println("Начинаем ритуал защиты!")
    repeat(times = 5) {
        println("Заклинание защиты активировано!")
    }
    println("Замок защищен!")

    println("\n--- Улучшенная версия ---")
    println("Начинаем ритуал защиты!")
    var index = 0
    repeat(times = 5) {
        println("Заклинание защиты активировано! (Шаг ${index + 1})")
        index++
    }
    println("Замок защищен!")

    println("\n--- Версия с параметром it ---")
    println("Начинаем ритуал защиты!")
    repeat(times = 5) { step ->
        println("Заклинание защиты активировано! (Шаг ${step + 1})")
    }
    println("Замок защищен!")

    println("\n--- Версия с пропуском шага ---")
    println("Начинаем ритуал защиты!")
    repeat(times = 5) { step ->
        if (step == 2) {
            println("Пропускаем шаг ${step + 1} из-за магического вмешательства!")
            return@repeat
        }
        println("Заклинание защиты активировано! (Шаг ${step + 1})")
    }
    println("Замок защищен!")
}