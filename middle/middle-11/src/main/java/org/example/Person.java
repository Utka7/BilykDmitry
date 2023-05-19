package org.example;

class Person {

    private int age;
    private String address;

    Person(int age) {
        if (age > 15) {
            throw new IllegalArgumentException("Age can`t be more than 15");
        }
        var randomAgeAddition = Double.valueOf(Math.random() * 10).intValue();
        var random = Double.valueOf(Math.random() * 10).intValue();
        this.age = age + randomAgeAddition;
        if (random > 5) {
            this.address = "Amazing street №" + random;
        }
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

