package com.waisblut.parkingmanager.data;

import android.content.Context;

/**
 * Created by Eduardo on 12/01/2015.
 */
public class DSCarColor
        extends MyDataSource
{

    public static final String TABLE_NAME = "CAR";
    //region table fields
    public static final String ID = "_id";
    public static final String COLOR = "color";
    //endregion

    //region constructors
    public DSCarColor()
    {
        super();

        setIni();
    }

    public DSCarColor(Context context)
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
        super.setColumn(COLOR, EnumDataTypes.TEXT, "NOT NULL");
        //endregion
    }
}

