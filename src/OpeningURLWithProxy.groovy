/**
 * Created by geng on 2016/8/8.
 */
// Change proxy-host and proxy-port to your local proxy server.
System.properties.putAll(["http.proxyHost": "proxy-host", "http.proxyPort": "proxy-port"])
def url = 'http://www.google.com/images/logo.gif'
def file = new FileOutputStream(url.tokenize("/")[-1])
def out = new BufferedOutputStream(file)
out << new URL(url).openStream()
out.close()