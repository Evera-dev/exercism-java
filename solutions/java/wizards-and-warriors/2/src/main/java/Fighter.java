class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// Warrior class
class Warrior extends Fighter{
    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
    
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

// Wizard class
class Wizard extends Fighter{
    boolean spellPrepared = false;

    public void prepareSpell(){
        spellPrepared = true;
    }
    
    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }
    
    @Override
    public int getDamagePoints(Fighter fighter) {
        return spellPrepared ? 12 : 3;
    }
    
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}