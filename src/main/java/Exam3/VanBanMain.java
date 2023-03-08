package Exam3;

public class VanBanMain {
    public static void main(String[] args) {
        VanBan vb = new VanBan("   Hello   world " +
                "Nguyeexn  Van   A");
        System.out.println(vb.stringCount());
        System.out.println(vb.formatString());
        System.out.println(vb.toUpperCase());
        System.out.println(vb.toLowerCase());
        System.out.println(vb.toCapitalize());

    }
}
