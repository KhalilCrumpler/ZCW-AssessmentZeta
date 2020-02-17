package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public String name;
    public Pet[] pets;
    public Integer len = 0;
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {


    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

    return Arrays.asList(this.pets).contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int youngest = 1000;
        int len = this.pets.length;
        for(int i = 0; i < len; i++){
            if(this.pets[i].age < youngest){
                youngest = pets[i].age;
            }
        }
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldest = 0;
        int len = this.pets.length;
        for(int i = 0; i < len; i++){
            if(this.pets[i].age > oldest){
                oldest = pets[i].age;
            }
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
       int len = this.pets.length;
       int sum = 0;
       for(int i = 0; i < len; i++){
           sum += this.pets[i].age;
       }
       return (float) sum/len;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        return this.pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }
}
