package com.scottehboeh.pets.common.entity.enums;

/**
 * Created by 1511278 on 25/10/2017.
 */
public enum EnumGender {

    MALE("Male"),
    FEMALE("Female");

    private String toEnglish;

    /**
     * Default Gender Enum Constructor
     * @param givenToEnglish - Given English Term
     */
    EnumGender(String givenToEnglish){
        this.toEnglish = givenToEnglish;
    }

    /**
     * Get Gender in English Format
     * @return - The Gender (String)
     */
    public String getAsEnglish(){
        return this.toEnglish;
    }

}
