import lombok.*;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;

@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Data {

    private String name;
    private Tuple tuple;
    private String type;
    @JsonProperty("pass-cases") ArrayList<String> pass_cases;
    @JsonProperty("fail-cases") ArrayList<String> fail_cases;
}