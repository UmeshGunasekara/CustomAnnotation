package com.elpisit.customannotationex01.test.t04;

@JsonSerializable
public class Person {
    @JsonElement
    private String firstName;
    @JsonElement
    private String lastName;
    @JsonElement(key = "personAge")
    private String age;
    private String address;
    @Init
    private void initNames(){
        this.firstName = this.firstName.substring(0, 1).toUpperCase() + this.firstName.substring(1);
        this.lastName = this.lastName.substring(0, 1).toUpperCase() + this.lastName.substring(1);
    }

    public Person(String firstName, String lastName, String age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "First Name :"+this.firstName+", Last Name :"+this.lastName+", Age :"+this.age+", Address :"+this.address;
    }
}
