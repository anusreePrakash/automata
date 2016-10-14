import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DFAGenerator {
    private final HashMap<State, HashMap<String, State>> transitions;
    private State initialState;
    private final HashSet<State> finalStates;
    private final ArrayList<String> alphabets;
    private final ArrayList<State> states;

    public DFAGenerator(ArrayList<State> states, ArrayList<String> alphabets, HashMap<State, HashMap<String, State>> transitions, State initialState, HashSet<State> finalStates) {
        this.transitions = transitions;
        this.initialState = initialState;
        this.finalStates = finalStates;
        this.alphabets = alphabets;
        this.states = states;
    }

    public boolean isMachineExists(String string) {
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
            System.out.println(each+"each");
            currentState = transitions.get(initialState).get(each);
            System.out.println(currentState.getState() + "   curr");
//            System.out.println(transitions.get(initialState) + "=)))))))))))))))))");

            initialState = currentState;
        }
        if (finalStates.contains(currentState)) {
            return true;
        }
        return false;
    }
}


//"transition": {"q1":{"0":"q2","1":"q1"}},

//if(tuple.transition[initialState].has(character) ) {
//            initialState = tuple.transition[initialState][character];
//            return true;
//        }
//        return false;
//    }