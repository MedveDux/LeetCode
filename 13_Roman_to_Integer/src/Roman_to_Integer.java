public class Roman_to_Integer {
    public static void main(String[] args) {
        String s = "IX";
        System.out.print(romanToInt(s));
    }
    public static int romanToInt(String s) {
        char[] charArray =s.toCharArray();
        int res = 0, tmp = 0, tmp1 = 0;
        for(int i = 0; i < s.length(); i++){
            if ((i + 1 < s.length()) && ((tmp = transfer(charArray[i])) < (tmp1 = transfer(charArray[i + 1])))){
                res += tmp1 - tmp;
                i++;
            }else
                res += transfer(charArray[i]);
        }
        return (res);
    }

    public static int transfer(char symbol) {
        if (symbol == 'I')
            return (1);
        else if (symbol == 'V')
            return (5);
        else if (symbol == 'X')
            return (10);
        else if (symbol == 'L')
            return (50);
        else if (symbol == 'C')
            return (100);
        else if (symbol == 'D')
            return (500);
        else
            return (1000);
    }
}
////FIRST
//class Solution {
//    public int romanToInt(String s) {
//        char[] charArray =s.toCharArray();
//        int[] valueArray = new int[7];
//        valueArray[0] = 1;
//        valueArray[1] = 5;
//        valueArray[2] = 10;
//        valueArray[3] = 50;
//        valueArray[4] = 100;
//        valueArray[5] = 500;
//        valueArray[6] = 1000;
//        int res = 0, tmp = 0, tmp1 = 0;
//        for(int i = 0; i < s.length(); i++){
//            if ((i + 1 < s.length()) && ((tmp = transfer(charArray[i])) < (tmp1 = transfer(charArray[i + 1])))){
//                res += valueArray[tmp1] - valueArray[tmp];
//                i++;
//            }else
//                res += valueArray[transfer(charArray[i])];
//        }
//        return (res);
//    }
//
//    public static int transfer(char symbol) {
//        char[] symbolArray = new char[7];
//        symbolArray[0] = 'I';
//        symbolArray[1] = 'V';
//        symbolArray[2] = 'X';
//        symbolArray[3] = 'L';
//        symbolArray[4] = 'C';
//        symbolArray[5] = 'D';
//        symbolArray[6] = 'M';
//        int i;
//        for(i = 0; symbolArray[i] != symbol ;i++);
//        return (i);
//    }
//}