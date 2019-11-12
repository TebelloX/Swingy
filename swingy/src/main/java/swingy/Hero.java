package swingy;

interface HeroDefaults {

    public int level = 0;
    public int experience = 0;
    public int attack = 0;
    public int defense = 0;
    public int hitPoints = 0;

    void increaseAttack(int amount);
    void increaseDefense(int amount);
    void increaseHitpoint(int amount);
}

class DisneyHero implements HeroDefaults {

    int hitPointLevel;
    int defenseStrength;
    int attackStrength;
    String heroName;

    public DisneyHero(String name) {
        heroName = name;
        System.out.println(heroName);
    }

    @Override
    public void increaseAttack(int newAttack) {

        attackStrength = newAttack;
    }

    @Override
    public void increaseDefense(int newDefense) {

        defenseStrength = newDefense;
    }

    @Override
    public void increaseHitpoint(int newHP) {

        hitPointLevel = newHP;
    }
}

class RealHero implements HeroDefaults {

    int hitPointLevel;
    int defenseStrength;
    int attackStrength;
    String heroName;

    public RealHero(String name) {

        heroName = name;
    }

    @Override
    public void increaseAttack(int newAttack) {

        attackStrength = newAttack;
    }

    @Override
    public void increaseDefense(int newDefense) {

        defenseStrength = newDefense;
    }

    @Override
    public void increaseHitpoint(int newHP) {
        hitPointLevel = newHP;
    }
}

class SupernaturalHero implements HeroDefaults {

    int hitPointLevel;
    int defenseStrength;
    int attackStrength;
    String heroName;

    public SupernaturalHero(String name) {

        heroName = name;
    }

    @Override
    public void increaseAttack(int newAttack) {

        attackStrength = newAttack;
    }

    @Override
    public void increaseDefense(int newDefense) {

        defenseStrength = newDefense;
    }

    @Override
    public void increaseHitpoint(int newHP) {

        hitPointLevel = newHP;
    }
}