package pro;
public class Product {

    private String plant_name;
    private String plant_image;
    private String plant_price;
    private String plant_Description;
    private String plant_quantity;
    
    public Product(String plant_name, String plant_image, String plant_price, String plant_quantity,
            String plant_description) {
        this.plant_name = plant_name;
        this.plant_image = plant_image;
        this.plant_price = plant_price;
        this.plant_quantity = plant_quantity;
        this.plant_Description = plant_description;
    
    }
    /*public Product(){
        
    }*/
    public void setPlant_name(String plant_name) {
        this.plant_name = plant_name;
    }
    public void setPlant_image(String plant_image) {
        this.plant_image = plant_image;
    }
    public void setPlant_price(String plant_price) {
        this.plant_price = plant_price;
    }
    public void setPlant_Description(String plant_Description) {
        this.plant_Description = plant_Description;
    }
    public void setPlant_quantity(String plant_quantity) {
        this.plant_quantity = plant_quantity;
    }
    public String getPlant_name() {
        return plant_name;
    }
    public String getPlant_image() {
        return plant_image;
    }
    public String getPlant_price() {
        return plant_price;
    }
    public String getPlant_Description() {
        return plant_Description;
    }
    public String getPlant_quantity() {
        return plant_quantity;
    }
    @Override
    public String toString() {
        return "Product [plant_name=" + plant_name + ", plant_image=" + plant_image + ", plant_price=" + plant_price
                + ", plant_Description=" + plant_Description + ", plant_quantity=" + plant_quantity + "]";
    }

    
}