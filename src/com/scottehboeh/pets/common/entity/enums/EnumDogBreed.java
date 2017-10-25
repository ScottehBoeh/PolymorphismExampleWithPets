package com.scottehboeh.pets.common.entity.enums;

import java.util.UUID;

/**
 * Created by 1503257 on 25/10/2017.
 */
public enum EnumDogBreed {

    RETRIEVER_LABRADOR("Labrador Retriever"),
    GERMAN_SHEPHERD("German Shepherd"),
    RETRIEVER_GOLDEN("Golden Retriever"),
    BULLDOG("Bulldog"),
    BEAGLE("Beagle"),
    FRENCH_BULLDOG("French Bulldog"),
    POODLE("Poodle"),
    ROTTWEILER("Rottweiler"),
    YORKSHIRE_TERRIER("Yorkshire Terrier"),
    BOXER("Boxer");

    private String breedAsEnglish; /** Breed as Plain English */

    /**
     * Default Dog Breed Constructor
     * @param givenAsEnglish - English Version of Breed Name
     */
    EnumDogBreed(String givenAsEnglish){
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
