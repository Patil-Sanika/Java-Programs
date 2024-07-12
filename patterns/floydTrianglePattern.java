//---------------------Floyd's Triangle Pattern-------------------//

public class floydTrianglePattern{
  public static void main(String args[]){
    char number = '1';
    int n = 3;

    for(int line=1;line<=n;line++){

      for(int j=1;j<=line;j++){
        System.out.print(number);
        number++;
      }
      System.out.println();

    }
  }
} 

/*           1
             23
             456
*/