public class ElectricShop{

static int getMoneySpent(int[] keyboards, int[] drives, int b){
        /*
         * Write your code here.
         */
        int maxValue = -1;
        int sum = 0;

        for(int i = 0; i<keyboards.length; i++){
            for(int j = 0; j<drives.length; j++){

                sum = keyboards[i]+drives[j];

                if(sum > maxValue && sum <= b){
                    maxValue = sum;
                }
            }
        }

        return maxValue;
    }

public static void main(String[] args) {
  int[] keyboards = {3,1};
  int[] drives = {5,2,8};
  int b = 10;
  int mostExp = getMoneySpent(keyboards,drives,b);

  System.out.println("Most Expensive Option: " +mostExp);
}


}
