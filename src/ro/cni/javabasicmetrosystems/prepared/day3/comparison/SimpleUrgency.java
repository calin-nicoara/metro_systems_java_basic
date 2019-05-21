package ro.cni.javabasicmetrosystems.prepared.day3.comparison;

import java.util.Objects;

public class SimpleUrgency
//        implements Comparable
{
    private long priority;

    public SimpleUrgency(final long priority) {
        this.priority = priority;
    }

    public long getPriority() {
        return priority;
    }

    public void setPriority(final long priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final SimpleUrgency that = (SimpleUrgency) o;
        return priority == that.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority);
    }

    @Override
    public String toString() {
        return "SimpleUrgency{" +
                "priority=" + priority +
                '}';
    }

//    @Override
//    /**
//     * If returned value is less than 0 then the order is [this, other]
//     * If returned value is 0 then they have the same order [order, this] or [this, order]
//     * If returned value is greater than 0 then the order is [order, this]
//     */
//    public int compareTo(final Object other) {
//        SimpleUrgency otherUrgency = (SimpleUrgency) other;
//        if(otherUrgency.getPriority() < this.getPriority()) {
//            return 1;
//        } else if(otherUrgency.getPriority() > this.getPriority()) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
}
