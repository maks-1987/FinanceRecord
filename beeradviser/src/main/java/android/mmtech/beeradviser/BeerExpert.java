package android.mmtech.beeradviser;

import java.util.ArrayList;
import java.util.List;

class BeerExpert {
        List<String> getBrands(String color) {
            List<String> brands = new ArrayList<>();
            if (color.equals("amber")) {
                brands.add("Jack Amber");
                brands.add("Red Moose");
            } else if (color.equals("brown")) {
                brands.add("Хорош бухать");
                brands.add("No more!");
            }
            else {
                brands.add("No more!");
            }
            return brands;
        }
}
