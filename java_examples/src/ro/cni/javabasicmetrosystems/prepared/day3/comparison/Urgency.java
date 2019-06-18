package ro.cni.javabasicmetrosystems.prepared.day3.comparison;

import java.util.Objects;

public class Urgency implements Comparable{
    private long priority;
    private long subPriority;

    public Urgency(final long priority, final long subPriority) {
        this.priority = priority;
        this.subPriority = subPriority;
    }

    public long getPriority() {
        return priority;
    }

    public void setPriority(final long priority) {
        this.priority = priority;
    }

    public long getSubPriority() {
        return subPriority;
    }

    public void setSubPriority(final long subPriority) {
        this.subPriority = subPriority;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Urgency urgency = (Urgency) o;
        return priority == urgency.priority &&
                subPriority == urgency.subPriority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, subPriority);
    }

    @Override
    public String toString() {
        return "Urgency{" +
                "priority=" + priority +
                ", subPriority=" + subPriority +
                '}';
    }

    @Override
    public int compareTo(final Object o) {
        Urgency otherUrgency = (Urgency) o;

        if(otherUrgency.getPriority() < this.getPriority()) {
            return 1;
        } else if(otherUrgency.getPriority() > this.getPriority()) {
            return -1;
        } else {
            if(otherUrgency.getSubPriority() < this.getSubPriority()) {
                return 1;
            } else if(otherUrgency.getSubPriority() > this.getSubPriority()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
