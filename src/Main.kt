fun main() {
    printStringArray("Rehema","Mumina","Aisha","Fatma")
myCities()
    myNumbers(arrayOf(5,3,2,4,1))
    println(friends("frida","katumbi","rachel").contentToString())



}
fun printStringArray(name1:String,name2:String,name3:String,name4:String){
    println(arrayOf(name1,name2,name3,name4).contentToString())


}

fun myCities(){
    var cities = arrayOf("mombasa","nakuru","dodoma","nairobi")


}

fun myNumbers(numbers:Array<Int>){
    println(numbers[1]+numbers[3])
    println(numbers.indexOf(2))
    //println(numbers.sortedArray().contentToString())

    numbers.sortDescending()
    println(numbers.contentToString())
    numbers.sortedArray()
    println(numbers.contentToString())
    numbers.sort()
    println(numbers.contentToString())



}

fun friends(name5:String,name6:String,name7:String):Array<String>{
    return arrayOf(name5,name6,name7)
}

fun countries()