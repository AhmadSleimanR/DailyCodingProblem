package dcp107e;

/**
 *
 * @author lycan
 */
/** Good morning! Here's your coding interview problem for today.

This problem was asked by Microsoft.

Print the nodes in a binary tree level-wise. For example, the following should print 1, 2, 3, 4, 5.

  1
 / \
2   3
   / \
  4   5
**/
public class DCP107E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cNum = 2;
        int cPos = 0;
        final String spaces = " / \\";
        System.out.println("  1\n"+spaces);
        while(cNum <= 5){
            if(cNum % 2 == 0){
                for(int i = 0;i < cNum - 2;++i)
                    System.out.print(" ");
                System.out.print(""+cNum);
            }else{
                cPos = cPos + 2;
                System.out.println("   "+cNum);
                for(int i = 0;i< cPos;++i)
                    System.out.print(" ");
                if(cNum < 5)
                    System.out.println(spaces);
            }
            ++cNum;
        }
    }
}