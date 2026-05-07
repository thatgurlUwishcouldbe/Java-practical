
public class test {

    public static void main(String[] args) {
        BinaryTree<Integer> btr = new BinaryTree<Integer>();

        TNode<Integer> r = btr.addRoot(7);
        TNode<Integer> lc = btr.addLeft(r, 8);
        TNode<Integer> rc = btr.addRight(r, 9);
        btr.addLeft(lc, 10);
        btr.addRight(lc, 16);
        btr.addRight(rc, 20);
        TNode<Integer> rc2 = btr.addLeft(rc, 12);
        btr.addLeft(rc2, 33);

    }

    public int sum(TNode<Integer> p) {
        if (p == null) {
            return 0;
        }

        int L = sum(p.getLeft());
        int R = sum(p.getRight());

        return p.getItem() + L + R;

    }

    public int CountOccurrence(TNode<Integer> p, int ele) {

        if (p == null) {
            return 0;
        }

        int curr = (p.getItem() == ele) ? 1 : 0;

        int L = CountOccurrence(p.getLeft(), ele);
        int R = CountOccurrence(p.getRight(), ele);

        return curr + R + L;

    }

    public int leavelsNum(TNode<Integer> p) {
        if (p == null) {
            return 0;
        }

        int leaf = 0;
        if (p.getLeft() == null && p.getRight() == null) 
            leaf++;

        int L = leavelsNum(p.getLeft());
        int R = leavelsNum(p.getRight());
        
        return leaf + L + R;
    }
}
