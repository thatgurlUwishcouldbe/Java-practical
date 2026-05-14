package AirportSystem;

public class Hashtable {

    private int[] buffer;

    public Hashtable(int N) {
        buffer = new int[N];
        for (int i = 0; i < N; i++) {
            buffer[i] = -1;
        }
    }

    public void empty() {
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = -1;
        }
    }

    public static int hash(int a, int b, int N, int k) {
        // (a * k + b) % N
        return (a * k + b) % N;
    }

    public static int linearProbing(int a, int b, int N, int k, int i) {
        // (a * k + b) % N
        return (a * k + b + i) % N;
    }

    public static int quadraticProbing(int a, int b, int N, int k, int i) {
        // (a * k + b) % N
        return (a * k + b + i * i) % N;
    }

    public static int doubleHashing(int a, int b, int N, int q, int k, int i) {
        // (a * k + b) % N
        // g(k) = q - (k % q)
        return (a * k + b + i * (q - (k % q))) % N;
    }

    public boolean put(int k, int p) {
        if (buffer[p] == -1 || buffer[p] == -2) {
            buffer[p] = k;
            return true;
        } else {
            return false;
        }
    }

    public boolean probe(int k, int p) {
        if (buffer[p] == k) {
            return true;
        } else {
            return false;
        }
    }

    public boolean emptySlot(int p) {
        return (buffer[p] == -1);
    }

    public boolean defunctSlot(int p) {
        return (buffer[p] == -2);
    }

    public boolean remove(int k, int p) {
        if (probe(k, p)) {
            buffer[p] = -2;
            return true;
        } else {
            return false;
        }
    }
    // اضافه مني
    public void print() {
        for (int i = 0; i < buffer.length;i++) {
             if(!emptySlot(i) && !defunctSlot(i))
            System.out.printf("%3d %5d\n",i,buffer[i]);
        }
    }
}
