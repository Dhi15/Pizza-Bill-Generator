public class Pizza {
    private int price;
    private int basePizzaPrice;
    private Boolean veg;
    private int extraCheese = 100;
    private int extraToppings = 150;
    private int bag = 15;
    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isTakeAwayOpted = false;
    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg) this.price = 300;
        else this.price = 400;
        basePizzaPrice = this.price;
    }

    public void addCheese(){
        this.isExtraCheeseAdded = true;
        System.out.println("Extra cheese added!!!");
        this.price += extraCheese;

    }
    public void addExtraToppings(){
        this.isExtraToppingsAdded = true;
        System.out.println("Extra toppings added!!!");
        this.price += extraToppings;
    }

    public void takeAway(){
        this.isTakeAwayOpted = true;
        System.out.println("Take away opted ;)");
        this.price += bag;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza: "+ basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra cheese added: " + extraCheese + "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra toppings added: " + extraToppings + "\n";
        }
        if(isTakeAwayOpted){
            bill += "Take Away: " + bag + "\n";
        }

        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}
