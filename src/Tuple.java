import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.HashMap;
import java.util.HashSet;

@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Tuple {

    private HashSet<State> states;
    private HashSet<String> alphabets;
    private HashMap<String,HashMap<String,State>> delta;
    @JsonProperty("start-state") String start_state;
    @JsonProperty("final-states") HashSet<State> final_state;
}
