import java.io.*;
import java.util.*;

public class cd3 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();
        ArrayList<ArrayList<Object>> Congress = new ArrayList<ArrayList<Object>>();
        Object[][] constituencies = new Object[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if(j==2)
                    constituencies[i][j] = sc.next();
                else
                    constituencies[i][j] = sc.nextInt();
                if (j == 2) {
                    if (constituencies[i][j].equals("C")) {
                        ArrayList<Object> onecongress = new ArrayList<>();
                        onecongress.add((Integer)constituencies[i][0]);
                        onecongress.add((Integer)constituencies[i][1]);
                        Congress.add(onecongress);
                    }
                }
            }

        }
        ArrayList<ArrayList<Object>> totalCongress = new ArrayList<ArrayList<Object>>();
        ArrayList<Integer> sum = new ArrayList<Integer>();
        if (Congress.size() == 0) {
            System.out.println(0);
            System.out.println(0);
        } else if (Congress.size() == 1) {
            System.out.println(1);
            System.out.println(0);
        }

        else
        {
            int x=0,y=0;
            for (int i = 0; i < Congress.size() - 1; i++) {
                for (int j = i + 1; j < Congress.size(); j++)
                {
                    ArrayList<Object> temp = new ArrayList<Object>(Congress.get(i));
                    ArrayList<Object> temp1 = new ArrayList<Object>(Congress.get(j));
                    ArrayList<Object> onexy = new ArrayList<Object>();
                    if(temp1.get(0).equals(temp.get(0))|| temp1.get(1).equals(temp.get(1)))
                    {

                    }

                    else {
                        x = (Integer) temp1.get(0) - (Integer) temp.get(0);
                        y =  (Integer) temp1.get(1) - (Integer) temp.get(1);


                        onexy.add(x);
                        onexy.add(y);
                    }

                    Integer s = x+y;
                    sum.add(s);
                    totalCongress.add(onexy);


                }
            }
            if(sum.size()<1)
            {
                System.out.println(Congress.size());
                System.out.println(0);
            }
            else {
                Integer result = Collections.max(sum);
                // System.out.println(sum);
                System.out.println(Congress.size());
                System.out.println(result);
            }
        }

    }


}




