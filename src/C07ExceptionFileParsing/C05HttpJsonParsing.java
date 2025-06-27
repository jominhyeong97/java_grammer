package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C05HttpJsonParsing {

    public static void main(String[] args) throws IOException, InterruptedException {

//        외부 데이터(API) 요청 : 서버간의 통신
//        RestTemplate, RestClient : 스프링에서 가장 많이 사용하는 라이브러리
//        HttpClient는 자바의 내장클래스로서 별도의 역직렬화, 직렬화 작업이 필요하다.

//        복습 필요없음

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String postString = response.body();

        ObjectMapper o1 = new ObjectMapper();

        JsonNode json = o1.readTree(postString);

        List<Post> p = new ArrayList<>();

        for(JsonNode j : json) {
           Post post = o1.readValue(j.toString(), Post.class);
            p.add(post);
        }

        for(Post a : p) {
            System.out.println(a);
        }







    }
}

class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    public Post() {

    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}