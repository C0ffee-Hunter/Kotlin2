package lab2

fun main()
{
    do
    {
        print("Введите путь до нужного файла или выйдете из программы введя - 2: ")    //C://address.csv
        var wayToFile = readln()         //C://address.xml
        if (wayToFile[wayToFile.length - 1] == '2')
            wayToFile = "2"
        if (wayToFile != "2")
        {
            println("НАЧИНАЕМ!!!!")
            val start = System.currentTimeMillis()
            val data = ReadFile(wayToFile)
            val process = ProcessingResults(data.listData)
            process.printDuplicate()
            process.cityFloor()
            val end = System.currentTimeMillis()
            print("Было затрачено времени: ")
            println((end - start) / 1000)
        }
    } while (wayToFile != "2")
}
