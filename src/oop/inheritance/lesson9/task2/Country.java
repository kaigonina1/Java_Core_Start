package oop.inheritance.lesson9.task2;

public class Country {
    private long population;
    private String language;
    private String continent;

    public Country(long population, String language, String continent) {
        this.population = population;
        this.language = language;
        this.continent = continent;
    }

    public long getPopulation() {
        return population;
    }

    public String getLanguage() {
        return language;
    }

    public String getContinent() {
        return continent;
    }
}
