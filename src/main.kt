
fun main () {
    var id = ""
    var name = ""
    var course = ""
    var mark : Double


    while(name != "quit"){
        print("Enter your name ")
        name = readln()
        if (name == "quit"){
            break
        }
        println("Enter your id")
        id = readln()
      print("Enter your course ")
      course = readln()
      print("Enter your mark")
      mark = readln().toDouble()
        val name = Student(id,name,course,mark)

        println(name)
        println(name.getGrade())
        println(name.didPass())







    }
}