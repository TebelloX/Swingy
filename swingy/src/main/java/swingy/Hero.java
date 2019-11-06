package swingy;

interface heroDefaults {
    
    public int level = 0;
    public int experience = 0;
    public int attack = 0;
    public int defense = 0;
    public int hitPoints = 0;
    
    void increaseAttack(int a); 
    void increaseDefense(int a); 
    void increaseHitpoints(int a); 
}

class disneyHero implements heroDefaults {

    int hitpointLevel;
    int defenseStrength;
    int attackStrength;
    String heroName;

    public disneyHero(String name) {
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
    public void increaseHitpoints(int newHP) { 
          
        hitpointLevel = newHP;
    }
}

class realHero implements heroDefaults {

    int hitpointLevel;
    int defenseStrength;
    int attackStrength;
    String heroName;

    public realHero(String name) {
        
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
    public void increaseHitpoints(int newHP) {

        hitpointLevel = newHP;
    }
}

class supernaturalHero implements heroDefaults {

    int hitpointLevel;
    int defenseStrength;
    int attackStrength;
    String heroName;

    public supernaturalHero(String name) {
        
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
    public void increaseHitpoints(int newHP) {

        hitpointLevel = newHP;
    }
}