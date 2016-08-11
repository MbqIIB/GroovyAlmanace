import org.apache.tools.ant.Project
import org.apache.tools.ant.ProjectHelper

/**
 * Created by geng on 2016/8/9.
 */
//load the ant build.xml
def antFile = new File("build.xml")
def project = new Project()

project.init()
ProjectHelper.projectHelper.parse(project, antFile)
// this will call the main target
project.executeTarget(project.defaultTarget);