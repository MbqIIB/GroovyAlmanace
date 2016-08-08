/**
 * Created by geng on 2016/8/8.
 */
class FileFilter implements java.io.FilenameFilter {
    public boolean accept(File f, String filename) {
        return filename.endsWith(".txt")
    }
}

println new File("test").list(new FileFilter())
new File("test").listFiles(new FileFilter()).each { file ->
    println file.getName()
}