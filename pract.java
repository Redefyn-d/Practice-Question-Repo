import java.util.*;


//Palindrome

// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.next();
//         int i = 0;
//         int j = s1.length()-1;
//         boolean flg = true;
//         while (i < j){
//             char a = Character.toLowerCase(s1.charAt(i));
//             char b = Character.toLowerCase(s1.charAt(j));
//             if(a!=b){ 
//                 flg=false;
//                 break;
//             }
//             i++;
//             j--;
//         }
//         System.out.print((flg)?"Palindrome":"not a palindrome");
//     }
// }


//Cost of shirt 

// public class pract{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int flipcart = 0;
//         int snapdeal = 0;
//         int amazon = 0;
//         for (int i = 0;i<9;i++){
//             if(i<3){
//                 flipcart+=sc.nextInt();
//             }
//             else if(i>=3 && i<6){
//                 snapdeal+=sc.nextInt();
//             }
//             else{
//                 amazon+=sc.nextInt();
//             }
//         }
//         System.out.println("In Flipkart: Rs."+flipcart);
//         System.out.println("In Snapdeal: Rs."+snapdeal);
//         System.out.println("In Amazon: Rs."+amazon);
//         System.out.print(Math.min(flipcart,Math.min(amazon,snapdeal)));
//     }
// }


//calculate rent price 

// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int month = sc.nextInt();
//         int price = sc.nextInt();
//         int days = sc.nextInt();
//         if (month<=0 || month>12){
//             System.out.print("Invalid Input");
//             return;
//         }
//         if ((month< 4) || (month>=7 && month<11)){
//             System.out.print("Price is: "+ price*days);
//         }
//         else{
//             System.out.print("Price is: "+ (price+(price*0.2))*days);
//         }
//     }
// }

//Trendy Number -- Middle Digit of 3 digit number if divisible by 3 it is Trendy Number
// public class pract {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n>999||n<100){
//             System.out.print("Invalid Input");
//             return;
//         }
//         else{
//             int rem = ((n/10)%10)%3;
//             System.out.print( rem != 0 ? "Not A Trendy Number": "Trendy Number");
//         }
//     }
// }


//Fibonacci series

// public class pract{
//     public static void main (String[] main){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a =0;
//         int b = 1;
//         int c=a+b;
//         System.out.print("Months: ");
//         for (int i = 0;i<n;i++){
//             System.out.print(i+1+" ");
//         }
//         System.out.println();
//         System.out.print("Amoeba: "+a+" "+b+" ");
//         for (int i = 2;i<n;i++){
//             System.out.print(c);
//             a=b;
//             b=c;
//             c=a+b;
//             System.out.print(" ");
//         }
//     }
// }

//Pattern 0,2,8,14,....,34

// public class pract{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i =1;i<=n ;i++){
//             if (i % 2==0){
//                 System.out.print((i*i)-2+" ");
//             }
//             else{
//                 System.out.print((i*i)-1+" ");
//             }
//         }
//     }
// }

//Pattern square

// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println();
//         for (int i = 0 ; i<n;i++){
//             for (int j = 0;j<n;j++){
//                 if(i==0||i==n-1||j==0||j==n-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//Colatz Sequence 

// public class pract{

//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(n);
//         int i = 0;
//         while(n!=1){
//             if(n%2==0){
//                 n = n/2;
//                 System.out.println(n);
//             }
//             else{
//                 n = (3*n)+1;
//                 System.out.println(n);
//             }
//             i++;
//         }
//         System.out.print(i);
//     }
// }

//strong number 

// public class pract {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp = n;
//         int rem;
//         int sum = 0;
//         int prd;
//         while (temp!=0){
//             rem = temp%10;
//             prd = 1;
//             for (int i = 2;i<=rem;i++){
//                 prd *=i;                
//             }
//             sum+=prd;
//             temp/=10;
//         }
//         System.out.print(n==sum ? "Strong Number" : "Not a Strong Number");
//     }
// }


//kaprekar number

// public class pract{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int squaredNumber = n*n;
//         int temp = n;
//         int c =0;
//         while(temp!=0){
//             c+=1;
//             temp/=10;
//         }
//         int divNumb = 1;
//         for (int i = 0;i<c;i++){
//             divNumb*=10;
//         }
//         int left = squaredNumber%divNumb;
//         int right = squaredNumber/divNumb;
//         System.out.print((left+right) == n ? "Kaprekar Number" : "Not Kaprekar Number");
//     }
// }


//Prime Number

// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean flg = true;

//         for (int i = 2 ;i<n;i++){
//             if(n%i==0){
//                 flg = false;
//                 break;
//             }
//         }
//         System.out.print(flg ? "Prime Number" : "Not a Prime Number");
//     }
// }

// public class pract{
//     public static boolean primeNumber(int num){
//         if (num <=1){
//             return false;
//         }
//         for (int i = 2 ; i<num;i++){
//             if(num%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int ll = sc.nextInt();
//         int ul = sc.nextInt();
//         int[] intArr = new int[ul-ll-1];
//         int ci = 0;
//         for (int i = 0;i<=ul-ll-1;i++){
//             if(primeNumber(i)){
//                 intArr[ci] = i;
//                 ci++;
//             }
//         }
//     }
// }

// public class pract{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int[] arrPas = new int[n];
//         for(int i = 0 ;i<n;i++){
//             arrPas[i] = sc.nextInt();
//         }
//         int busCount = 1;
//         int busCapacity = m;
//         for (int i =0;i<n;i++){
//             if (arrPas[i]>busCapacity){
//                 busCount ++;
//                 busCapacity = m;
//             }
//             busCapacity-=arrPas[i];
//         }
//         System.out.print(busCount);
//     }
// }

// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int position = sc.nextInt();
//         int newValue = sc.nextInt();
//         arr[position-1] = newValue;
//         for(int i = 0;i<n;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


//Swap if pair 

// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String n = sc.next();
//         char[] strArray = n.toCharArray();
//         for (int i = 0; i<n.length()-1 ;i+=2){
//             char temp = strArray[i+1];
//             strArray[i+1] = strArray[i];
//             strArray[i]=temp;
//         }
//         System.out.print(String.valueOf(strArray));
//     }
// }


// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String[] strArray = str.split(" ");
//         for (int i = strArray.length-1;i>=0;i--){
//             System.out.print(strArray[i]+" ");
//         }
//     }
// }


// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         boolean flg = true;
//         for(int i = 0;i<str.length();i++){
//             char sy = str.charAt(i);
//             flg=true;
//             for (int j = 0;j<str.length();j++){
//                 if(sy == str.charAt(j) && i!=j){
//                     flg = false;
//                     break;
//                 }
//             }
//             if(flg){
//                 System.out.print(sy);
//                 return;
//             }
//         }
//     }
// }


// Anthakshari 

// public class pract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String[] strArray = str.split(" ");
//         for(int i = 0;i<=strArray.length;i++){
//             String word = strArray[i];
//             int len = word.length()-1;
//             String nxtWord = strArray[i+1];
//             if(nxtWord.equals("####")){
//                 System.out.print(word);
//                 return;
//             }
//             if (word.charAt(len)==nxtWord.charAt(0)){
//                 System.out.print(word+" ");
//             }
//             else{
//                 break;
//             }
//         }   
//     }
// }

//Enscapulation Example 

// public class pract{
//     public static void main(String[] args){
//     class Employee{
//         private String name = "Yonko";
//         private int age = 20;
//         public String getData(){
//             return("The name and age are:"+name+" "+age);
//         }
//     }
//         Scanner sc = new Scanner(System.in);
//         Employee empObj = new Employee();
//         System.out.print(empObj.getData());
//     }
// }


//Enscapulation Example 

// public class pract{
//     public static void main(String[] args){
//     class Employee{
//         private String book = "Yonko";
//         private String author = "Balak";
//         public String getData(){
//             return("The name and age are:"+book+" "+author);
//         }
//     }
//         Scanner sc = new Scanner(System.in);
//         Employee empObj = new Employee();
//         System.out.print(empObj.getData());
//     }
// }


// public class pract{
//     static public class studentMark{
//         private String name = "Yonko";
//         private int mark;
//         public studentMark(int recvMark){
//             if(recvMark>=0 && recvMark<=100){
//                 mark = recvMark;
//             }
//             else{
//                 System.out.print("Get the Mark Between 0 to 100");
//             }
//         }   
//         public String getData(){
//             return("The data is: "+name+" "+mark);
//         }

//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         studentMark stdObj = new studentMark(-17);
//         System.out.print(stdObj.getData());
//     }
// }

public class pract{
    static class Calculator{
        public int add(int a ,int b){
            return(a+b);
        }
        public double add(double a , double b){
            return(a+b);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculator calObj = new Calculator();
        System.out.println(calObj.add(1,2));
        System.out.print(calObj.add(1.0,2.0));
    }
}