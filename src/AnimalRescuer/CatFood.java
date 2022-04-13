package AnimalRescuer;

public class CatFood {
//    mâncare de animale: nume, preț, cantitate, disponibilitate în stoc

    private String catFood;
    private double pricePurina;
    private double quantityInKg;
    private boolean stockAvailable;

    private String catFood2;
    private double priceFelix;
    private double quantityInKgFelix;
    private boolean felixStockAvailable;

    private String catFood3;
    private double priceWhiskas;
    private double quantityInKgWhiskas;
    private boolean whiskasStockAvaiable;

    public void setCatFood(String catFood){
        this.catFood = catFood;
    }
    public String getCatFood(){
        return this.catFood;
    }

    public void setPricePurina(double pricePurina){
        this.pricePurina=pricePurina;
    }
    public double getPricePurina(){return this.pricePurina;}

    public void setQuantityInKg(double quantityInKg){
        this.quantityInKg=quantityInKg;
    }
    public double getQuantityInKg(){return this.quantityInKg;}

    public void setStockAvailable(boolean stockAvailable){
        this.stockAvailable=stockAvailable;
    }
    public boolean getStockAvaiable(){return this.stockAvailable;}


    public void setCatFood2(String catFood2){
        this.catFood2 = catFood2;
    }
    public String getCatFood2(){
        return this.catFood2;
    }

    public void setPriceFelix(double priceFelix){
        this.priceFelix=priceFelix;
    }
    public double getPriceFelix(){return this.priceFelix;}

    public void setQuantityInKgFelix(double quantityInKgFelix){
        this.quantityInKgFelix=quantityInKgFelix;
    }
    public double getQuantityInKgFelix(){return this.quantityInKgFelix;}

    public void setFelixStockAvailable(boolean felixStockAvailable){
        this.felixStockAvailable=felixStockAvailable;
    }
    public boolean getFelixStockAvailable(){return this.felixStockAvailable;}


    public void setCatFood3(String catFood3){
        this.catFood3 = catFood3;
    }
    public String getCatFood3(){
        return this.catFood3;
    }

    public void setPriceWhiskas(double priceWhiskas){
        this.priceWhiskas=priceWhiskas;
    }
    public double getPriceWhiskas(){return this.priceWhiskas;}

    public void setQuantityInKgWhiskas(double quantityInKgWhiskas){
        this.quantityInKgWhiskas=quantityInKgWhiskas;
    }
    public double getQuantityInKgWhiskas(){return this.quantityInKgWhiskas;}

    public void setWhiskasStockAvaiable(boolean whiskasStockAvaiable){
        this.whiskasStockAvaiable=whiskasStockAvaiable;
    }
    public boolean getWhiskasStockAvaiable(){return this.whiskasStockAvaiable;}



}
