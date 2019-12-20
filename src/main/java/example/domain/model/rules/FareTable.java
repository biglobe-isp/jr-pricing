package track;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        public void postTest() throws ClientProtocolException, IOException
        {
            private static final String URL = "http://challenge-server.code-check.io/api/recursive/ask";
            CloseableHttpClient client = HttpClients.createDefault();
            httpclient = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet("http://challenge-server.code-check.io/api/recursive/ask");

            httpGet.setHeader("Content-type", "application/json; charset=UTF-8");
            Map<String, String> params = new HashMap<>();
            params.put("applicationId", "アプリケーションID");
            params.put("seed", seed);
            params.put("n", n);
            StringBuffer buffer = new StringBuffer();
            params.forEach((key, value) -> buffer.append("&").append(String.format("%s={%s}", key, key)));
            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.getForObject(String.format("%s?%s", URL, buffer.toString()), String.class, params);
            ObjectMapper mapper = new ObjectMapper();
            System.out.println(response);
            System.out.println("code = " + response.getStatusLine().getStatusCode());
            //返ってきたデータを表示
            System.out.println(EntityUtils.toString(response.getEntity()));
        }
        for (int i = 0, l = args.length; i < l; i++) {
            String output = String.format("argv[%s]: %s", i, args[i]);
            System.out.println(output);
        }
    }
}
