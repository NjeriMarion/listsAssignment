fun main(){
//    println(heights(mutableListOf(20.3, 45.6, 56.0,12.4,)))
    persons()
    println(allCars())
    println(output())
}
//returns height and total weight
data class People(var height: Double, var weight: Double)
fun output():List<Any>{
    val maria = People(1.7, 59.79)
    val kimani = People(1.5, 70.79)

    var peopleList = mutableListOf(maria, kimani)
    var weightOutput = listOf(peopleList[0].weight, peopleList[1].weight)
    var heightOutput1 = listOf(peopleList[0].height )
    var heightOutput2 = listOf(peopleList[1].height )
    var totalHeight = (heightOutput1 + heightOutput2)

    var finalOutput = listOf(weightOutput.average(), totalHeight)
    return finalOutput



}
//Sorting list in descending age order
data class Person(var name:String, var age:Int, var height:Double, var weight:Double)

fun persons() {
    val person1 = Person("Marion", 22, 1.5, 56.8)
    val person2 = Person("Mwangi", 24, 1.6, 60.2)
    val person3 = Person("Ndemo", 21, 1.7, 50.3)
    val person4 = Person("Kimani", 23, 1.8, 65.4)
    val person5 = Person("Me", 25, 1.4, 57.6)

    val allPeople = mutableListOf<Person>(person1, person2, person3, person4, person5)
    println(allPeople.sortedByDescending { person -> person.age })

// adding objects to list above
    val person7 = Person("Rahab", 39, 1.6, 76.8)
    val person6 = Person("Loise", 56, 1.9, 80.2)

//    val newAllPeople = allPeople.add(person6, person7)
//    println(newAllPeople)


}
//returns the average mileage of vehicles in alist
data class Car(var registration : String, var mileage: Double)

fun allCars():Double {
    val mazda = Car("KBH 237Y", 999.99)
    val demio = Car("KBH 237Y", 345.34)
    val belta = Car("KBH 237Y", 956.55)
    val audi = Car("KBH 237Y", 296.89)
    val ferrari = Car("KBH 237Y", 599.79)

    val carList = listOf(mazda, demio, belta, audi, ferrari)
    var mile = listOf(carList[0].mileage, carList[1].mileage, carList[2].mileage, carList[3].mileage, carList[4].mileage)
    return (mile.average())

}
