package com.probability;

import java.util.Objects;

public class Probability {

    private double value;
    private final double CERTAIN_EVENT_VALUE= 1;

    public Probability(double value) {
        this.value = value;
    }


    public Probability complement() {
        return new Probability(CERTAIN_EVENT_VALUE - this.value);
    }

    public Probability intersection(Probability probabilityOfThat) {
        return new Probability(this.value * probabilityOfThat.value) ;
    }


    public Probability union(Probability probabilityOfThat) {
        Probability intersectionProbability = this.intersection(probabilityOfThat);
        return new Probability(this.value + probabilityOfThat.value - intersectionProbability.value) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, CERTAIN_EVENT_VALUE);
    }

    @Override
    public String toString() {
        return "Probability{" +
                "value=" + value +
                '}';
    }
}
