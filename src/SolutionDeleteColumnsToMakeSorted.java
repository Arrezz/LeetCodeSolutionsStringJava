public class SolutionDeleteColumnsToMakeSorted {
    public SolutionDeleteColumnsToMakeSorted() {
        minDeletionSize(new String[]{"rrjk","furt", "guzm"});
    }

    public static void main(String[] args) {
        new SolutionDeleteColumnsToMakeSorted();
    }

    public int minDeletionSize(String[] strs) {
        int ans = 0;
        for(int j = 0; j < strs[0].length(); j++) {
            for(int i = 0; i < strs.length - 1; i++) {
                if (!(strs[i].charAt(j) <= strs[i + 1].charAt(j))) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
