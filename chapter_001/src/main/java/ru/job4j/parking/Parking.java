package ru.job4j.parking;

/**
 * Describes behaviour of parking.
 *
 * @author Tolstonogov Alexey
 * @version 1.0
 */
public interface Parking {
    /**
     * Check whether the parking has free space for specified car.
     *
     * @param car car for parking
     * @return result of check
     */
    boolean hasSpace(Car car);

    /**
     * Check whether the specified car is on parking.
     *
     * @param lpn licence plate number of car
     */
    boolean hasCar(String lpn);

    /**
     * Adds specified car to parking.
     *
     * @param car car to add
     */
    void addCar(Car car);

    /**
     * Removes specified car from parking.
     *
     * @param lpn licence plate number of car to remove
     */
    void removeCar(String lpn);

    /**
     * Shows the last added car.
     *
     * @return last added car
     */
    Car lastAdded();
}
