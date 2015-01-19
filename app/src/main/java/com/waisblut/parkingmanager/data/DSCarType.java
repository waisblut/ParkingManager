package com.waisblut.parkingmanager.data;

import android.content.Context;

public class DSCarType
        extends MyDataSource
{

    public static final String TABLE_NAME = "CAR";
    //region table fields
    public static final String ID = "_id";
    public static final String NAME = "car_name";
    public static final String ID_BRAND = "id_brand";
    //endregion

    //region constructors
    public DSCarType()
    {
        super();

        setIni();
    }

    public DSCarType(Context context)
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
        super.setColumn(NAME, EnumDataTypes.TEXT, "UNIQUE NOT NULL");
        super.setColumn(ID_BRAND, EnumDataTypes.INTEGER, "");
        super.setTableConstraint(super.getForeignKeyString(ID_BRAND,
                                                           DSCarBrand.TABLE_NAME,
                                                           DSCarBrand.ID));
        //endregion
    }
}

