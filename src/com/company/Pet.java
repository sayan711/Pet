package com.company;

import java.time.LocalDate;

public class Pet {
    String breed;
    String name;
    boolean needsToBeRestrained;
    LocalDate dateOfBirth;
    typeOfAnimal type;

    enum typeOfAnimal {
        DOG,
        CAT,
        CHICKEN,
    }

    public Pet(String breed, String name, LocalDate dateOfBirth, typeOfAnimal type) {
        this.breed = breed;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.type = type;
    }

    public Pet(typeOfAnimal type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNeedsToBeRestrained() {
        return needsToBeRestrained;
    }

    public void setNeedsToBeRestrained(boolean needsToBeRestrained) {
        this.needsToBeRestrained = needsToBeRestrained;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public typeOfAnimal getType() {
        return type;
    }

    public void setType(typeOfAnimal type) {
        this.type = type;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();


        if (now.getMonthValue() >= dateOfBirth.getMonthValue())
        {
            return now.getYear() - dateOfBirth.getYear();
        }
        else
        {
            return now.getYear() - dateOfBirth.getYear() - 1;
        }
    }

        public boolean needsRestraint () {
            if (getAge() >= 13){
                return false;
        }
            return true;

    }
}