/**
 * Created by geng on 2016/8/9.
 */
def ant = new AntBuilder()
ant.zip(destfile: "test.zip",
        basedir: "stuff",
        includes: "**/*.txt",
        excludes: "**/*.doc")
// This is an example of the groovy antbuilder to create a zipfile.