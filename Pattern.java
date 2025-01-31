public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <=n;i++){
            for(int j = 1; j <=n; j++){
                //condition for starts in the plus shape
                if(i==(n/2) + 1||j==(n/2)+ 1){
                    System.out.print("*");
                }
                //else print 'O' for hollow spaces
                else{
                    System.out.print("O");
                }
            }
        System.out.println();
        }
    } 
}
