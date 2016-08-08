/**
 * Created by geng on 2016/8/8.
 */
System.in.eachLine() { line ->
    if (line.equals("exit"))
        System.exit(0)//
    else
        println "you entered: $line"
}
