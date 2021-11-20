package com.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProbabilityTest {

    @Test
    public void shouldGetEqualOutcomeForHeadAndTail() {
        assertTrue(new Probability(0.5).equals(new Probability(0.5)));
    }

    @Test
    public void shouldGetProbabilityOfNotOccurredOutcome() {
        Probability probabilityOfEvent = new Probability(0.4);
        assertTrue(new Probability(0.6).equals(probabilityOfEvent.notOccuredOutcpme()));
    }

    @Test
    public void shouldGetProbabilityOfTwoIndependentEventsOccurringTogether() {
        Probability probabilityOfEventA = new Probability(0.5);
        Probability probabilityOfEventB = new Probability(0.5);
        Probability actualResult = probabilityOfEventA.intersection(probabilityOfEventB);

        assertTrue(new Probability(0.25).equals(actualResult));
    }

    @Test
    public void shouldGetProbabilityOfEitherTwoIndependentEventsOccurringTogether() {
        Probability probabilityOfEventA = new Probability(0.5);
        Probability probabilityOfEventB = new Probability(0.5);

        assertTrue(new Probability(0.75).equals(probabilityOfEventA.union(probabilityOfEventB)));
    }
}
