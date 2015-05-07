package net.epam.domain.uimaps;

import net.epam.infrastructure.sut.controls.interfaces.Button;
import net.epam.infrastructure.sut.controls.interfaces.TextInput;

public class FavoriteUiMap {
    public final Button addFavoriteButton;
    public final TextInput favoriteNameInput;
    public final Button favoriteTable;

    public FavoriteUiMap() {
        addFavoriteButton = CompositionRoot.getButtonClickableByXpath("//div[contains(@class,'text-field-container')]/div[contains(@class,'icon-add')]", "save");
        favoriteNameInput = CompositionRoot.getTextInputClickableByXpath("//div[contains(@class,'text-field-container')]/div/input", "new view name");
        favoriteTable = CompositionRoot.getButtonStaticByXpath("//div[contains(@class,'user-saved-views')]","table");
    }
}
