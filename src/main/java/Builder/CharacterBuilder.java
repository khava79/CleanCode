package Builder;

public class CharacterBuilder {
    private Character character;

    public CharacterBuilder() {
        character = new Character();
    }

    public CharacterBuilder setHealth(int health) {
        character.setHealth(health);
        return this;
    }

    public CharacterBuilder setDamage(int damage) {
        character.setDamage(damage);
        return this;
    }

    public CharacterBuilder setArmor(int armor) {
        character.setArmor(armor);
        return this;
    }

    public CharacterBuilder setMagic(int magic) {
        character.setMagic(magic);
        return this;
    }

    public Character build(){
        return character;
    }
}
