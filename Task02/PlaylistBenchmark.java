import java.util.*;

public class PlaylistBenchmark {
    static volatile long sink;
    static long measure(Runnable r) { long t=System.nanoTime(); r.run(); return System.nanoTime()-t; }
    static void test(int n) {
        System.out.println("\\nPlaylist size: " + n);
        ArrayList<Integer> a = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();
        ArrayDeque<Integer> d = new ArrayDeque<>();
        for(int i=0;i<n;i++){a.add(i);l.add(i);d.addLast(i);}
        int reps=Math.max(100, 1000000/n);
        long t=measure(()->{for(int i=0;i<reps;i++)a.add(i);});
        System.out.printf("ArrayList add end: %.3f ms%n",t/1e6);
        t=measure(()->{for(int i=0;i<reps;i++)l.add(i);});
        System.out.printf("LinkedList add end: %.3f ms%n",t/1e6);
        t=measure(()->{for(int i=0;i<reps;i++)d.addLast(i);});
        System.out.printf("ArrayDeque add end: %.3f ms%n",t/1e6);
        int ops=Math.min(2000,n);
        t=measure(()->{for(int i=0;i<ops;i++)a.add(0,-i);});
        System.out.printf("ArrayList front insert (%d): %.3f ms%n",ops,t/1e6);
        t=measure(()->{for(int i=0;i<ops;i++)l.add(0,-i);});
        System.out.printf("LinkedList front insert (%d): %.3f ms%n",ops,t/1e6);
        t=measure(()->{for(int i=0;i<ops;i++)d.addFirst(-i);});
        System.out.printf("ArrayDeque front insert (%d): %.3f ms%n",ops,t/1e6);
        long sum=0; t=measure(()->{long s=0;for(int i=0;i<ops;i++)s+=a.get(i%n);sink=s;});
        System.out.printf("ArrayList indexed access: %.3f ms%n",t/1e6);
        t=measure(()->{long s=0;for(int i=0;i<ops;i++)s+=l.get(i%n);sink=s;});
        System.out.printf("LinkedList indexed access: %.3f ms%n",t/1e6);
        t=measure(()->{long s=0;for(Integer x:a)s+=x;sink=s;});
        System.out.printf("ArrayList full iteration: %.3f ms%n",t/1e6);
        t=measure(()->{long s=0;for(Integer x:l)s+=x;sink=s;});
        System.out.printf("LinkedList full iteration: %.3f ms%n",t/1e6);
    }
    public static void main(String[] args){test(1000);test(10000);test(50000);}
}
