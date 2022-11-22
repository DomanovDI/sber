package model;

public class City {
    private int number;
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    public City(int number, String name, String region, String district, int population, String foundation) {
        this.number = number;
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation=" + foundation +
                '}';
    }
}
