package org.example;

public class CasualClothingFactory implements ClothingFactory{
    @Override
    public Clothing createTop() {
        return new CasualTop();
    }
    @Override
    public Clothing createPants() {
        return new CasualPants();
    }
    @Override
    public Clothing createShoes() {
        return new CasualShoes();
    }
}
