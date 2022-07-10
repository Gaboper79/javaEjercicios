package org.example;

import lombok.Data;

import java.util.Objects;

@Data
public class Persona {
    private String name;
    private String apellido;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(name, persona.name) && Objects.equals(apellido, persona.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, apellido);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

}
