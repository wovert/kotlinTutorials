import org.apache.commons.httpclient.HttpClient
import org.apache.commons.httpclient.methods.GetMethod
import java.io.File


fun main(args: Array<String>) {
    var client = HttpClient()
    var method = GetMethod("http://www.1697mn.com/1697/2019-10-31/1572486487aS7q.jpg")
    client.executeMethod(method)
    var responseBody = method.responseBody
    method.releaseConnection()
    var file = File("1.jpg")
    file.writeBytes(responseBody)
}

