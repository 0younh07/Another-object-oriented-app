class Student (val id: String, var name: String, var course: String, var mark: Double) {



    fun getGrade(marks: Int) {
        var grade: String = when(marks){
            in 70..100 -> "First"
            in 60..69 -> "2/1"
            in 50..59 -> "2/2"
            in 40..49 -> "Third"
            in 0..39 -> "Fail"
            else -> "Invalid mark"
        }
        return grade







    }


    override fun toString(): String {
        return "Name: $name, course: $course, mark: $mark"
    }
}