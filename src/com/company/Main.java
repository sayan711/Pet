package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pet pet = new Pet(Pet.typeOfAnimal.CAT);
        pet.setName("Whiskers");
        pet.setDateOfBirth(LocalDate.of(2015,8,23));
        pet.setNeedsToBeRestrained(true);
        System.out.println(pet.getAge());
        System.out.println(pet.needsRestraint());
    }
}
