/**
 *
 */
public class QuickFindUF {

    /**
     *
     */
    private int[] id;

    /**
     * @param N
     */
    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q) {
        return id[q] == id[p];
    }

    /**
     * @param q
     * @param p
     */
    public void union(int q, int p) {
        int pid = this.id[p];
        int qid = this.id[q];

        for (int i = 0; i < this.id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

}
