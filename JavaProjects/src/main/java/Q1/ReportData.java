  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author Jordan
 */

public abstract class ReportData {

    public String code;
    public String description;
    public double price;
    int catagory;
    public int warranty;
    public int stock;
    public String supplier;
    
    //Getters and Setters
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
            this.warranty = warranty;
    }

    public int getCatagory() {
        return catagory;
    }

    public void setCatagory(int catagory) {
            this.catagory = catagory;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
            this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {     
            this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {       
            this.price = price;
    }
}
