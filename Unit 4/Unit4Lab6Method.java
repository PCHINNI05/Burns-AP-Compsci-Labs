public class Car {
    private String make, model;
    private int efficiency, distance, addgas;
    public int gas, subGas;
    
    public Car (String brand, String type, int mileage, int storage) {
        
        make = brand;
        model = type;
        efficiency = mileage;
        gas = storage;
        
        
    }
    
    public int drive (int jouneylength) {
        distance = jouneylength;
        subGas = distance / efficiency;
        subGas /= 2;
        gas -= subGas;
        
        return gas;
        
    }
    
    public int getGas () {
        return gas;
        
    }
    
    public String addGas (int gasValue) {
        addgas = gasValue;
        gas += addgas;
        String driveReturn = "You have " + gas + " gas left";
        return driveReturn;
        
    }
    
    public void park () {
        System.exit(0);
        
    }
    
    public  String help () {
        String helpList = "Drive - Starts the driving process, prompts you for distance in miles (This consumes gas)\n";
        helpList += "addGas - Starts the refueling process, prompts you for an amount of gas you want to add (All cars have 20 gallons of    tank space)\n";
        helpList += "getGas - Tells you how much gas you have currently\n";
        helpList += "park - Parks your car and ends the program\n\n";
        helpList += "*Tips*\n";
        helpList += " - Make sure to check your gas every once in a while, because if your car runs out of gas mid-journey, you don't have insurance\n";
        helpList += " - Gas is free, so make sure to fill up when you can\n";
        helpList += " - Make sure not to over-fuel";
        
        return helpList;
        
    }
}