package com.scottehboeh.pets.common.entity.enums;

/**
 * Created by 1503257 on 25/10/2017.
 */
public enum EnumBirdBreed {

    GULL("Gull"),
    PIGEON("Pigeon"),
    FINCH("Finch"),
    CUCKOOS("Cuckoos"),
    PARROT("Parrot"),
    TERN("Tern"),
    GREBE("Grebe"),
    EAGLE("Eagle");

    private String breedAsEnglish; /** Breed as Plain English */

    /**
     * Default Bird Breed Constructor
     * @param givenAsEnglish - English Version of Breed Name
     */
    EnumBirdBreed(String givenAsEnglish){
        this.breedAsEnglish = givenAsEnglish;
    }

    /**
     * As English - Get Breed as Plain English
     * @return - Breed Name (String)
     */
    public String asEnglish(){
        return this.breedAsEnglish;
    }

}
