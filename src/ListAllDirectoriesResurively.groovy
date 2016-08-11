/**
 * Created by geng on 2016/8/9.
 */
//List directories recursively
new File('test').eachDirRecurse { dir -> println dir.getPath() }