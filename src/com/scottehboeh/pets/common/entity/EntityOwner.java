package com.scottehboeh.pets.common.entity;

import com.scottehboeh.pets.common.entity.enums.EnumGender;

/**
 * Created by 1511278 on 25/10/2017.
 */
public class EntityOwner {

    private String ownerName; /** Full Name of Owner */
    private String ownerPhoneNumber; /** Owner Phone Number */
    private EnumGender ownerGender; /** Owner Gender */

    /**
     * Default Owner Constructor
     * @param givenFullName - Given Full Name of Owner
     * @param givenGender - Given Gender of Owner
     */
    public EntityOwner(String givenFullName, EnumGender givenGender){
        this.ownerName = givenFullName;
        this.ownerGender = givenGender;
    }

    /**
     * Get Owner Gender - Get the Gender of the Owner
     * @return - The Given Gender (EnumGender)
     */
    public EnumGender getOwnerGender(){
        return this.ownerGender;
    }

    /**
     * Get Owner Name - Get the Name of the Pet Owner
     * @return - The Owner Name (String)
     */
    public String getOwnerName(){
        return this.ownerName;
    }

}
