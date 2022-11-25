package lab2

class ProcessingResults(private val data: HashMap<Address, Int>) 
{
    fun counterFloor()
    {
        val countFloor = hashMapOf<String, CountFloor>()
        for (address in data)
        {
            if (!countFloor.containsKey(address.key.city)) 
            {
                countFloor[address.key.city] = CountFloor()
            }
            val tempForCounter = 1
            when (address.key.floor) 
            {
                1 -> countFloor[address.key.city]?.one = countFloor[address.key.city]?.one!! + tempForCounter
                2 -> countFloor[address.key.city]?.two = countFloor[address.key.city]?.two!! + tempForCounter
                3 -> countFloor[address.key.city]?.three = countFloor[address.key.city]?.three!! + tempForCounter
                4 -> countFloor[address.key.city]?.four = countFloor[address.key.city]?.four!! + tempForCounter
                5 -> countFloor[address.key.city]?.five = countFloor[address.key.city]?.five!! + tempForCounter
            }
        }
        countFloor.forEach 
        {
            println("\nКоличество домов в городе ${it.key}")
            println("Одноэтажных домов: ${it.value.one}")
            println("Двухэтажных домов: ${it.value.two}")
            println("Трёхэтажных домов: ${it.value.three}")
            println("Четырёхэтажных домов: ${it.value.four}")
            println("Пятиэтажных домов: ${it.value.five}")
        }

    }
}
