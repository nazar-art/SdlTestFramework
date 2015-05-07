package net.epam.domain.entities.definitions;

/**
 * Created by Yurii_Helesh on 26-Feb-15.
 */
public class SearchValue {

    public static Builder get() {
        return new Builder();
    }

    private SearchValue(Builder searchBuilder) {
        this.searchKeyword = searchBuilder.searchKeyword;
    }

    private final String searchKeyword;

    public String getSearchKeyword() {
        return searchKeyword;
    }


    public static class Builder {
        protected String searchKeyword;

        public Builder setSearchKeyword(String searchKeyword) {
            this.searchKeyword = searchKeyword;
            return this;
        }

        public SearchValue build() {
            return new SearchValue(this);
        }
    }
}
