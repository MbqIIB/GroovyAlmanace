import java.util.zip.ZipFile

/**
 * Created by geng on 2016/8/8.
 */
// This example will search for 1.txt in the zipfile test.zip and print out the result.
def searchstr = "1.txt"
def zipfile = new ZipFile("test.zip")
zipfile.entries().each { entry ->
    if (entry.name =~ searchstr) {
        println "$entry.name"
    }
}