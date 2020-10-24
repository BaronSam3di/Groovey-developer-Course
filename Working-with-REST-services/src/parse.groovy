
import groovy.net

@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1')
String base = 'http://api.icndb.com'

def chuck = new RESTClient(base)
def params = [firstname:"Dick" , lastname:"Jones"]
chuck.contentType = ContentType.JSON

chuck.get(path:'/jokes/ranndom', query: params) { response, json ->
    println response.status
    print json
}

