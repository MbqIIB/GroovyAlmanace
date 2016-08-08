/**
 * Created by geng on 2016/8/8.
 */
class CSVParser {
    static def parseCSV(file, closure) {
        def lineCount = 0
        file.eachLine() { line ->
            def field = line.tokenize(",")
            lineCount++
            closure(lineCount, field)
        }
    }
}
