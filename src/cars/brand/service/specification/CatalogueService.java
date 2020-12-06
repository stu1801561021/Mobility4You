package cars.brand.service.specification;

import cars.brand.model.Vehicle;

public interface CatalogueService {

    /**
     * Shows the current catalog
     */
    void showCatalog();

    /**
     * Shows the current catalog sorted by Type and by Brand.
     */
    void showSortedCatalog();

    void showCatalogSortByType();

    void showCatalogSortByBrand();

    Vehicle createElectricCar();

    Vehicle createGasCar();

    Vehicle createHybridCar();

}
