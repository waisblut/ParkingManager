package com.waisblut.parkingmanager.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;

import com.waisblut.parkingmanager.model.CarBrand;
import com.waisblut.parkingmanager.util.Logger;

import java.util.ArrayList;
import java.util.List;

public class DSCarBrand
        extends MyDataSource
{

    public static final String TABLE_NAME = "CAR_BRAND";
    //region table fields
    public static final String ID = "_id";
    public static final String NAME = "brand_name";
    //endregion

    //region constructors
    public DSCarBrand()
    {
        super();

        setIni();
    }

    public DSCarBrand(Context context)
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
        super.setColumn(NAME, EnumDataTypes.TEXT, "NOT NULL UNIQUE");
        //endregion
    }

    public CarBrand create(CarBrand c)// throws SQLException
    {
        ContentValues values = new ContentValues();

        values.put(columns.get(1), c.getName());

        try
        {
            open();

            c.setId_brand(database.insertOrThrow(tableName, null, values));
            Logger.log('i', tableName + ": " + " Row inserted with ID=" + c.getId_brand());
        }
        catch (SQLException ex)
        {
            Logger.log('e', tableName + " ERROR - " + ex.getMessage());
            c = null;
        }

        return c;
    }

    public CarBrand getCarBrand(long id)
    {
        Cursor c = super.getItem(id, ID);

        CarBrand cb = null;

        if (c.getCount() > 0)
        {
            cb = new CarBrand();
            cb.setId_brand(c.getLong(c.getColumnIndex(ID)));
            cb.setName(c.getString(c.getColumnIndex(NAME)));
        }

        return cb;
    }

    public List<CarBrand> getAllCarBrand()
    {
        List<CarBrand> lst = new ArrayList<>();
        Cursor c = super.getAll();
        CarBrand cb = new CarBrand();

        c.moveToFirst();

        while (!c.isAfterLast())
        {
            cb.setId_brand(c.getLong(c.getColumnIndex(ID)));
            cb.setName(c.getString(c.getColumnIndex(NAME)));
            lst.add(cb);

            c.moveToNext();
        }

        return lst;
    }

    public boolean carBrandExists(long id)
    {
        boolean exists = super.idExists(id, ID);

        return exists;
    }
}
