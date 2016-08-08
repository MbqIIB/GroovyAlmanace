/**
 * Created by geng on 2016/8/8.
 */
def line
new File("test.txt").withReader { line = it.readLine() }
println line