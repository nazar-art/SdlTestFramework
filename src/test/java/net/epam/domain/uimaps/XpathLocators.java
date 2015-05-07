package net.epam.domain.uimaps;

public final class XpathLocators {

    public static String dataGridTableRoot = "//div[@class='wtHolder ht_master']//table[@class='htCore']";
    public static String dataGridPaginationRoot = "//div[@class='pagination-container clearfix']";

    // Column filter locators
    public static String columnsFiltersListRoot = "//div[@class='columns-manager-layout js-open-area opened']";

    public static final String COL_FILTER_ICON_DOWN_XPATH = "/..//span[contains(@class, 'icon-arrow-down')]";

    public static final String COL_FILTER_ICON_RIGHT_XPATH = "/..//span[contains(@class, 'icon-arrow-right')]";

    public static final String COL_FILTER_EDIT_ICON_BUTTON_XPATH = "../span[@class='icon icon-settings js-edit']";
    public static final String COL_FILTER_DEL_FILTER_BUTTON = "//span[@class='icon icon-settings js-edit']";
    public static final String COL_FILTER_FILTER_INPUT = "//input[@placeholder='Enter Name Here']";

    public static final String HEADER_FAVORITE_ICON = "//span[contains(@class,'favorites')]";
    public static final String HEADER_SETTING_ICON = "//span[contains(@class,'settings')]";
    public static final String USER_NAME = "//div[contains(@class,'user-name')]";

    public static final String NOTIFICATION_MESSAGE_ROOT = "//div[contains(@class,'notifications-popup-ui-component')]";

    public static final String FAVORITE_LIST_ROOT = "//div[contains(@class,'popup-container-ui-small')]//div[@class='list']";

    public static final String SETTING_USER_PREF_ROOT = "//div[@class='preferences tab']";
    public static final String SETTING_USER_PREF_SHOW_ICON = SETTING_USER_PREF_ROOT + "//span[contains(@class, 'icon-show')]";
    public static final String SETTING_USER_PREF_HIDE_ICON = SETTING_USER_PREF_ROOT + "//span[contains(@class, 'icon-hide')]";

    public static final String USER_PREF_CODING_AND_PRODUCTION_ITEM = SETTING_USER_PREF_ROOT + "//div[contains(@class,'') and text()='Coding & Production']";

    public static final String USER_PREF_CODING_AND_PRODUCTION_ROOT = SETTING_USER_PREF_ROOT + "//div[@class='popup-container-ui-small top-offsets']";

    public static final String FILTER_SETTINGS_EDIT = "//span[@class='icon icon-settings js-edit']";

    //login page locators
    public static final String SCREEN_NAME_INPUT_FIELD = "//input[@id='_58_login']";

    public static final String PASSWORD_INPUT_FIELD = "//input[@id='_58_password']";

    public static final String REMEMBER_ME_CHECKBOX = "//input[@id='_58_rememberMeCheckbox']";

    public static final String SIGN_IN_BUTTON = "//button[contains(@class,'btn-primary')]";

    public static final String USER_DROPDOWN_BUTTON = "//a[contains(@class,'user-avatar-link')]";

    public static final String USER_SIGNOUT_BUTTON = "//li[contains(@class,'sign-out')]/a";
}
