package mine.example.model;


import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class StudentDeserializer extends StdDeserializer<Student> {

    public StudentDeserializer() {
        super(Student.class);
    }

    @Override
    public Student deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        ObjectMapper mapper = (ObjectMapper) jsonParser.getCodec();
        JsonNode node = mapper.readTree(jsonParser);
        // specify UserPOJO.class to invoke default deserializer
        Student deserializedStudent = mapper.treeToValue(node, StudentPOJO.class);

        //String id = node.get("student_id").asText();
        String name = node.get("student_name").asText();
        //String classin = node.get("student_class").asText();
        //String rollnumber = node.get("student_roll").asText();
        //String address = node.get("student_address").asText();


        //System.out.println(id + " " + name + " " + classin + " " + rollnumber + " " + address);
        //deserializedStudent.setId(Integer.parseInt(id));
        deserializedStudent.setName(name + deserializedStudent.getId());
        //deserializedStudent.setClassin(classin);
        //deserializedStudent.setRollnumber(rollnumber);
        //deserializedStudent.setAddress(address);


        return deserializedStudent;
    }
}
