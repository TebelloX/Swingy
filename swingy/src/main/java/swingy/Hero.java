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

    int hitpointLevel;
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
    public void increaseDefense() {

        int newDefense = 30;
        defenseStrength = newDefense;
    }

    @Override
    public void increaseHitpoint() {

        int newHP = 40;
        hitpointLevel = newHP;
    }
}

class RealHero implements heroDefaults {

    int hitpointLevel;
    int defenseStrength;
    int attackStrength;
    String heroName;

    // public RealHero(String name) {

    //     heroName = name;
    // }

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

        hitpointLevel = newHP;
    }
}

class SupernaturalHero implements heroDefaults {

    int hitpointLevel;
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

        hitpointLevel = newHP;
    }
}