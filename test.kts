import java.io.File


//File("./").listFiles { file -> file.isDirectory }.forEach {
//    println("file is ${it.name}")
//}

findFile(File("./"))

fun findFile(file: File) {
    if (file.isDirectory) {
        file.listFiles().forEach {
            findFile(it)
        }
    } else {
        println("file's name = ${file.name}")
    }
}