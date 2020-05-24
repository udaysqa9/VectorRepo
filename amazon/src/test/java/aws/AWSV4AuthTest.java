package aws;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;
import java.util.TreeMap;

import static io.restassured.RestAssured.given;

/**
 * Example: Signing AWS Requests with Signature Version 4 in Java(Test class).
 *
 */
public class AWSV4AuthTest {
    public static void main(String[] args) {
        String date = "20200507T101509Z";


            String autharization = "AWS4-HMAC-SHA256 Credential=ASIAWICTNOKXP47UYTMN/20200507/us-west-2/execute-api/aws4_request,SignedHeaders=host;x-amz-date,Signature=791acabd74f502ac26f2f411570730b5da836c080145b196badffc75b8099961";
//        RequestSpecification restAssuredRequest;
//        restAssuredRequest = RestAssured.given();
//        String url = "rnbntpax06.execute-api.us-west-2.amazonaws.com/Test/bulkUpload/upload";
//
//
//        /**
//         * Add host without http or https protocol.
//         * You can also add other parameters based on your amazon service requirement.
//         */
//        TreeMap<String, String> awsHeaders = new TreeMap<String, String>();
//        awsHeaders.put("host", "rnbntpax06.execute-api.us-west-2.amazonaws.com");
//
//        AWSV4Auth aWSV4Auth = new AWSV4Auth.Builder("ASIAWICTNOKXP47UYTMN", "szqS8tI4TcfsE+dxoQQgIS0PftFFvl6y6+o/BnC+")
//                .regionName("us-west-2")
//                .serviceName("execute-api") // es - elastic search. use your service name
//                .httpMethodName("POST") //GET, PUT, POST, DELETE, etc...
//                .canonicalURI("") //end point
//                .queryParametes(null) //query parameters if any
//                .awsHeaders(awsHeaders) //aws header parameters
//                .payload(null) // payload if any
//                .debug() // turn on the debug mode
//                .build();
//
//        /* Get header calculated for request */
//        Map<String, String> header = aWSV4Auth.getHeaders();
//        for (Map.Entry<String, String> entrySet : header.entrySet()) {
//            String key = entrySet.getKey();
//            String value = entrySet.getValue();
//            if(key.contains("date")){
//                date = value;
//            }else if(key.contains("Authorization")){
//                autharization = value;
//            }
//
//            /* Attach header in your request */
//            /* Simple get request */
//            //HttpGet httpGet = new HttpGet(url);
//            //httpGet.addHeader(key, value);
//        }
        // execute httpGet
//        restAssuredRequest.body("{\n" +
//                "    \"file\": \"AWSAccountId, Amount\\n496249526917, 1000\",\n" +
//                "    \"requestId\": \"99\",\n" +
//                "    \"name\": \"C:\\Users\\joshees\\Desktop\\original.csv\",\n" +
//                "    \"submitType\": \"\"\n" +
//                "}");
//        Response restAssuredResponse = restAssuredRequest.post("/Test/bulkUpload/upload");
//        System.out.println(restAssuredResponse.asString());
//        System.out.println(restAssuredResponse.getStatusCode());


        RestAssured.baseURI= "https://rnbntpax06.execute-api.us-west-2.amazonaws.com";
        Response r = given().
                header("Content-Type", "application/json").
                header("X-Amz-Date", date).
                header("Autharization", autharization).
                body("{\n" +
                "    \"file\": \"AWSAccountId, Amount\\n496249526917, 1000\",\n" +
                "    \"requestId\": \"99\",\n" +
                "    \"name\": \"C:\\Users\\joshees\\Desktop\\original.csv\",\n" +
                "    \"submitType\": \"\"\n" +
                "}")
                .when()
                .post("/Test/bulkUpload/upload");
        System.out.println("Response Code ------   "+r.getStatusCode());
        System.out.println("Response Code ------   "+r.statusLine());
        System.out.println("Response Code ------   "+r.getBody().asString());
    }
}