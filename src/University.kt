import kotlin.collections.mutableListOf

class University()
{
    private val students = mutableListOf<Student>()
    private val modules = mutableListOf<Module>()

    fun enrolStudent(name: Student) {
        students.add(name)


    }

    fun findstudentsByName(name: String) : List<Student>
    {
        val nameList = mutableListOf<Student>()
        for (student in students)
        {
            if(student.name == name) {
                nameList.add(student)
            }

        }
        return nameList
    }

    fun findStudentById(id: String): Student? {
        for (student in students) {
            if (student.id == id)
                return student
        }
        return null
    }





}