package cars.brand.service.specification;

import cars.brand.model.Vehicle;

public interface CatalogueService {

    /**
     * Shows the current catalog
     */
    void showCatalogue();

    /**
     * Shows the current catalog sorted by Type and by Brand.
     */
    void showSortedCatalogue();

    /**
     *  Shows the current catalog sorted by Type.
     */
    void showCatalogueSortByType();

    /**
     *  Shows the current catalog sorted by Brand.
     */
    void showCatalogueSortByBrand();

    /**
     * Creates new Electric car from user.
     *
     * @return new Electric car object
     */
    Vehicle createElectricCar();

    /**
     * Creates new Gas car from user.
     *
     * @return new Gas car object
     */
    Vehicle createGasCar();

    /**
     * Creates new Hybrid car from user.
     *
     * @return new Hybrid car object
     */
    Vehicle createHybridCar();

}
