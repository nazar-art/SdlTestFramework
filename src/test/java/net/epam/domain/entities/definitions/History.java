package net.epam.domain.entities.definitions;

public class History {

    public static HistoryBuilder get() {
        return new HistoryBuilder();
    }

    private History(HistoryBuilder historyBuilder) {
        this.fromDate = historyBuilder.fromDate;
        this.toDate = historyBuilder.toDate;
    }

    private final String fromDate;
    private final String toDate;

    public String getFromDate() {
        return fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public static class HistoryBuilder {
        protected String fromDate;
        protected String toDate;

        public HistoryBuilder setFromDate(String fromDate) {
            this.fromDate = fromDate;
            return this;
        }

        public HistoryBuilder setToDate(String toDate) {
            this.toDate = toDate;
            return this;
        }

        public History build() {
            return new History(this);
        }
    }


}
