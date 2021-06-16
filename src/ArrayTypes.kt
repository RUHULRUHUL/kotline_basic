import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.*

fun main() {

    /* scanner object*/
    val Sc = Scanner(System.`in`)

    /* array in Mutable but has fixed size */
    /*array declaration system */
    val idvalue = Array<Int>(5) { 0 }

    for (i in idvalue.indices) {
        println("please input value [$i] = ")
        idvalue[i] = Sc.nextInt()
    }
    for (v in idvalue) {
        println(v)
    }


    /* array declaration two type:
        1.explicit
        2.implicit

    */

    /* explicit type declaration*/
    val language = arrayOf<String>("kotlin", "java", "php", "python")

    language.set(0, "java")
    language.set(1, "kotlin")

    println("language [0]=" + language.get(0))
    println("language [1]=" + language.get(1))

    for (values in language) {
        println("language: " + values)
    }


    /* implicit type declaration*/
    var id = arrayOf(1, 2, 3, 4, 5)

    /*  Kotlin also has some built-in factory methods to create arrays of primitive data types,
     such as byteArray, intArray, shortArray, etc.  */

    var bytearray_demo = byteArrayOf(1, 2, 3, 4, 5)
    var Shortarray_demo = shortArrayOf(1, 2, 3, 4, 5)
    var intarray_demo = intArrayOf(1, 2, 3, 4, 5)
    var floatarray_demo = floatArrayOf(1f, 2f, 3f, 4f, 5f)
    var doublearray_demo = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    var longarray_demo = longArrayOf(1, 2, 3, 4, 5)


    var Student_id = intArrayOf(1, 2, 3, 4, 5)

    for (id in Student_id) {
        println(id)
    }
    println("another array print---")
    for (id in 0..Student_id.size - 1) {
        println("student id [$id =]" + " : " + Student_id[id])
    }


}