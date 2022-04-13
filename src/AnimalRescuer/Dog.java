package AnimalRescuer;

public class Dog {
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


    public void eat() {
        System.out.println("Eating dog food");
    }

    public void sleep() {
        System.out.println("zzzZZZ");
    }

    public void run() {
        System.out.println("Runing ");
    }

    public void play() {
        System.out.println("playing fetch");
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public String getcolor() {
        return this.color;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getWeigth() {
        return this.weigth;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public int getAgeInMonths() {
        return this.ageInMonths;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return this.race;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return this.favouriteFood;
    }

    public void setHealthCondition(short healthCondition) {
        this.healthCondition = healthCondition;
    }

    public short getHealthCondition() {
        return this.healthCondition;
    }

    public void setHungryFeeling(short hungryFeeling) {
        this.hungryFeeling = hungryFeeling;
    }

    public short getHungryFeeling() {
        return this.hungryFeeling;
    }

    public void setMoodCondition(short moodCondition) {
        this.moodCondition = moodCondition;
    }

    public short getMoodCondition() {
        return this.moodCondition;
    }

}