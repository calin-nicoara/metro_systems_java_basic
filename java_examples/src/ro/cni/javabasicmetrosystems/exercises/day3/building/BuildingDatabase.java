package ro.cni.javabasicmetrosystems.exercises.day3.building;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

class BuildingDatabase {
    private final static String FILES_PATH = "/home/calin-nicoara/Projects/courses/java_courses/metro_systems_java_basic/files";

    public static void writeBuildingsToFile(Building[] buildings, String fileName) {
        final Path path = Paths.get(FILES_PATH, fileName);

        try(final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(
                new FileOutputStream(path.toString())))) {
            writeBuildings(buildings, objectOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeBuildings(final Building[] buildings,
                                       final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(buildings.length);
        for (Building building : buildings) {
            objectOutputStream.writeObject(building);
        }

        objectOutputStream.close();
    }

    public static Building[] getBuildingsFromFile(String fileName) {
        final Path path = Paths.get(FILES_PATH, fileName);
        try(final ObjectInputStream in = new ObjectInputStream(new
                BufferedInputStream(new FileInputStream(path.toString())))) {

            final int numberOfBuildings = in.readInt();
            Building[] buildings = new Building[numberOfBuildings];

            for(int i = 0; i < numberOfBuildings; i++) {
                buildings[i] = (Building) in.readObject();
            }

            return buildings;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
