class Student (idIn: String, nameIn: String, courseIn: String, markIn: Double) {

    var id: String = idIn
    var name: String = nameIn
    var course: String = courseIn
    var mark: String = markIn.toString()


    override fun toString(): String {
        return "Name: $name, course: $course, mark: $mark"
    }
}