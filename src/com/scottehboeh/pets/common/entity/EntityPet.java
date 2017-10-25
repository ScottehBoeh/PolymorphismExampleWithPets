package com.scottehboeh.pets.common.entity;

import com.scottehboeh.pets.common.entity.enums.EnumGender;

import java.util.UUID;

/**
 * Created by 1503257 on 25/10/2017.
 */
public class EntityPet {

    private UUID petUUID; /** Unique Pet Identifier */
    private String petName; /** Pet Name */
    private boolean canPetFly; /** Pet Fly Status */
    private String petIdleSound; /** Idle Pet Sound */
    private String petAngrySound; /** Angry Pet Sound */
    private boolean isPetAngry; /** Angry Status */
    private EntityOwner petOwner; /** Pet Owner Object */
    private EnumGender petGender; /** Gender of Pet */

    /**
     * Default Pet Constructor
     * @param givenPetName - Given name for Pet
     */
    public EntityPet(String givenPetName, EnumGender givenGender){

        /** Give Pet random UUID */
        this.petUUID = UUID.randomUUID();

        /** Set Pet Attributes with given Parameters */
        this.petName = givenPetName;
        this.isPetAngry = false;
        this.petGender = givenGender;

        /** Tell User that Pet was Created */
        System.out.print(givenPetName + " has come to life");

    }

    /**
     * Get Pet UUID - Get the Unique Identifier of the Pet
     * @return - The Pets Unique Identifier (UUID)
     */
    public UUID getPetUUID(){
        return this.petUUID;
    }

    /**
     * Get Pet Name - Get the Name of the Pet
     * @return - The Name of the Pet (String)
     */
    public String getPetName(){
        return this.petName;
    }

    /**
     * Get Living Sound - Get the Living Sound of the Dog
     * @return
     */
    public String getLivingSound(){
        if(this.isAngry()){
            return this.petAngrySound;
        } else {
            return this.petIdleSound;
        }
    }

    /**
     * Can Pet Fly - Does Pet have Flight Capability
     * @return - True/False (Can/Can't Fly)
     */
    public boolean canPetFly(){
        return this.canPetFly;
    }

    /**
     * Is Angry - is Pet Angry or Not
     * @return - Angry Status True/False (Angry/Not Angry)
     */
    public boolean isAngry(){
        return this.isPetAngry;
    }

    /**
     * Set Pet Name - Set the Name of the Pet
     * @param givenName - Given Name (String)
     */
    public void setPetName(String givenName){
        this.petName = givenName;
    }

    /**
     * Set Can Fly - Set if the Pet can Fly or Not
     * @param givenFly - Given Fly Status (true/false)
     */
    public void setCanPetFly(boolean givenFly){
        this.canPetFly = givenFly;
    }

    /**
     * Set Sounds - Set the Sounds of the Pet
     * @param givenIdleSound - Natural Sound made by Pet
     * @param givenAngrySound - Angry Sound made by Pet
     */
    public void setSounds(String givenIdleSound, String givenAngrySound){

        this.petIdleSound = givenIdleSound; /** Idle Sound */
        this.petAngrySound = givenAngrySound; /** Angry Sound */

    }

    /**
     * Set Owner - Set the Owner of the Pet
     * @param givenOwner - Given Owner (EntityOwner)
     */
    public void setOwner(EntityOwner givenOwner){
        this.petOwner = givenOwner;
    }

    /**
     * Set Gender - Set the Gender of the Pet
     * @param givenGender - Given Gender (EnumGender)
     */
    public void setGender(EnumGender givenGender){
        this.petGender = givenGender;
    }

    /**
     * Make Sound - Make a Sound using given Pet Sounds
     */
    public void makeLivingSound(){

        /** Inform the user on which sound should play */
        System.out.println("Should play " + this.getLivingSound() + " sound!");

    }

    /**
     * Called on Interaction with the Pet Instance
     */
    public void onInteractionWithPet(){

        /** Inform the User that the Pet does nothing */
        System.out.println("The Pet does nothing...");

    }

    /**
     * Set Angry - Used to set the Pet as Happy/Angry
     * @param givenAngry - Given Anger True/False (Angry/Not Angry)
     */
    public void setAngry(boolean givenAngry){
        this.isPetAngry = givenAngry;
    }

    @Override
    /**
     * To String - Overrided To-String Method (Now returns Pet Name)
     */
    public String toString(){
        return this.getPetName();
    }

    /**
     * Get the Owner of the Pet
     * @return - Given Pet Owner (EntityOwner)
     */
    public EntityOwner getPetOwner(){
        return this.petOwner;
    }

    /**
     * Get Gender - Get the Gender of the Pet
     * @return - Given Gender (EnumGender)
     */
    public EnumGender getPetGender(){
        return this.petGender;
    }

}
