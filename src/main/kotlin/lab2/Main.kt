package lab2

fun main() {
    println("1 - Введите путь до файла-справочника\n2 - Завершение работы")
    do {
        print("Введите путь до файла или выдете из программы на '2': ")    //C://address.csv
        var path = readln()         //C://address.xml
        if (path[path.length - 1] == '2')
            path = "2"
        if (path != "2") {
            try {
                println("НАЧИНАЕМ!!!!")
                val timeStart = System.currentTimeMillis()
                val data = ReadFile(path)
                val work = ProcessingResults(data.listData)
                work.printDuplicateEntry()
                work.cityFloor()
                val timeEnd = System.currentTimeMillis()
                println("---" + ((timeEnd - timeStart) / 1000) + " секунд ---")
            } catch (e: Exception) {
                println(e.message)
            }


        }
    } while (path != "2")
}