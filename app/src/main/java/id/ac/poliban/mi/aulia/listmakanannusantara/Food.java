package id.ac.poliban.mi.aulia.listmakanannusantara;

import androidx.annotation.NonNull;

public class Food {
    private String Image;
    private String foodName;
    private String foodDetail;

    public Food(String image, String foodName, String foodDetail) {
        Image = image;
        this.foodName = foodName;
        this.foodDetail = foodDetail;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDetail() {
        return foodDetail;
    }

    public void setFoodDetail(String foodDetail) {
        this.foodDetail = foodDetail;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getFoodName(), getFoodDetail());
    }
}
