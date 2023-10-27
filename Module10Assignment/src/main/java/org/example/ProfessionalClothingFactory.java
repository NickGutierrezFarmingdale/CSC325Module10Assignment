package org.example;

public class ProfessionalClothingFactory implements ClothingFactory{
    @Override
    public Clothing createTop() {
        return new ProfessionalTop();
    }
    @Override
    public Clothing createPants() {
        return new ProfessionalPants();
    }
    @Override
    public Clothing createShoes() {
        return new ProfessionalShoes();
    }
}
