package com.waisblut.parkingmanager.controller;

import android.app.Activity;
import android.database.SQLException;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

import com.waisblut.parkingmanager.R;
import com.waisblut.parkingmanager.data.DSCarBrand;
import com.waisblut.parkingmanager.model.Car;
import com.waisblut.parkingmanager.model.CarBrand;
import com.waisblut.parkingmanager.model.CarColor;
import com.waisblut.parkingmanager.model.CarType;
import com.waisblut.parkingmanager.util.Logger;

public class ActivityMain
        extends Activity
{
    private DSCarBrand dsCarBrand;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);


        dsCarBrand = new DSCarBrand(this);

        createTestMode();
    }

    //region create test
    private void createTestMode()
    {
        createCarBrand("Audi");
        createCarBrand("Volkswagen");
        createCarBrand("Chevrolet");
        createCarBrand("Opel");
        createCarBrand("Ferrari");
        createCarBrand("Hyundai");
        createCarType();
        //createCarColor("Prata");
        //createCarColor("Branco");
        //createCarColor("Preto");
        createCar();

        dsCarBrand.close();
    }

    private void createCarBrand(String name)
    {
        try
        {
            CarBrand b = new CarBrand(name);
            dsCarBrand.create(b);
            dsCarBrand.selectWholeTableOnLogCat();
        }
        catch(SQLException ex)
        {
            Logger.log('e', " ERROR - " + ex.getMessage());
        }
    }

    private void createCarType()
    {
        CarType c = new CarType(1l, "A3", 1l);
    }

    private void createCarColor()
    {
        CarColor c = new CarColor(1l, "CINZA");
    }

    private void createCar()
    {
        Car c = new Car(1l, 1l, 1l, "AAA-0000");
    }
    //endregion

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
