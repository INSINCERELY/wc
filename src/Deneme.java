import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
public class Deneme {
    public static void main(String[] args)throws java.io.IOException {
        BufferedReader br = null;
        int lines = 0;
        int count;
        String st;
        String all = null;
        try{
        if(args[0].equals("wc")) {
            if(((args[1].equals("--c"))&&(args[2].equals("--l")))||((args[1].equals("--l"))&&(args[2].equals("--c")))){
            try {
                File file = new File(args[3]);
                br = new BufferedReader(new FileReader(file));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("enter valid parameters");
            }
            while ((st = br.readLine()) != null) {
                all = all + st;
                lines++;
            }
            count = all.length();
            System.out.print("number of characters:"+(count-4)+"  number of lines:"+lines);
        }else if(args[1].equals("--c")){
            try {
                File file = new File(args[2]);
                br = new BufferedReader(new FileReader(file));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("enter valid parameters");
            }
            while ((st = br.readLine()) != null) {
                all = all + st;
            }
            count = all.length();
            System.out.print("number of characters:"+(count-4));
        }else if(args[1].equals("--l")){
            try {
                File file = new File(args[2]);
                br = new BufferedReader(new FileReader(file));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("enter valid parameters");
            }
            while ((st = br.readLine()) != null) {
                all = all + st;
                lines++;
            }
            System.out.print("number of lines:"+lines);
        }
        else{
            try{
                try {
                    File file = new File(args[1]);
                    br = new BufferedReader(new FileReader(file));
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("enter valid parameters");
                }
                while ((st = br.readLine()) != null) {
                    all = all + st;
                    lines++;
                }
                count = all.length();
                System.out.print("number of characters:"+(count-4)+"  number of lines:"+lines);
            }
            catch(FileNotFoundException r){
                System.out.println("The file does not exist.");
            }
        }
           } else
            System.out.println("try again");
         }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("try again");
        }
    }
}
