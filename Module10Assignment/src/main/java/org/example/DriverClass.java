package org.example;

import org.w3c.dom.ls.LSOutput;

public class DriverClass {
    public static void main(String[] args) {
        //Create the clothing factories
        ClothingFactory casualFactory = new CasualClothingFactory();
        ClothingFactory professionalFactory = new ProfessionalClothingFactory();
        ClothingFactory partyFactory = new PartyClothingFactory();

        //Create a casual top
        Clothing casualTop = casualFactory.createTop();

        //Create a pair of casual pants
        Clothing casualPants = casualFactory.createPants();

        //Create a pair of casual shoes
        Clothing casualShoes = casualFactory.createShoes();

        //Create a professional top
        Clothing professionalTop = casualFactory.createTop();

        //Create a pair of professional pants
        Clothing professionalPants = professionalFactory.createPants();

        //Create a pair of professional shoes
        Clothing professionalShoes = professionalFactory.createShoes();

        //Create a party top
        Clothing partyTop = partyFactory.createTop();

        //Create a pair of party pants
        Clothing partyPants = partyFactory.createPants();

        //Create a pair of party shoes
        Clothing partyShoes = partyFactory.createShoes();

        System.out.printf("The casual factory made: %s, %s, and %s\n", casualTop.getType(), casualPants.getType(), casualShoes.getType());
        System.out.printf("The party factory made: %s, %s, and %s\n", partyTop.getType(), partyPants.getType(), partyShoes.getType());
        System.out.printf("The professional factory made: %s, %s, and %s\n", professionalTop.getType(), professionalPants.getType(), professionalShoes.getType());

    }
}
