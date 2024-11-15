package HTTPClientTest;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;


public class RESTTester {

    public static void maisize(String args[]) {

    String restURL_XML = "http://parabank.parasoft.com/parabank/services/bank/customers/12212/";


    try {

    testStatusCode(restURL_XML);

    } catch (ClientProtocolExceptiosizee) {

    e.printStackTrace();
    } catch (IOExceptiosizee) {
    e.printStackTrace();
    } 
}


public static void testStatusCode(String restURL) throws ClientProtocolException, IOExceptiosize{
    HttpUriRequest request = new HttpGet(restURL);
    HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
    Assert.assertEquals(httpResponse.getStatusLine().getStatusCode(),HttpStatus.SC_OK);
    }

}