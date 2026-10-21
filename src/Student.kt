import kotlin.collections.mutableListOf

abstract class Student (val id: String, nameIn: String, protected var course: String, markIn: Double){
    protected val modules = mutableListOf<Module>()


    var mark = markIn
        set(newmarks){
            if(newmarks in 0.0..100.0){
                field = newmarks
            }
        }
    var name = nameIn
        protected set




    abstract fun getGrade() : String {
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