fun main(){
   var names=listOf("Ephy","Phiona","Alice","Tamara","Meare","Sean","Mustafa","Davis","Sammy","Buch")
    for (names in 1..10){
        if (names% 2==0)
            println(names)
    }
    var People= listOf(1,2,3,4)
    println(People.average())
    println(People.sum())
    var a=Person("Blesssings",15,2.0,60)
    var b=Person("Alice",38,5.0,80)
    var c=Person("Meare",2,4.0,30)
    var all= listOf(a,b,c)
    var Person=all.sortedByDescending { all->all.age }
    println(Person)
    var Human= listOf("Sean",3.5,"Loop")
    println(all.plus(Human))

    var e=Car("KCE917",40)
    var f=Car("KDD304",30)
    var g=Car("KDG416",50)
    var h= listOf(e,f,g)
    println(vehicles(h))
}
data class Person(var name:String,var age:Int,var height:Double,var weight:Int)


data class Car(var registration:String,var mileage:Int)
fun vehicles(bus:List<Car>):Int{
    var x=0
    bus.forEach { car->car.mileage
        x+=car.mileage

    }

var average=x/bus.count()
    return average
}


