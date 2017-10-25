package com.scottehboeh.pets;

import com.scottehboeh.pets.common.entity.EntityOwner;
import com.scottehboeh.pets.common.entity.EntityPet;
import com.scottehboeh.pets.common.entity.child.EntityBird;
import com.scottehboeh.pets.common.entity.child.EntityDog;
import com.scottehboeh.pets.common.entity.enums.EnumBirdBreed;
import com.scottehboeh.pets.common.entity.enums.EnumDogBreed;
import com.scottehboeh.pets.common.entity.enums.EnumGender;

import java.util.ArrayList;

/**
 * Created by 1503257 on 25/10/2017.
 */
public class Main {

    /**
     * Main Class - Initial Method
     * @param args - Given Launch Arguments
     */
    public static void main(String[] args){

        int dogCount = 0;
        int birdCount = 0;

        /** List of EntityPet's */
        ArrayList<EntityPet> pets = new ArrayList<>();

        /** Create Dog 1 Owner and Object */
        EntityOwner dog1Owner = new EntityOwner("Rott Scobertson",EnumGender.MALE);
        EntityDog dog1 = new EntityDog("Jimmy",EnumGender.MALE,EnumDogBreed.BEAGLE);
        dog1.setOwner(dog1Owner); /** Set Owner of Dog 1 */
        pets.add(dog1); /** Add Dog 1 to Pets Array List */

        EntityOwner bird1Owner = new EntityOwner("Alec Blyth",EnumGender.MALE);
        EntityBird bird1 = new EntityBird("William",EnumGender.MALE,EnumBirdBreed.EAGLE);
        bird1.setOwner(bird1Owner); /** Set Owner of Bird 1 */
        pets.add(bird1); /** Add Bird 1 to Pets Array List */

        /** Loop through each Pet in Pet List */
        for(int i = 0; i < pets.size(); i++){

            /** If Pet is a Dog */
            if(pets.get(i) instanceof EntityDog){
                dogCount++;
                /** If Pet is a Bird */
            } else if(pets.get(i) instanceof EntityBird){
                    birdCount++;
            }

        }

        /** Inform the User on how many Pet Entities there are */
        System.out.println("There are " + dogCount + " dog(s)!");
        System.out.println("There are " + birdCount + " bird(s)!");

        while(true);

    }

}
