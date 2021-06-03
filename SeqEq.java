import java.util.ArrayList;
public class SeqEq{

  public static void main(String args[]){
    //Testing first test case
    ArrayList<Integer> p = new ArrayList<Integer>(5);
    p.add(5);
    p.add(2);
    p.add(1);
    p.add(3);
    p.add(4);

    for (Integer value : p) {
      System.out.print(value);
      System.out.print(" ");
    }
    System.out.println();

    ArrayList<Integer> indexList = permutationEquation(p);

    for (Integer value : indexList) {
      System.out.print(value);
      System.out.print(" ");
    }
    System.out.println();
  }

  public static ArrayList<Integer> permutationEquation(ArrayList<Integer> p) {
    // Write your code here
   ArrayList<Integer> indexList = new ArrayList<Integer>();
    int num = 0;
    int z = 0;
    int y = 0;
    int x = 0;

        for(int i = 0; i<p.size(); i++){
           num = p.get(i);
           z =  p.indexOf(num);
           y = (p.indexOf(z+1))+1;
           x = (p.indexOf(y))+1;
           indexList.add(x);

        }

        return indexList;
    }

}
