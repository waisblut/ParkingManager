package com.waisblut.parkingmanager.data;

public enum EnumDataTypes
{
    TEXT("TEXT"),
    NUMERIC("NUMERIC"),
    INTEGER("INTEGER"),
    REAL("REAL"),
    BLOB("BLOB");

    protected String code;

    public String getCode()
    {
        return this.code;
    }

    EnumDataTypes(String s)
    {
        this.code = s;
    }
}
