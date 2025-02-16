
import java.util.Arrays;
import java.util.HashSet;

public class AssignElementsToGroups {
    public int[] assignElements(int[] groups, int[] elements) {
        HashSet<Integer> set = new HashSet<>(); 
        int[] copyGroups = groups;

        for (int j = 0; j < elements.length; j++) {
            copyGroups = groups;

            for (int i = 0; i < groups.length; i++) {
                if (!set.contains(i)) {
                    if (copyGroups[i] % elements[j] == 0) {
                        groups[i] = j;
                        set.add(i);
                    } else {
                        if (j == elements.length - 1) {
                            groups[i] = -1;
                        }
                    }
                }
            }

        }
        return groups;
    }

    public static void main(String[] args) {
        AssignElementsToGroups a = new AssignElementsToGroups();
        int[] groups = {10,21,30,41};
        int[] elements = {2,1};
        System.out.println(Arrays.toString(a.assignElements(groups, elements)));
    }
}
