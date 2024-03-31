public class Star_pattern {
    public static void main(String[] args){
        int i,j,row=4;

        for(i=0;i<row;i++){//for row

            for(j=0;j<=i;j++){ //for column
                System.out.print("* ");
            }
              System.out.println();//for next line
        }

    }
}
