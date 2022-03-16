public class BelajarList{

    public static void main(String[] args){
        java.util.List<String> daftarEmails = new java.util.ArrayList<String>();

        daftarEmails.add("andikaariana2@gmail.com");
        System.out.println("Email pertama: "+daftarEmails.get(0));

        daftarEmails.set(0, "andikaariana4@gmail.com");
        System.out.println("Email setelah diset: "+daftarEmails.get(0));

        daftarEmails.remove(0);
        System.out.println("Jumlah email: "+ daftarEmails.size());
    }
}