public class Main {
    public static void main(String[] args) {
        AgacYapisi agacYapisi = new AgacYapisi();
        agacYapisi.root =agacYapisi.ekleme(agacYapisi.root,10);
        agacYapisi.root =agacYapisi.ekleme(agacYapisi.root,5);
        agacYapisi.root =agacYapisi.ekleme(agacYapisi.root,15);
        agacYapisi.root =agacYapisi.ekleme(agacYapisi.root,20);
        agacYapisi.root =agacYapisi.ekleme(agacYapisi.root,4);
        agacYapisi.root =agacYapisi.ekleme(agacYapisi.root,8);
        agacYapisi.root =agacYapisi.ekleme(agacYapisi.root,12);
        System.out.println(agacYapisi.root.sayi);
        System.out.println(agacYapisi.root.left.sayi);
        System.out.println("*****************");
        agacYapisi.inOrder(agacYapisi.root);
       agacYapisi.root = agacYapisi.silme(agacYapisi.root,10);
        System.out.println("\nSilmeden sonra");
        agacYapisi.inOrder(agacYapisi.root);
        System.out.println("\nYeni kök : "+agacYapisi.root.sayi);







    }
}