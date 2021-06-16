fun main(args: Array<String>) {


    /* collectin of Two Types
    1.immutable (immutable means : Collection only Read)
    2.Mutable (Mutable means : Collection  Read and Write)
    */

    /* 1.immutable collection:
        1.listof
        2.mapof
        3.setof
    */
    val idlistof = listOf<Int>(1, 1, 1, 1)
    val idlistof_without_type = listOf(1, 1, 1, 1)

    val idmapof = mapOf<String, String>("1" to "ruhul", "2" to "amin")
    val idmapof_without_type = mapOf("1" to "ruhul", "2" to "amin")
    val idmapof_defrentdata_without_type = mapOf("1" to "ruhul", 2 to "amin")

    val setof = setOf<String>("Asia", "Urop")
    val idsetof_without_type = setOf("Asia", "Urop")

    /* 1.mutable collection:

        1.mutable list
            1.Arraylist
            2.arrayListof
            3.mutableListof

        2.mutable map
            1.HashMap
            2.hasMapof
            3.mutablemapof

        3.mutable set

            1.mutablesetof
            2.hassetof
    */

    /* 1. mutable list */
    var arraylist = ArrayList<String>()

    var arraylistof = ArrayList<String>()

    arraylistof.add("Bangladseh")
    arraylistof.add("Indonesia")

    print("mutable arraylistof: " + arraylistof.get(0))

    val mutablelistof = mutableListOf("java")
    val mutablelistof_withexplecit_type = mutableListOf<Int>(510)
    mutablelistof.add(0, "kotlin")


    /* 2. mutable map */


    val mutable_hasmap = HashMap<String, String>(2)
    mutable_hasmap.put("name", "ruhul")
    mutable_hasmap.put("country", "Bangladesh")

    val mutable_hasmapof = hashMapOf<String, String>("1" to "ruhul", "2" to "amin")
    val idhasmapof = hashMapOf<Int, String>(1 to "ruhul", 2 to "amin")
    idhasmapof.put(3, "Bangladesh")
    for (idhas in idhasmapof) {
        println(idhas)
    }

    val mutablemapof = mutableMapOf<Int, String>(1 to "python", 2 to "java")
    mutablemapof.put(3, "php")

    for (id in mutablemapof) {
        println(id)
    }


    /* 3. mutable set */

    var mutableset = mutableSetOf<String>("Ban", "indo")
    mutableset.add("ka")
    //var mutableset = mutableSetOf("Ban","indo")
    for (country in mutableset) {
        println(country)
    }

    var hassetof = hashSetOf("ruhul")
    //var hassetof = hashSetOf<String>()
    hassetof.add("ruhul")
    hassetof.add("amin")
    hassetof.add("ruhul")


}