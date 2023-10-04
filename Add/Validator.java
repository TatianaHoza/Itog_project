package Add;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import Exceptions.*;

public class Validator {

    public void validate (String [] data){

        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        for (int i=0; i < data.length; i++){
            try{
                if (i==0)
                    isValidName(data[i]);
                if (i==1)