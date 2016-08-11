/**
 * Created by geng on 2016/8/9.
 */
def lines = 0
//System.in.eachLine {
//    if (it == 'exit') {
//        System.exit(1)
//    } else {
//        lines++
//        println lines
//    }
//}

def fileName = "test.txt"
new File(fileName).eachLine {
    lines++
}
println lines