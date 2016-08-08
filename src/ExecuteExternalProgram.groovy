/**
 * Created by geng on 2016/8/8.
 */
//This example executes an external program as an process in groovy.
def process = ['echo', 'hello world'].execute()
process.waitFor()
println(process.exitValue())
println(process.in.text)
println(process.err.text)