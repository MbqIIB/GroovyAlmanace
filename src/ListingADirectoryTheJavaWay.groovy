/**
 * Created by geng on 2016/8/9.
 */
println new File('test').list() // String[]
new File('test').listFiles().each { println it.getName() }