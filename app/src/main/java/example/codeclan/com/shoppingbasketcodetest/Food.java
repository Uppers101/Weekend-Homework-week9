package example.codeclan.com.shoppingbasketcodetest;

import example.codeclan.com.shoppingbasketcodetest.Interfaces.Itemable;
import example.codeclan.com.shoppingbasketcodetest.Interfaces.Objectable;

/**
 * Created by user on 05/05/2017.
 */

public class Food implements Itemable, Objectable {
    private String name;
    private int quantity;
    private Double price;
    private Boolean bogof;

    public Food(String name, int quantity, Double price, Boolean bogof){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.bogof = bogof;
    }

    public String getName(){
        return this.name;
    }

    public String setName(String newName){
        return this.name = newName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int setQuantity(int newQuantity) {
        return this.quantity = newQuantity;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getBogof(){
        return this.bogof;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
