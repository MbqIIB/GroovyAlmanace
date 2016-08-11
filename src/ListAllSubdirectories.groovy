/**
 * Created by geng on 2016/8/9.
 */
// List all subdirectories
new File('test').eachDir { dir -> println dir.getPath() }