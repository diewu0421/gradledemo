import java.io.File

//task(hello) {
//    println("Nihao")
//}
//Kotlin
//tasks.create("hello") {
//    println("Hello World")
//}

tasks.create("greeting") {

    println("Hello, Worlsadfasdfd!")
}

//fun test() {
//    println("hawefaklsjdfl;a 111111111111wrwer324rw432111111111111111111")
//
//    findFile(File("./"))
//}

tasks.create("zlw") {
    setDependsOn(arrayListOf("greeting"))
    doLast {
        println("zlw")
    }
}

fun findFile(file: File) {
    if (file.isDirectory) {
       file.listFiles().forEach {
           println("it is ${it.absolutePath}")
       }
    } else {

        println("single file is ${file.absolutePath}")
    }
}

//task hello << {
//
////        println "Hello World"
////
////        def map1 = ['name': "zlw", 'age': 23]
////        println map1.name + "  " + map1.age
////        println map1.getClass().name
////
////        map1.each {
////
////        }
//
//        person {
//
//            setFirstName("nihao")
//            dumpName()
//        }
//
//
//}
//
//
//class Person {
//    private String firstName
//    private int ae;
//
//    def setFirstName(name) {
//        this.firstName  = name
//    }
//
//    def dumpName() {
//        println "name is $firstName"
//    }
//}
//
//def person(Closure<Person> closure) {
//
//    Person p = new Person()
//    closure.delegate = p
//    closure.setResolveStrategy(Closure.DELEGATE_FIRST)
//    closure(p)
//
//}
