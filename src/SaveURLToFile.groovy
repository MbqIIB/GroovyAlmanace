/**
 * Created by geng on 2016/8/8.
 */
// baidu logo

//def url = 'http://www.google.com/images/logo.gif'
def url = 'https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png'
def file = new File('google_logo.gif').newOutputStream()
file << new URL(url).openStream()
file.close()

println('save url finished...')