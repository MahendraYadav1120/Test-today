import java.util.*;
public class RemoveSpace {

     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();   
        char[] strArr = str.toCharArray();  
        StringBuffer st = new StringBuffer();  
        for (int i = 0; i < strArr.length; i++) 
            {  
            if ((strArr[i] != ' ')) 
            {  
                st.append(strArr[i]);  
            }  
            }  
        String Str2 = st.toString();  
        System.out.println("String is:: "+Str2);  
        
     }
}






















 // && (strArray[i] != '\t')) 