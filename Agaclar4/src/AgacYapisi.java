public class AgacYapisi {
    public AgacYapisi() {
        root = null;
    }

    DugumSinifi root;
     DugumSinifi newDugum(int sayi){
         DugumSinifi eleman = new DugumSinifi();
         eleman.sayi =sayi;
         root =eleman;
         System.out.println(root.sayi +" Agac yapisina eklendi");
         return root;
     }
     DugumSinifi ekleme(DugumSinifi root,int sayi){
         if (root != null){
             if (root.sayi> sayi){
                 root.left = ekleme(root.left,sayi);
             }else {
                 root.right = ekleme(root.right,sayi);
             }
         }else {
             root = newDugum(sayi);
         }
         return root;
     }
    void inOrder(DugumSinifi root){
        if (root != null){
            inOrder(root.left);
            System.out.print(root.sayi + " ");
            inOrder(root.right);

        }
    }

     DugumSinifi silme(DugumSinifi root,int x){
         DugumSinifi temp1,temp2;
         if (root == null){
             return  null;
         }
         if (root.sayi == x){
             if (root.left == root.right){
                 //silinecek rootun sagında ve solunda birşey yok(yaprak)
                 root = null;
                 return null;
             } else if (root.left == null) {
                 temp1 = root.right;
                 return temp1;
             }else if (root.right == null) {
                 temp1 = root.left;
                 return temp1;
             }else {
                 temp1 = temp2 =root.right;
                 while (temp1.left != null){
                     temp1 = temp1.left;
                 }
                 temp1.left=root.left;
                 return temp2;
             }
         }else {
             if (x<root.sayi){
                 root.left = silme(root.left,x);
             }else {
                 root.right =silme(root.right,x);
             }
         }
         return  root;
     }




}
