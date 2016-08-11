/**
 * Created by geng on 2016/8/9.
 */
def field = [["", "x", "o"], ["", "x", ""], ["o", "", ""]]
field.eachWithIndex { line, index ->
    if (index > 0) {
        println "---+" * 2 + "---"
    }
    printf(" %-2s| %-2s| %-2s\n", line)
}