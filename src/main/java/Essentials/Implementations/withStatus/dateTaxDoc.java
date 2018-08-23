package Essentials.Implementations.withStatus;

import Essentials.Specifications.requisitesWStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class dateTaxDoc extends requisitesWStatus {


    public dateTaxDoc (String value, boolean status){
        this.value=value;
        this.status=status;
    }

    public dateTaxDoc(boolean status, boolean isNull){
        this.value="0";
        this.isNull=isNull;
        this.status=status;
    }


    @Override
    public int control(){
        if (!this.status)
            return 0;
        if (isNull){
            this.value="0";
            return 0;
        }
        if (this.value.length() != 10)
            return 2;

        if (!isThisDateValid(this.value, "dd.MM.yyyy"))
            return 1;
        return 0;
    }

    public boolean isThisDateValid(String dateToValidate, String dateFromat){

        if(dateToValidate == null){
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
        sdf.setLenient(false);

        try {

            //if not valid, it will throw ParseException
            Date date = sdf.parse(dateToValidate);
            System.out.println(date);

        } catch (ParseException e) {

            e.printStackTrace();
            return false;
        }

        return true;
    }
}
