import org.junit.Test;

import java.util.List;

public class JSONParserTest {
    @Test
    public void should_parse_data() throws Exception {
        FileScanner fileScanner = new FileScanner();
        fileScanner.scanFile();
        JSONParser parser = new JSONParser();
        List parsedData = parser.jSONParser();

    }
}
