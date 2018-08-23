package Essentials.Implementations;

import Essentials.Specifications.reqs.requisitesWStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

    public class DatePayment  {
        public String value;

        public DatePayment (String value){
            this.value=value;

        }



        public int control(){
            if (this.value.length() != 10)
                return 2;

            if (!isThisDateValid(this.value, "dd.MM.yyyy"))
                return 1;
            return 0;
        }

        public boolean isThisDateValid(String dateToValidate, String dateFromat){
            if(dateToValidate == null)
                return false;

            SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
            sdf.setLenient(false);
            try {
                Date date = sdf.parse(dateToValidate);
            }
            catch (ParseException e) {
                return false;
            }

            return true;
        }


}
