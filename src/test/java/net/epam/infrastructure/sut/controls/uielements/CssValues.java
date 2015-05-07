package net.epam.infrastructure.sut.controls.uielements;

import net.epam.infrastructure.common.StringUtilities;
import net.epam.infrastructure.sut.controls.interfaces.ICssValues;

public final class CssValues implements ICssValues {

    private final String fontFamily;
    private final String fontSize;
    private final String fontWeight;
    private final String color;
    private final String backgroundColor;


    private final String backgroundImage;

    public String getFontFamily() {
        return fontFamily;
    }

    public String getFontSize() {
        return fontSize;
    }

    public String getFontWeight() {
        return fontWeight;
    }

    public String getColor() {
        return color;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    @Override
    public String toString() {
        return "CssValues{" +
                "fontFamily='" + fontFamily + StringUtilities.NEW_LINE +
                ", fontSize='" + fontSize + StringUtilities.NEW_LINE +
                ", fontWeight='" + fontWeight + StringUtilities.NEW_LINE +
                ", color='" + color + StringUtilities.NEW_LINE +
                ", backgroundColor='" + backgroundColor + StringUtilities.NEW_LINE +
                ", backgroundImage='" + backgroundImage + StringUtilities.NEW_LINE +
                '}';
    }


    private CssValues(CssValuesBuilder builder) {
        this.fontFamily = builder.fontFamily;
        this.fontSize = builder.fontSize;
        this.fontWeight = builder.fontWeight;
        this.color = builder.color;
        this.backgroundColor = builder.backgroundColor;
        this.backgroundImage = builder.backgroundImage;
    }

    public static final class CssValuesBuilder {
        private String fontFamily;
        private String fontSize;
        private String fontWeight;
        private String color;
        private String backgroundColor;
        private String backgroundImage = "";

        public CssValuesBuilder() {
        }

        public CssValuesBuilder setFontFamily(String fontFamily) {
            this.fontFamily = fontFamily;
            return this;
        }

        public CssValuesBuilder setFontSize(String fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        public CssValuesBuilder setFontWeight(String fontWeight) {
            this.fontWeight = fontWeight;
            return this;
        }

        public CssValuesBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CssValuesBuilder setBackgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public CssValuesBuilder setBackgroundImage(String backgroundImage) {
            this.backgroundImage = backgroundImage;
            return this;
        }

        public ICssValues build() {
            return new CssValues(this);
        }
    }

}
