package org.example;

public class PartyClothingFactory implements ClothingFactory{
    @Override
    public Clothing createTop() {
        return new PartyTop();
    }
    @Override
    public Clothing createPants() {
        return new PartyPants();
    }
    @Override
    public Clothing createShoes() {
        return new PartyShoes();
    }
}
