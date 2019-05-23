package ro.cni.javabasicmetrosystems.live.day3.enums;

public enum Day2 {
    MONDAY(0, false){
        @Override
        public int getDayOfWeek() {
            return -1;
        }
    },
    TUESDAY(1, false),
    FRIDAY(3, false),
    FUNDAY(5, false);

    private int dayOfWeek;
    private boolean workday;

    Day2(int dayOfWeek, boolean workday) {
        this.dayOfWeek = dayOfWeek;
        this.workday = workday;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public boolean isWorkday() {
        return workday;
    }
}
