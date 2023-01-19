package kata5p2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MailListReader{
    private static final Pattern emailPattern = Pattern.compile("^[\\w-\\.].+@([\\w-]+\\.)+[\\w-]{2,4}$");
    static List<Mail> read(String fileName){
        List<Mail> result = new ArrayList<Mail>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while(true){
                String line = reader.readLine();
                if (line == null) break;
                if (isEmail(line))result.add(new Mail(line));
            }
        }catch(IOException exception){
        }
        return result;
    }

   private static boolean isEmail(String line){
        return emailPattern.matcher(line).matches();  
   }
}
