public class GXG {
public static void main(String[]args){
System.out.println("反复乘法表");
for(int a=9;a>=1;a--){
for (int b=a;b<=a&&b>=1;b--){
System.out.print(a+"*"+b+"="+a*b+" ");
}
System.out.println();
}
}
}