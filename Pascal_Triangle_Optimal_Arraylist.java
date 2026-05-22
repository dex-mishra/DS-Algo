import java.util.*;

class Pascal_Triangle_Optimal_Arraylist {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        int x = 1;
        for (int i = 1; i <= rowIndex; i++) {
            result.add(x);
            x = x * (rowIndex- i) / i;
        }
        return result;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 1; i <= numRows; i++) 
        {
        result.add(getRow(i));
        }
        return result;
    }
    public static void main(String[] args) {
        Pascal_Triangle_Optimal_Arraylist s = new Pascal_Triangle_Optimal_Arraylist();
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Pascal Triangle till row :"+row+" \n"+s.generate(row));
    }
    }

