/**
 * Created by geng on 2016/8/9.
 */
// List files recursively
new File('test').eachFileRecurse { file -> println file.getName() }
new File('test').eachDirRecurse { dir ->
    dir.eachFileMatch(~/.*\.txt/) {
        file -> println file.getPath()
    }
}