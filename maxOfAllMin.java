import java.util.*;

/// CREATE A WINDOW, AND
// the function is expected to return an integer
//accepts the follwoing parameters:
// integer_array harddiskace
// integer segmentLength [subarray len]
// ex; hardDiskSpace = [8,2,4]
// segmentLength = 2
// output = 2


public class maxOfAllMinSubArray {
    public static int maxOfAllMinSubArray(List<Integer> hardDiskSpace, int segmentLength) {

            int[] leftSmallerIndex = new int[hardDiskSpace.size()];
            int[] rightSmallerIndex = new int[hardDiskSpace.size()];

        Stack<Integer> stack = new Stack<>;
        for (int i = 0; i < hardDiskSpace.size(); i++) {
                leftSmallerIndex[i] = -1;
                rightSmallerIndex[i] = hardDiskSpace.size();
            }


        // traverse right
            for (int i = 0; i < hardDiskSpace.size(); i++) {
                while (!stack.empty() && hardDiskSpace.get(stack.peek()) >= hardDiskSpace.get(i)) {
                    stack.pop();
                }
                if (stack.empty()) {
                    leftSmallerIndex[i] = -1;
                } else {
                    leftSmallerIndex[i] = stack.peek();
                }
                stack.push(i);
            }

            // traverse left.
            stack = new Stack<>();
            for (int i=hardDiskSpace.size()-1; i>0; i--) {
                while (!stack.empty() && hardDiskSpace.get(stack.peek()) >= hardDiskSpace.get(i)) {
                    stack.pop();
                }
                if (stack.empty()) {
                    rightSmallerIndex[i] = hardDiskSpace.size();
                } else {
                    rightSmallerIndex[i] = stack.peek();
                }
                stack.push(i);
            }

          int ans[] = new int[hardDiskSpace.size()+1];
            for (int i = 0; i < hardDiskSpace.size(); i++) {
                int len = rightSmallerIndex[i] - leftSmallerIndex[i] - 1;
                ans[len] = Math.max(ans[len], hardDiskSpace.get(i));
            }
            for (int i = hardDiskSpace.size() - 1 ; i >= 1; i--) {
                ans[i] = Math.max(ans[i], ans[i+1]);
            }

            }
    }

