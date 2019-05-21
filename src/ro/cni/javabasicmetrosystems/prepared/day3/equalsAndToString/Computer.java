package ro.cni.javabasicmetrosystems.prepared.day3.equalsAndToString;

import java.util.Objects;

public class Computer {
    private String processor;
    private String harddisk;
    private String RAM;
    private String graphicsCard;

    public Computer(){}

    public Computer(final String processor, final String harddisk, final String RAM, final String graphicsCard) {
        this.processor = processor;
        this.harddisk = harddisk;
        this.RAM = RAM;
        this.graphicsCard = graphicsCard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(final String processor) {
        this.processor = processor;
    }

    public String getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(final String harddisk) {
        this.harddisk = harddisk;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(final String RAM) {
        this.RAM = RAM;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(final String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Computer computer = (Computer) o;
        return Objects.equals(processor, computer.processor) &&
                Objects.equals(harddisk, computer.harddisk) &&
                Objects.equals(RAM, computer.RAM) &&
                Objects.equals(graphicsCard, computer.graphicsCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, harddisk, RAM, graphicsCard);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", harddisk='" + harddisk + '\'' +
                ", RAM='" + RAM + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}
