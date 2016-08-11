/**
 * Created by geng on 2016/8/9.
 */
def ant = new AntBuilder()
def list = ant.fileScanner {
    fileset(dir: "stuff")
}
list.each() { file ->
    println "sizeof ${file.getName()} is ${file.length()} bytes"
}
list = ant.fileScanner {
    fileset(dir: "stuff") {
        include(name: "*.txt")
        exclude(name: "*.doc")
    }
}
list.each { file ->
    println "sizeof ${file.name} is ${file.length()} bytes"
}
