package edu.julioestrela.swingGuitaristApi.model;

// the compiler auto-generates constructor, getters, equals, hashcode and toString;
// these can be customized and will have preference, just like default constructor
public record Guitarist(String name, String lastName) {

}

//import java.util.Objects;
//
//public class Guitarist {
//    private String name;
//    private String lastName;
//
//    public Guitarist(String name, String lastName) {
//        this.name = name;
//        this.lastName = lastName;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Guitarist guitarist)) return false;
//        return Objects.equals(getName(), guitarist.getName()) && Objects.equals(getLastName(), guitarist.getLastName());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getName(), getLastName());
//    }
//
//    @Override
//    public String toString() {
//        return "Guitarist{" +
//                "name='" + name + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }
//}