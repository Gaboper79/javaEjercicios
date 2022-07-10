package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> paises = new ArrayList<String>();
        paises.add("Argentina");
        paises.add("uruguay");
        paises.add("Mexico");
        paises.add("Peru");

        Optional<String> pais = paises.stream().filter(p -> p.startsWith("uru")).findFirst();
        pais.ifPresent(System.out::println);
    }

    public static Optional<Double> getPromedio(Double... scores) {
        if (scores.length == 0) return Optional.empty();
        double sum = 0;
        for (Double score : scores) sum += score;
        return Optional.of(sum / scores.length);
    }
}
