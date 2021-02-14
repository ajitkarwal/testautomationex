import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonReadExample {

  public static void main(String args[]) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    String jsonInString = "{'name' : 'mkyong'}";

//JSON from file to Object
    User user = mapper.readValue(new File("src/test/resources/user.json"), User.class);

//JSON from String to Object
    User user2 = (User)mapper.readValue(jsonInString, User.class);
  }
}

class User {
  String name;
}


