package com.waisblut.parkingmanager.data;

import android.content.Context;

public class DSCar
        extends MyDataSource
{

    public static final String TABLE_NAME = "CAR";
    //region table fields
    public static final String ID = "_id";
    public static final String ID_CAR_TYPE = "id_car_type";
    public static final String ID_CAR_COLOR = "id_car_color";
    public static final String PLATE = "plate";
    //endregion

    //region constructors
    public DSCar()
    {
        super();

        setIni();
    }

    public DSCar(Context context)
    {
        super(context);

        setIni();

        super.openHelper = new MyOpenHelper(context);
    }
    //endregion

    private void setIni()
    {
        super.tableName = TABLE_NAME;

        //region columns
        super.setColumn(ID, EnumDataTypes.INTEGER, "PRIMARY KEY AUTOINCREMENT");
        super.setColumn(ID_CAR_TYPE, EnumDataTypes.INTEGER, "NOT NULL");
        super.setColumn(ID_CAR_COLOR, EnumDataTypes.INTEGER, "NOT NULL");
        super.setColumn(PLATE, EnumDataTypes.TEXT, "UNIQUE NOT NULL");
        //endregion
    }
}
