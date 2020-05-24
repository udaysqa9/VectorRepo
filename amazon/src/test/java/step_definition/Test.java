package step_definition;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.response.Response;

import java.net.URLEncoder;

import static io.restassured.RestAssured.given;

public class Test {

    public static void main(String[] args){
        RestAssured.baseURI= "https://rnbntpax06.execute-api.us-west-2.amazonaws.com";
        String aKey = "";
        String sKey = "";
        Response r = given().
                config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                .header("Content-Type", "application/json")
                .header("X-Amz-Date", "20200507T101509Z")
                .header("Autharization", "AWS4-HMAC-SHA256 Credential=ASIAWICTNOKXP47UYTMN/20200507/us-west-2/execute-api/aws4_request,SignedHeaders=host;x-amz-date,Signature=791acabd74f502ac26f2f411570730b5da836c080145b196badffc75b8099961")
// header("X-Amz-Date", date).    .headers("x-amz-header1", "ASIAWICTNOKXFQ7ZHMNS",
//                              header("Autharization", autharization).          "x-amz-security-token", "YLL+Co1QfXmsKyCLwy30+1HtB6x4ytrMTIUg8UD+",
//                        "AWSAccessKeyId", "ASIAWICTNOKXFQ7ZHMNS",
//                        "x-amz-header1", "IQoJb3JpZ2luX2VjEH4aCXVzLWVhc3QtMSJIMEYCIQCld1PbdI84kPOOaqFll5YdCIveRHDySELNj5kuKQln7QIhANXgmxcAWoOyOTDHBPb6j8XvblLKWBckwVt6EplSbzzPKuEBCLf//////////wEQABoMNDI5NjcxNjc0NTQyIgzvpbXMQFrWXIdLookqtQG3u7Lu1btd8r2f6eiYZWVSH3bHEJufcyUnG30Jw2nNAt20BbljvOGk3rx8s6bx1FOi9Wxx1fKChqk2AD74Dj/ObA7ZhB5Zrz7hxwKs83e1r9M6vQ5aRsaSmqTgMCtB2RnDwA/xQyC3Etezsmum8oDqHQJEAIF5Ic4loiHBFJW2gKKAjdLnHnjNPaj0BSk6OTKmG9gfSVTRXYZTLBclAhkMB0mevQ2Mk5LuSMDL3EGJIdKXzrGNMKu/zvUFOuIBnceOshBstBB2ZaNf4mpASlYFik4C/CCT8ME1QA7OPSwKLsDzNDsKIBPs62qj8qesMXX/89e7xQFBJx401WoSORk92KiutuHbbjQsFSkKdVPskFjTbFqnI35elgq0DYIMs5hcQQFNKYRQxk0BH9jzktY1KinfYvIdEelqIbjbTccBXttNr/whwaf8MbPEz6ivPHNpa9gzFCZfU+O2oZwQgN0naM6EubEeX0+0J+3pEyliZ3Sd+fG41qos2VsqlMTIJKi8eKFD21byT7ZK2FnqjxBwpDI1ClLYvFnZ0MO53xibJw==",
////                        "x-amz-security-token",sKey,
////                        "AWSAccessKeyId",aKey,
//                        "Content-Type","application/json")
//        urlEncodingEnabled(false).
//                queryParam("AWSAccessKeyId", "ASIAWICTNOKXFQ7ZHMNS").
//                queryParam("x-amz-security-token", "YLL+Co1QfXmsKyCLwy30+1HtB6x4ytrMTIUg8UD+").
//                queryParam("Signature", URLEncoder.encode("IQoJb3JpZ2luX2VjEH4aCXVzLWVhc3QtMSJIMEYCIQCld1PbdI84kPOOaqFll5YdCIveRHDySELNj5kuKQln7QIhANXgmxcAWoOyOTDHBPb6j8XvblLKWBckwVt6EplSbzzPKuEBCLf//////////wEQABoMNDI5NjcxNjc0NTQyIgzvpbXMQFrWXIdLookqtQG3u7Lu1btd8r2f6eiYZWVSH3bHEJufcyUnG30Jw2nNAt20BbljvOGk3rx8s6bx1FOi9Wxx1fKChqk2AD74Dj/ObA7ZhB5Zrz7hxwKs83e1r9M6vQ5aRsaSmqTgMCtB2RnDwA/xQyC3Etezsmum8oDqHQJEAIF5Ic4loiHBFJW2gKKAjdLnHnjNPaj0BSk6OTKmG9gfSVTRXYZTLBclAhkMB0mevQ2Mk5LuSMDL3EGJIdKXzrGNMKu/zvUFOuIBnceOshBstBB2ZaNf4mpASlYFik4C/CCT8ME1QA7OPSwKLsDzNDsKIBPs62qj8qesMXX/89e7xQFBJx401WoSORk92KiutuHbbjQsFSkKdVPskFjTbFqnI35elgq0DYIMs5hcQQFNKYRQxk0BH9jzktY1KinfYvIdEelqIbjbTccBXttNr/whwaf8MbPEz6ivPHNpa9gzFCZfU+O2oZwQgN0naM6EubEeX0+0J+3pEyliZ3Sd+fG41qos2VsqlMTIJKi8eKFD21byT7ZK2FnqjxBwpDI1ClLYvFnZ0MO53xibJw=="))
                .body("{\n" +
                        "    \"file\": \"AWSAccountId, Amount\\n496249526917, 1000\",\n" +
                        "    \"requestId\": \"99\",\n" +
                        "    \"name\": \"C:\\Users\\joshees\\Desktop\\original.csv\",\n" +
                        "    \"submitType\": \"\"\n" +
                        "}")
                .when()
                .post("/Test/bulkUpload/upload").then().extract().response();
        System.out.println("Response Code ------   "+r.getStatusCode());
        System.out.println("Response Code ------   "+r.statusLine());
        System.out.println("Response Code ------   "+r.getBody().asString());
    }
}
