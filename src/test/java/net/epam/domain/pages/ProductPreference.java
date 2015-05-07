package net.epam.domain.pages;

/**
 * Created by Yevhen_Veklyn on 2/26/2015.
 */
public class ProductPreference {
    public static ProductPreference get() {
        return new ProductPreference();
    }

    private ProductPreference() {

    }

    public ProductPreference expandProductPreferences() {
        //todo
        return this;
    }

    public ProductPreference enterAttributeValue(String value) {
        //todo
        return this;
    }

    public ProductPreference save() {
        //todo
        return this;
    }

    public void closeWithoutSave() {
        //todo
    }
}

