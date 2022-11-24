package lab2

class ProcessingResults(private val data: HashMap<Address, Int>) {
    fun printDuplicateEntry() {
        data.forEach {
            println("${it.key} Повторений ${it.value}")
        }
    }

    fun cityFloor() {
        val countCityFloor = hashMapOf<String, CountFloor>()
        for (address in data) {
            if (!countCityFloor.containsKey(address.key.city))
                countCityFloor[address.key.city] = CountFloor()
            when (address.key.floor) {
                1 -> countCityFloor[address.key.city]?.one = countCityFloor[address.key.city]?.one!! + 1
                2 -> countCityFloor[address.key.city]?.two = countCityFloor[address.key.city]?.two!! + 1
                3 -> countCityFloor[address.key.city]?.three = countCityFloor[address.key.city]?.three!! + 1
                4 -> countCityFloor[address.key.city]?.four = countCityFloor[address.key.city]?.four!! + 1
                5 -> countCityFloor[address.key.city]?.five = countCityFloor[address.key.city]?.five!! + 1
            }
        }
        countCityFloor.forEach {
            println("\nКоличество 1,2,3,4 и 5 этажных домов в городе ${it.key}")
            println("1 этажных домов: ${it.value.one}")
            println("2 этажных домов: ${it.value.two}")
            println("3 этажных домов: ${it.value.three}")
            println("4 этажных домов: ${it.value.four}")
            println("5 этажных домов: ${it.value.five}")
        }

    }
}