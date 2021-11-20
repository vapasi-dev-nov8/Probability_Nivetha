package com.probability;

import java.util.Objects;

public class Probability {

    private double value;
    private final double chancesOfOutcome= 1;

    public Probability(double value) {
        this.value = value;
    }

    /*
    * To find the probability of an event not occurring  P(A`) = 1-P(A)
    * */
    public Probability notOccuredOutcpme() {
        return new Probability(chancesOfOutcome - this.value);
    }
    /*
     * To find the probability of two events occurring together.
     *  Formula for the probability of A and B (independent events): p(A and B) = p(A) * p(B).
     * */
    public Probability intersection(Probability probabilityOfThat) {
        return new Probability(this.value * probabilityOfThat.value) ;
    }

    /*
     * To find 4. the probability of either two events occurring.
     * Formula for the probability of A or B (independent events):p(A or B)=p(A) + p(B) – p(A and B).
     * */
    public Probability union(Probability probabilityOfThat) {
        return new Probability(this.value + probabilityOfThat.value - (this.intersection(probabilityOfThat).value)) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return this.value  == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, chancesOfOutcome);
    }

    @Override
    public String toString() {
        return "Probability{" +
                "value=" + value +
                '}';
    }
}
