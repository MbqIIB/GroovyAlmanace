/**
 * Created by geng on 2016/8/8.
 */
use(CSVParser.class) {// use category @http://www.groovy-lang.org/design-patterns.html#_pimp_my_library_pattern
    File file = new File("test.csv")
    file.parseCSV { index, field ->
        println "row: ${index} | ${field[0]} ${field[1]} ${field[2]}"
    }
}