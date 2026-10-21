class Student (val id: String, var name: String, var course: String, var mark: Double) {



    fun getGrade() : String {
        var grade: String = when(mark){
            in 70.0..100.0 -> "First"
            in 60.0..69.0 -> "2/1"
            in 50.0..59.0 -> "2/2"
            in 40.0..49.0 -> "Third"
            in 0.0..39.0 -> "Fail"
            else -> "Invalid mark"
        }
        return "grade: $grade"


    }
    fun didPass() : Boolean {
        return mark >= 40
        /*
        if (mark >= 40){
            return true
        }
        return false

         */
    }


    override fun toString(): String {
        return "Name: $name, course: $course, mark: $mark"
    }
}