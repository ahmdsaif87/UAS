import java.util.Random;
import java.util.ArrayList;

public class UASnomor3 {
    private static final int Total_Produksi = 20000;
    private static final int Jenis_Pensil = 6;
    private static final int Minimal_Produksi = 1000;
    private static final int Maksimal_Produksi = 5000;

    public static void main(String[] args) {
        ArrayList<Integer> PensilBiru = new ArrayList<>();
        ArrayList<Integer> PensilHijau = new ArrayList<>();
        ArrayList<Integer> PensilOranye = new ArrayList<>();
        ArrayList<Integer> PensilHitam = new ArrayList<>();
        ArrayList<Integer> PensilCoklat = new ArrayList<>();
        ArrayList<Integer> PensilUngu = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < Jenis_Pensil; i++) {
            int production = random.nextInt(Maksimal_Produksi - Minimal_Produksi + 1) + Minimal_Produksi;
            for (int j = 0; j < production; j++) {
                switch (i) {
                    case 0:
                        PensilBiru.add(1);
                        break;
                    case 1:
                        PensilHijau.add(2);
                        break;
                    case 2:
                        PensilOranye.add(3);
                        break;
                    case 3:
                        PensilHitam.add(4);
                        break;
                    case 4:
                        PensilCoklat.add(5);
                        break;
                    case 5:
                        PensilUngu.add(6);
                        break;
                }
            }
        }

        System.out.println("Total produksi dari Pensil Biru: " + PensilBiru.size());
        System.out.println("Total produksi dari Pensil Hijau: " + PensilHijau.size());
        System.out.println("Total produksi dari Pensil Oranye: " + PensilOranye.size());
        System.out.println("Total produksi dari Pensil Hitam: " + PensilHitam.size());
        System.out.println("Total produksi dari Pensil Coklat: " + PensilCoklat.size());
        System.out.println("Total produksi dari Pensil Ungu: " + PensilUngu.size());

        System.out.println("Maksimal produksi dari Pensil Biru: " + getMax(PensilBiru));
        System.out.println("Maksimal produksi dari Pensil Hijau: " + getMax(PensilHijau));
        System.out.println("Maksimal produksi dari Pensil Oranye: " + getMax(PensilOranye));
        System.out.println("Maksimal produksi dari Pensil Hitam: " + getMax(PensilHitam));
        System.out.println("Maksimal produksi dari Pensil Coklat: " + getMax(PensilCoklat));
        System.out.println("Maksimal produksi dari Pensil Ungu: " + getMax(PensilUngu));

        System.out.println("Minimal produksi dari Pensil Biru: " + getMin(PensilBiru));
        System.out.println("Minimal produksi dari Pensil Hijau: " + getMin(PensilHijau));
        System.out.println("Minimal produksi dari Pensil Oranye: " + getMin(PensilOranye));
        System.out.println("Minimal produksi dari Pensil Hitam: " + getMin(PensilHitam));
        System.out.println("Minimal produksi dari Pensil Coklat: " + getMin(PensilCoklat));
        System.out.println("Minimal produksi dari Pensil Ungu: " + getMin(PensilUngu));

    }

    public static int getMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static int getMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }
}