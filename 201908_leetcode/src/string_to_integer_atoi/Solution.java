package string_to_integer_atoi;

public class Solution {
    public int myAtoi(String str) {
        if(str.equals("")){
            return 0;
        }
        long num=0;

        //System.out.println(1);

        int len = str.length() , i = 0 , j = 1 ;
        while (i<len){
            if (str.charAt(i)!=32){
                break;
            }
            i++;
        }


            if(isnum1(str.charAt(i))!=true){
                return 0;
            }


        boolean isnegative = false;
        if (str.charAt(i)=='-'){
            isnegative = true;
            i++;
        }



        while (i<len){
            if(isnum2(str.charAt(i))==true){
                int a = str.charAt(i)-'0';

                int b = j;
                //System.out.println(a+"*"+b+"="+a*b);
                //System.out.println(str.charAt(i));
                //System.out.println((str.charAt(i)*j));
                //System.out.println(j);
                //System.out.println(a*b);
                num += (a*b);
                j *= 10;
                i++;
                //System.out.println(num);
            }else{
                break;
            }
        }
        long result = 0;

        while(true)
        {
            long n=num%10;//取出最低位上的数字
//也可以直接打印出来System.out.println(n);但不好，也可以用一个数组存起来，也不好，都因为翻转后的前后的那个0的问题
            result=result*10+n;//依次的反转存储得到反转的数字
            num=num/10;//降位
            if(num==0)
            {
                break;
            }
        }
        num = result;
        if (num>2147483647){
            return 2147483647;
        }
        if (num<-2147483648){
            return -2147483648;
        }
        if (isnegative==true){
            num=0-num;
        }
        return (int)num;
    }
    public boolean isnum1(char c){
        if(c>='0'&&c<='9'||c=='-'){
            return true;
        }
        return false;
    }
    public boolean isnum2(char c){
        if (c>='0'&&c<='9'){
            return true;
        }
        return false;
    }

}
