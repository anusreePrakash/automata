import java.util.HashMap;

public class Transitions {
    HashMap<State, HashMap<String, State>> transitions;

    public Transitions(){
        this.transitions = new HashMap<State, HashMap<String, State>>();
    }
    public void addTransitions(State currentState, String firstAlphabet, State nextState) {
        if(this.transitions.containsKey(currentState)){
            HashMap<String, State> path = this.transitions.get(currentState);
            path.put(firstAlphabet,nextState);
            return;
        }
        HashMap<String,State> path = new HashMap<>();
        path.put(firstAlphabet, nextState);
        this.transitions.put(currentState,path);
    }

    public HashMap<State, HashMap<String, State>> getTransitions() {
        return transitions;
    }
}