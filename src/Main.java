import java.io.*;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {
        try {
            Scanner scanner = new Scanner(new File("INPUT.txt"));

            int n =scanner.nextInt();

            ArrayList<Integer> rating = new ArrayList<Integer>();
            ArrayList<Integer> sort_rating = new ArrayList<Integer>();

            while (scanner.hasNext()) {
                 rating.add(scanner.nextInt());
            }

            for(int i = 0; i < rating.size(); i++){
                if(rating.get(i)%2 == 0){
                    sort_rating.add(rating.get(i));
                    rating.remove(i);
                    i--;
                }
            }

            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("OUTPUT.txt"), "UTF-8"));
            for(int i = 0; i < rating.size(); i++){
                out.write(Integer.toString(rating.get(i))+" ");
            }
            out.write("\n");
            for(int i = 0; i < sort_rating.size(); i++){
                out.write(Integer.toString(sort_rating.get(i))+ ' ');
            }
            out.write("\n");
            if(rating.size() > sort_rating.size()){
                out.write("NO");
            }
            else
            {
                out.write("YES");
            }
            out.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
