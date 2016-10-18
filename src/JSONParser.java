import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class JSONParser {
    public List<Data> jSONParser() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
//        Data parsedData = mapper.readValue(new File("/Users/anusree/workspace/dfa/src/test_data.json"), Data.class);
        List<Data> parsedData = mapper.readValue(new File("/Users/anusree/workspace/dfa/dataString.json"), new TypeReference<List<Data>>(){});
        System.out.println(parsedData.get(0).getTuple().getDelta().get("q1"));
        return parsedData;

    }

}
