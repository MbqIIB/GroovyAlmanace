/**
 * Created by geng on 2016/8/9.
 */
new File('test').eachDirMatch('bar') { dir -> dir.getPath() }