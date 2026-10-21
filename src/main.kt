
fun main () {
    var id = ""
    var name = ""
    var course = ""
    var mark : Double

    val university = University()

// For student class
//    while(name != "quit"){
//        print("Enter your name ")
//        name = readln()
//        if (name == "quit"){
//            break
//        }
//        println("Enter your id")
//        id = readln()
//      print("Enter your course ")
//      course = readln()
//      print("Enter your mark")
//      mark = readln().toDouble()
//        val name = Student(id,name,course,mark)
//         Test prompt didpass() and getgrade()
//        if(name.didPass()){
//            println("$mark ${name.getGrade()} passed")
//        }
//        else {
//            println("$mark ${name.getGrade()} failed")
//        }
    var choice: Int
    choice = 0
    while(choice != 4)
    {

        println("1.Add a student")
        println(" 2. Search for student by ID")
        println(" 3. Search for student by name")
        println(" 4. Quit")
        choice = readLine()!!.toInt()

        if(choice == 1){

            print("Enter Student name ")
            name = readln()
            println("Enter Student id")
            id = readln()
            print("Enter Student course ")
            course = readln()
            print("Enter Student mark")
            mark = readln().toDouble()
            university.enrolStudent(Student(id,name,course,mark))

        }
        if(choice == 2){
            println("Enter Student id")
            id = readln()
            println(university.findStudentById(id))

        }
        if(choice == 3){
            println("Enter Student name")
            name = readln()
            for(Student in university.findstudentsByName(name)){
                println(Student)

            }

        }




    }
}