import java.util.HashMap;
import java.util.HashSet;

public class DFAGenerator {
    private final HashMap<State, HashMap<String, State>> transitions;
    private State initialState;
    private final HashSet<State> finalStates;
    private final HashSet<String> alphabets;
    private final HashSet<State> states;

    public DFAGenerator(HashSet<State> states, HashSet<String> alphabets, HashMap<State, HashMap<String, State>> transitions, State initialState, HashSet<State> finalStates) {
        this.transitions = transitions;
        this.initialState = initialState;
        this.finalStates = finalStates;
        this.alphabets = alphabets;
        this.states = states;
    }

    public boolean isLanguageExists(String string) {
        String[] wordArray = string.split("");
        boolean characterCheck = true;
        State currentState = null;
        for (String i : wordArray) {
            if (!(this.alphabets.contains(i)))
                characterCheck = false;
        }
        if (characterCheck == false)
            return false;
        if (alphabets.isEmpty() || states.isEmpty())
            return false;
        for (String each : wordArray) {
            currentState = transitions.get(initialState).get(each);
            initialState = currentState;
        }
        if (finalStates.contains(currentState)) {
            return true;
        }
        return false;
    }
}

