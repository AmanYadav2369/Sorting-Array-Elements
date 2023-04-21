/* wajp to Sort an array elements  */

import java.util.*;
class Array
{
public static void main(String args[])
{
int num[]={45,33,66,15,99};

for(int j=0; j<num.length; j++){
System.out.print(num[j]+" ");
}
System.out.println();
Arrays.sort(num);
for(int i=0; i<num.length; i++){
System.out.print(num[i]+" ");
}

}
}