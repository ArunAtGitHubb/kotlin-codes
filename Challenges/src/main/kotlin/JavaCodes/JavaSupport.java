package JavaCodes;

import java.util.Arrays;

public class JavaSupport {
    public void storeABC(char[] charArray){
        System.out.println("Your array " + Arrays.toString(charArray));
        charArray[0] = 'a';
        charArray[1] = 'b';
        charArray[2] = 'c';
        System.out.println("Then " + Arrays.toString(charArray));
    }
}
