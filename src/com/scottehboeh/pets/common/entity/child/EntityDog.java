package com.scottehboeh.pets.common.entity.child;

import com.scottehboeh.pets.common.entity.EntityPet;
import com.scottehboeh.pets.common.entity.enums.EnumDogBreed;
import com.scottehboeh.pets.common.entity.enums.EnumGender;

/**
 * Created by 1503257 on 25/10/2017.
 */
public class EntityDog extends EntityPet {

    /** Breed of the Dog */
    private EnumDogBreed dogBreed;

    /**
     * Default Pet Constructor for Dog
     *
     * @param givenPetName   - Given name for Pet
     * @param givenGender - Given Gender of the Dog Pet
     * @param givenDogBreed - Given Breed for the Dog Pet
     */
    public EntityDog(String givenPetName, EnumGender givenGender, EnumDogBreed givenDogBreed) {

        super(givenPetName,givenGender);
        setSounds("dog_idle.wav","dog_angry.wav");
        this.setCanPetFly(false);
        this.setBreed(givenDogBreed);

    }

    /**
     * Get Breed - Get the Breed of the Dog Instance
     * @return - The Dog Breed (EnumDogBreed)
     */
    public EnumDogBreed getBreed(){
        return this.dogBreed;
    }

    /**
     * Set Breed - Set the Breed of the Dog
     * @param givenBreed - Given Dog Breed
     */
    public void setBreed(EnumDogBreed givenBreed){
        this.dogBreed = givenBreed;
    }

    @Override
    /**
     * On Interaction With Pet - Overridden for Dog Interaction
     */
    public void onInteractionWithPet(){

        /** Random double Chance Variable */
        double d = Math.random();

        /** Chance that Dog is angry at Interaction */
        if(d < 0.20){
            System.out.println("You've made " + this.getPetName() + " the " + this.getBreed() + " dog Angry!");
            this.setAngry(true);
        } else {
            System.out.println("You've made " + this.getPetName() + " the " + this.getBreed() + " dog Happy!");
            this.setAngry(false);
        }

        /** Make Living Sound */
        this.makeLivingSound();

    }

}
