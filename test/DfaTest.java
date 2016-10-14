import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class DfaTest {
    @Test
    public void should_return_true_if_string_contains_same_alphabets(){
        State q1 = new State("q1");
        State q2 = new State("q2");
        State q3 = new State("q3");
        State q4 = new State("q4");
        ArrayList<State> states;
        states = new ArrayList<State>(Arrays.asList(q1,q2));
        String firstAlphabet = "0";
        String secondAlphabet = "1";
        ArrayList<String> alphabets;
        alphabets = new ArrayList<String>(Arrays.asList("0","1"));
        Transitions transitionTable = new Transitions();
        transitionTable.addTransitions(q1, firstAlphabet, q1);
        transitionTable.addTransitions(q1, secondAlphabet, q2);
        HashMap<State, HashMap<String, State>> transitions = transitionTable.getTransitions();
        HashSet<State> finalStates = new HashSet<>();
        finalStates.add(q1);
        finalStates.add(q2);
        DFAGenerator dfaGenerator = new DFAGenerator(states, alphabets, transitions, q1, finalStates);
        boolean isMachineExists = dfaGenerator.isMachineExists("01");
        assertTrue(isMachineExists);
    }

    @Test
    public void odd_number_of_zero(){
        State q1 = new State("q1");
        System.out.println(q1.getState()+"    "+q1);
        State q2 = new State("q2");
        System.out.println(q2.getState()+"     "+q2);
        ArrayList<State> states;
        states = new ArrayList<State>(Arrays.asList(q1,q2));
        String firstAlphabet = "0";
        String secondAlphabet = "1";
        ArrayList<String> alphabets;
        alphabets = new ArrayList<String>(Arrays.asList("0","1"));
        Transitions transitionTable = new Transitions();
        transitionTable.addTransitions(q1, firstAlphabet, q2);
        transitionTable.addTransitions(q1, secondAlphabet, q1);
        transitionTable.addTransitions(q2, firstAlphabet, q1);
        transitionTable.addTransitions(q2, secondAlphabet, q2);
        HashMap<State, HashMap<String, State>> transitions = transitionTable.getTransitions();
        HashSet<State> finalStates = new HashSet<>();
        finalStates.add(q2);
        DFAGenerator dfaGenerator = new DFAGenerator(states, alphabets, transitions, q1, finalStates);
        boolean isMachineExists = dfaGenerator.isMachineExists("0");
        dfaGenerator.isMachineExists("0");
        boolean isMachineExists2 = dfaGenerator.isMachineExists("010");
        assertTrue(isMachineExists);
        assertFalse(dfaGenerator.isMachineExists("010"));
    }

}
