package com.waisblut.parkingmanager.model;

public class CarBrand
{
    //region variables
    private long id_brand;
    private String name;
    //endregion

    //region constructors
    public CarBrand()
    {}

    public CarBrand(String name)
    {
        //this.id_brand = id;
        this.name = name.toUpperCase();
    }
    //endregion

    //region accessor methods
    public long getId_brand()
    {
        return id_brand;
    }

    public void setId_brand(long id_brand)
    {
        this.id_brand = id_brand;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    //endregion
}
