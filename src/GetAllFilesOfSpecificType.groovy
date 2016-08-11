/**
 * Created by geng on 2016/8/9.
 */
// Get all files of a specific type
new File('test').eachFileMatch(~/.*\.txt/) {
    file -> println(file.getName())
}