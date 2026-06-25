public class EKOSPOJProblem {

    static boolean isValidAnswer(int[] treeHeights, int requiredWood, int cuttingHeight) {

        int totalWoodCollected = 0;

        for (int i = 0; i < treeHeights.length; i++) {

            if (treeHeights[i] > cuttingHeight) {

                int woodFromCurrentTree = treeHeights[i] - cuttingHeight;
                totalWoodCollected += woodFromCurrentTree;
            }
        }

        if (totalWoodCollected >= requiredWood) {
            return true;
        }

        return false;
    }

    public static int ekosspoj(int[] treeHeights, int requiredWood) {

        int start = 0;
        int maximumTreeHeight = -1;
        int answer = -1;

        for (int i = 0; i < treeHeights.length; i++) {
            if (treeHeights[i] > maximumTreeHeight) {
                maximumTreeHeight = treeHeights[i];
            }
        }

        int end = maximumTreeHeight;

        while (start <= end) {

            int cuttingHeight = start + (end - start) / 2;

            if (isValidAnswer(treeHeights, requiredWood, cuttingHeight)) {
                answer = cuttingHeight;
                start = cuttingHeight + 1;
            } else {
                end = cuttingHeight - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] treeHeights = {20, 15, 10, 17};
        int requiredWood = 7;

        int maximumCuttingHeight = ekosspoj(treeHeights, requiredWood);

        if (maximumCuttingHeight == -1) {
            System.out.println("No valid cutting height found.");
        } else {
            System.out.println("Maximum cutting height = " + maximumCuttingHeight);
        }
    }
}