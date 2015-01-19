package com.waisblut.parkingmanager.data;

import java.util.LinkedHashMap;

public final class TableFactory
{
    public static LinkedHashMap<String, String> lstMyTables;

    public TableFactory()
    {
        lstMyTables = new LinkedHashMap<>();

        lstMyTables.put(DSCar.TABLE_NAME, createTable(new DSCar()));
        lstMyTables.put(DSCarBrand.TABLE_NAME, createTable(new DSCarBrand()));
        lstMyTables.put(DSCarColor.TABLE_NAME, createTable(new DSCarColor()));
        lstMyTables.put(DSCarType.TABLE_NAME, createTable(new DSCarType()));
    }

    private static String createTable(MyDataSource ds)
    {
        StringBuilder sb = new StringBuilder();

        sb.append("CREATE TABLE ");
        sb.append(ds.tableName);
        sb.append(" (\n");

        for (int i = 0; i < ds.columns.size(); i++)
        {
            String constraint = ds.columnsExtra.get(i) == null ? "" : ds.columnsExtra.get(i);
            sb.append(ds.columns.get(i))
              .append(" ")
              .append(ds.columnsType.get(i))
              .append(" ")
              .append(constraint)
              .append(", \n");
        }

        for (int i = 0; i < ds.columnsConst.size(); i++)
        {
            sb.append(ds.columnsConst.get(i)).append(", \n");
        }

        sb.replace(sb.lastIndexOf(","), sb.lastIndexOf(",") + 1, "");

        sb.append(") ");

        return sb.toString();
    }
}

