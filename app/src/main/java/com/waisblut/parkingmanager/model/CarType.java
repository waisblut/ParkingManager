package com.waisblut.parkingmanager.model;

public class CarType
{
    //region variables
    private long id_carType;
    private String name;
    private long id_brand;
    //endregion

    //region constructors
    public CarType(long id, String name, long id_brand)
    {
        this.id_carType = id;
        this.name = name;
        this.id_brand = id_brand;
    }
    //endregion

    //region accessor methods
    public long getId_carType()
    {
        return id_carType;
    }

    public void setId_carType(long id_carType)
    {
        this.id_carType = id_carType;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public long getId_brand()
    {
        return id_brand;
    }

    public void setId_brand(long id_brand)
    {
        this.id_brand = id_brand;
    }
    //endregion
}
