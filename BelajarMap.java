public class BelajarMap{

    public static void main(String[] args){
        java.util.Map<String, String> daftarBarang = new java.util.HashMap<String,String>();

        daftarBarang.put("001", "Product 001");

        daftarBarang.put("P102", "Product 002");

        System.out.println("Nilai 001 adalah "+ daftarBarang.get("001"));
    }
}