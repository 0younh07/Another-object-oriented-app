class Student (val id: String, var name: String, var course: String, var mark: Double) {



    fun getGrade() : String {
        var grade: String = when(mark){
            in 70..100 -> "First"
            in 60..69 -> "2/1"
            in 50..59 -> "2/2"
            in 40..49 -> "Third"
            in 0..39 -> "Fail"
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