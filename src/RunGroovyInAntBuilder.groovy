/**
 * Created by geng on 2016/8/9.
 */
def antBuilder = new AntBuilder()
antBuilder.property(name: "testProp1", value: "TEST 1")
antBuilder.taskdef(name: "groovy", classname: "org.codehaus.groovy.ant.Groovy")
antBuilder.groovy("println 'Hello World'")
antBuilder.groovy("assert 1+1 == 2")