public class BelajarSet{

    public static void main(String[] args){
        java.util.Set<String> daftarEmails = new java.util.HashSet<String>();

        daftarEmails.add("andikaariana2@gmail.com");
        System.out.println("Jumlah email setalah add ke 1: "+ daftarEmails.size());

        daftarEmails.add("andikaariana2@gmail.com");
        System.out.println("Jumlah email setelah add ke 2: "+ daftarEmails.size());

        daftarEmails.add("andikaariana2@gmail.com");
        System.out.println("Jumlah email setelah add ke 3: "+ daftarEmails.size());
    }
}
