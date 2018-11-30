package solver.crosssum;

import java.util.ArrayList;

import solver.util.HexaPredicate;
import solver.util.Permutation;

public class CrossSumSolver {

    /**
     * 
     * @param permuteList - contains the permutation list of 1 - 9
     * @param args the formatted like following: + * 156 + - 20 + * 146 - / 2 - / 4 + + 10
     * @return
     */
    public static Integer[] solve(String args) throws Exception {

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<ArrayList<Integer>> permuteList = new Permutation<Integer>().permute(nums);

        String[] numOps = args.split("\\s");
        boolean found = false;
        // get the predicate
        HexaPredicate<Integer, Character, Integer, Character, Integer, Integer> cp = CrossSumPredicate.crossPredicate();
        for (ArrayList<Integer> r : permuteList) {
            nums = r.toArray(new Integer[0]);
            int n0 = nums[0], n1 = nums[1], n2 = nums[2];
            int n3 = nums[3], n4 = nums[4], n5 = nums[5];
            int n6 = nums[6], n7 = nums[7], n8 = nums[8];

            // horizontal part
            char s0 = numOps[0].charAt(0), s1 = numOps[1].charAt(0);
            int h1 = Integer.parseInt(numOps[2]);
            char s3 = numOps[3].charAt(0), s4 = numOps[4].charAt(0);
            int h2 = Integer.parseInt(numOps[5]);
            char s6 = numOps[6].charAt(0), s7 = numOps[7].charAt(0);
            int h3 = Integer.parseInt(numOps[8]);

            // vertical part
            char s9 = numOps[9].charAt(0), s10 = numOps[10].charAt(0);
            int v1 = Integer.parseInt(numOps[11]);
            char s12 = numOps[12].charAt(0), s13 = numOps[13].charAt(0);
            int v2 = Integer.parseInt(numOps[14]);
            char s15 = numOps[15].charAt(0), s16 = numOps[16].charAt(0);
            int v3 = Integer.parseInt(numOps[17]);

            if (!cp.test(n0, s0, n1, s1, n2, h1))
                continue;
            if (!cp.test(n3, s3, n4, s4, n5, h2))
                continue;
            if (!cp.test(n6, s6, n7, s7, n8, h3))
                continue;
            if (!cp.test(n0, s9, n3, s10, n6, v1))
                continue;
            if (!cp.test(n1, s12, n4, s13, n7, v2))
                continue;
            if (!cp.test(n2, s15, n5, s16, n8, v3))
                continue;
            found = true;
            break;
        }
        return (found) ? nums : null;
    }

    public static void main(String[] args) {

        String ops = "+ * 30 + + 24 + * 21 + / 2 + / 11 + + 15";

        Integer[] solution;
        try {
            solution = solve(ops);
            if (solution != null) {
                for (int i = 0; i < 9; i++) {
                    System.out.print(solution[i] + " ");
                    if (i == 2 || i == 5)
                        System.out.println();
                }
            } else
                System.out.println("Not Solution");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
