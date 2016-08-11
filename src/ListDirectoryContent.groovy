/**
 * Created by geng on 2016/8/9.
 */
// List directory contents
new File("test").eachFile() { file ->
    println file.getName()
}