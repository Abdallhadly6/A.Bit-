
package a.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class ABit { 
   public static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        int count ;
        String data = "";
        int Final = 0;
        count = inp.nextInt();
        ArrayList<String> temp = new ArrayList<>();
        for(int i = 0 ; i < count ; i++){
            data = inp.next();
            temp.add(data);
        }
        for(int i = 0 ; i < temp.size() ; i++){
            if("++X".equals(temp.get(i)) || "X++".equals(temp.get(i))){
               Final+=1;
            }
            else{
                Final-=1;
            }
        }
        System.out.println(Final);        
    }
    
}