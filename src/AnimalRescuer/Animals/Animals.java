package AnimalRescuer.Animals;

public abstract class Animals {
    private String color;
    private double weigth;
    private int ageInMonths;
    private String race;
    private String name;
    private String favouriteFood;
    private boolean isMale;
    private short healthCondition;
    private short hungryFeeling;
    private short moodCondition;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeigth() {
        return weigth;
    }

    public abstract void speak();

    public abstract void eat();

    public abstract void play();

    public abstract void sleep();

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public short getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(short healthCondition) {
        this.healthCondition = healthCondition;
    }

    public short getHungryFeeling() {
        return hungryFeeling;
    }

    public void setHungryFeeling(short hungryFeeling) {
        this.hungryFeeling = hungryFeeling;
    }

    public short getMoodCondition() {
        return moodCondition;
    }

    public void setMoodCondition(short moodCondition) {
        this.moodCondition = moodCondition;
    }


}
