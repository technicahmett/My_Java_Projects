package to_square_brackets;

import java.util.Scanner;

public class ToSquareBrackets {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.print("Bir kelime girin :");
        String word=scanner.nextLine();


        word=word.toUpperCase();
        String[] arrayWord =word.split("");

       // System.out.println(Arrays.toString(arrayWord));

        for (String each : arrayWord) {
            //System.out.println(each);

            String result="";
            if (!each.equals(" ")){
                   result =result+"["+each+"] ";
            }else            {
                result=result+"  ";
            }

            System.out.print(result);
        }

    }
}
