package com.epam.rd.autocode.factory.plot;

public class MarvelPlot implements Plot {
    private final Character[] heroes;
    private final EpicCrisis epicCrisis;
    private final Character villain;

    public MarvelPlot(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        this.heroes = heroes;
        this.epicCrisis = epicCrisis;
        this.villain = villain;
    }

    @Override
    public String toString() {
        StringBuilder heroesStr = new StringBuilder();
        for (Character hero : heroes) {
            heroesStr.append("brave ").append(hero.name()).append(", ");
        }
        heroesStr = new StringBuilder(heroesStr.substring(0, heroesStr.length() - 2));

        return epicCrisis.name() + " threatens the world. But " + heroesStr + " on guard. So, no way that intrigues of " + villain.name() + " overcome the willpower of inflexible heroes";
    }
}
