package com.waisblut.parkingmanager.model;

public class Car
{
    //region variables
    private long id_car;
    private long id_carType;
    //private long id_brand;
    private long id_carColor;
    private String plate;
    //endregion

    //region constructors
    public Car(long id, long id_carType, long id_carColor, String plate)
    {
        this.setId_car(id);
        this.setId_carType(id_carType);
        //this.setId_brand(id_brand);
        this.setId_carColor(id_carColor);
        this.setPlate(plate);
    }
    //endregion

    //region accessor methods
    public long getId_car()
    {
        return id_car;
    }

    public void setId_car(long id_car)
    {
        this.id_car = id_car;
    }

    public long getId_carType()
    {
        return id_carType;
    }

    public void setId_carType(long id_carType)
    {
        this.id_carType = id_carType;
    }

    //    public long getId_brand()
    //    {
    //        return id_brand;
    //    }
    //
    //    public void setId_brand(long id_brand)
    //    {
    //        this.id_brand = id_brand;
    //    }

    public long getId_carColor()
    {
        return id_carColor;
    }

    public void setId_carColor(long id_carColor)
    {
        this.id_carColor = id_carColor;
    }

    public String getPlate()
    {
        return plate;
    }

    public void setPlate(String plate)
    {
        this.plate = plate;
    }
    //endregion
}