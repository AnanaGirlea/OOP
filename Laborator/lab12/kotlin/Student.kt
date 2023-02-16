package lab12.kotlin

data class Student(
    val name: String,
    val surname: String,
    val id: Long
) {
    override fun toString(): String {
        return "Student(name='$name', surname='$surname', id=$id)"
    }
}