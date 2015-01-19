package com.waisblut.parkingmanager.model;

/**
 * Created by Eduardo on 11/01/2015.
 */
public class CarColor
{
    //region variables
    private long id_Color;
    private String colorName;
    //endregion

    //region constructors
    public CarColor(long id, String name)
    {
        this.id_Color = id;
        this.colorName = name;
    }
    //endregion

    //region accessor methods
    public long getId_Color()
    {
        return id_Color;
    }

    public void setId_Color(long id_Color)
    {
        this.id_Color = id_Color;
    }

    public String getColorName()
    {
        return colorName;
    }

    public void setColorName(String colorName)
    {
        this.colorName = colorName;
    }
    //endregion
}
