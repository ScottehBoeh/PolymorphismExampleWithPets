package com.scottehboeh.pets.common.entity.child;

import com.scottehboeh.pets.common.entity.EntityPet;
import com.scottehboeh.pets.common.entity.enums.EnumBirdBreed;
import com.scottehboeh.pets.common.entity.enums.EnumBirdBreed;
import com.scottehboeh.pets.common.entity.enums.EnumGender;

/**
 * Created by 1503257 on 25/10/2017.
 */
public class EntityBird extends EntityPet {

    /** Breed of the Bird */
    private EnumBirdBreed birdBreed;

    /**
     * Default Pet Constructor for Bird
     *
     * @param givenPetName   - Given name for Pet
     * @param givenGender - Given Gender for the Bird Pet
     * @param givenBirdBreed - Given Breed for the Bird Pet
     */
    public EntityBird(String givenPetName, EnumGender givenGender, EnumBirdBreed givenBirdBreed) {

        super(givenPetName,givenGender);
        setSounds("bird_idle.wav","bird_angry.wav");
        this.setCanPetFly(false);
        this.setBreed(givenBirdBreed);

    }

    /**
     * Get Breed - Get the Breed of the Bird Instance
     * @return - The Bird Breed (EnumBirdBreed)
     */
    public EnumBirdBreed getBreed(){
        return this.birdBreed;
    }

    /**
     * Set Breed - Set the Breed of the Bird
     * @param givenBreed - Given Bird Breed
     */
    public void setBreed(EnumBirdBreed givenBreed){
        this.birdBreed = givenBreed;
    }

    @Override
    /**
     * On Interaction With Pet - Overridden for Bird Interaction
     */
    public void onInteractionWithPet(){

        System.out.println("The bird flaps its wings");

        /** Make Living Sound */
        this.makeLivingSound();

    }

}
