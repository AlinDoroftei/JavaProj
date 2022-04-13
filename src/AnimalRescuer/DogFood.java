package AnimalRescuer;

public class DogFood {

    //    mâncare de animale: nume, preț, cantitate, disponibilitate în stoc

    private String dogFood;
    private double priceRoyalCanin;
    private double quantityInKg;
    private boolean stockAvailable;

    private String dogFood2;
    private double priceBonaCibo;
    private double quantityInKgBonaCibo;
    private boolean bonaCiboStockAvailable;

    private String dogFood3;
    private double priceFriskies;
    private double quantityInKgFriskies;
    private boolean friskiesStockAvaiable;

    public void setDogFood(String dogFood){
        this.dogFood = dogFood;
    }
    public String getDogFood(){
        return this.dogFood;
    }

    public void setPriceRoyalCanin(double royalCanin){
        this.priceRoyalCanin=priceRoyalCanin;
    }
    public double getPriceRoyalCanin(){return this.priceRoyalCanin;}

    public void setQuantityInKg(double quantityInKg){
        this.quantityInKg=quantityInKg;
    }
    public double getQuantityInKg(){return this.quantityInKg;}

    public void setStockAvailable(boolean stockAvailable){
        this.stockAvailable=stockAvailable;
    }
    public boolean getStockAvaiable(){return this.stockAvailable;}


    public void setDogFood2(String dogFood2){
        this.dogFood2 = dogFood2;
    }
    public String getDogFood2(){
        return this.dogFood2;
    }

    public void setPriceBonaCibo(double bonaCibo){
        this.priceBonaCibo=priceBonaCibo;
    }
    public double getPriceBonaCibo(){return this.priceBonaCibo;}

    public void setQuantityInKgBonaCibo(double quantityInKgBonaCibo){
        this.quantityInKgBonaCibo=quantityInKgBonaCibo;
    }
    public double getQuantityInKgBonaCibo(){return this.quantityInKgBonaCibo;}

    public void setBonaCiboStockAvailable(boolean bonaCiboStockAvailable){
        this.bonaCiboStockAvailable=bonaCiboStockAvailable;
    }
    public boolean getBonaCiboStockAvailable(){return this.bonaCiboStockAvailable;}


    public void setDogFood3(String dogFood3){
        this.dogFood3 = dogFood3;
    }
    public String getDogFood3(){
        return this.dogFood3;
    }

    public void setPriceFriskies(double priceFriskies){
        this.priceFriskies=priceFriskies;
    }
    public double getPriceFriskies(){return this.priceFriskies;}

    public void setQuantityInKgFriskies(double quantityInKgFriskies){
        this.quantityInKgFriskies=quantityInKgFriskies;
    }
    public double getQuantityInKgFriskies(){return this.quantityInKgFriskies;}

    public void setFriskiesStockAvaiable(boolean friskiesStockAvaiable){
        this.friskiesStockAvaiable=friskiesStockAvaiable;
    }
    public boolean getFriskiesStockAvailable(){return this.friskiesStockAvaiable;}
}
