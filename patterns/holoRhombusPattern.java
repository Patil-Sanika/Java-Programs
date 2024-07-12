//--------------------holo Rombus pattern-----------//
   
   public class holoRhombusPattern{
        public static void main(String args[]){
            int n = 6;
            System.out.println("       ******");
            for(int i=1 ; i<=n ; i++){
              for(int j=1 ;j<=n-i+1;j++){
                System.out.print(" ");
              }
              System.out.print("*    *");
              System.out.println();
            }
            System.out.println("******");
        }
    } 

    /* 
                        ******
                       *    *
                      *    *
                     *    *
                    *    *
                   *    *
                  *    *
                 ******
    */ 