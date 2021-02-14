import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonWriteExample {

  /* Examples from
  https://mkyong.com/java/how-to-convert-java-object-to-from-json-jackson/
   */
  public static void main(String args[]) throws IOException {
    ObjectMapper mapper = new ObjectMapper();

    //For testing
    User user = createDummyUser();

    try {
      //Convert object to JSON string and save into file directly
      mapper.writeValue(new File("src/test/resources/user_write.json"), user);

      //Convert object to JSON string
      String jsonInString = mapper.writeValueAsString(user);
      System.out.println(jsonInString);

      //Convert object to JSON string and pretty print
      jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
      System.out.println(jsonInString);


    } catch (JsonGenerationException e) {
      e.printStackTrace();
    } catch (JsonMappingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static User createDummyUser() {
    User user = new User();
    user.setFirstName("AjitPal");
    user.setLastName("Singh");
    return user;
  }


}
