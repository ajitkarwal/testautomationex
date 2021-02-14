import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonReadExample {

  /* Examples from
  https://mkyong.com/java/how-to-convert-java-object-to-from-json-jackson/
   */
  public static void main(String args[]) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    String jsonInString = "{\"firstName\" : \"mkyong\"}";

    //JSON from file to Object
    User user = mapper.readValue(new File("src/test/resources/user.json"), User.class);
    System.out.println(" First Name ==== " + user.getFirstName());
    System.out.println(" Last Name ==== " + user.getLastName());

    //JSON from String to Object
    User user2 = (User)mapper.readValue(jsonInString, User.class);
    System.out.println(" First Name ==== " + user2.getFirstName());
    System.out.println(" Last Name ==== " + user2.getLastName());
  }
}

class User {
  String firstName;
  String lastName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}


