package sk.kosickaacademic.simon.regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public boolean checkValue(String text){
        if(text==null || text.equalsIgnoreCase("")) return false;
        String pattern="^(([1-9][0-9]*|0)|(0[\\.,]|[1-9][0-9]*[\\.,])([1-9][0-9]|0[1-9]))$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if(m.matches()) return true;
        return false;
    }

    public void readFile(){
        try{
            BufferedReader read = new BufferedReader(new FileReader("resources/money.txt"));
            String line = read.readLine();
            while(line!=null){
                //int number = Integer.parseInt(line);
                System.out.println(line +" - " +checkValue(line));

                line = read.readLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
