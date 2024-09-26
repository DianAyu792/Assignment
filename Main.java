public class Main {
    public static void main(String[] args) {
        // Membuat objek Smartphone
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S23");
        smartphone.nyalakan();
        smartphone.kirimPesan("085656565656", "Halo");
        smartphone.kirimPesan("dianayu@gmail.com", "Perkenalant", "Saya Dian dari PT.indonesianArmy");
        smartphone.aksesInternet();

        // Membuat objek FeaturePhone
        FeaturePhone featurePhone = new FeaturePhone("Nokia", "1100");
        featurePhone.nyalakan();
        featurePhone.kirimPesan("0856565656", "Halo");
        featurePhone.mainGameSnake();
    }
}

abstract class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone menyala");
    }

    public void matikan() {
        System.out.println("Handphone mati");
    }

    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim pesan ke " + nomorTujuan + ": " + pesan);
    }
}

class Smartphone extends Handphone {
    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Smartphone mengirim pesan ke " + nomorTujuan + ": " + pesan);
    }

    public void kirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Smartphone mengirim email ke " + emailTujuan + " dengan subjek: " + subjek);
    }

    public void aksesInternet() {
        System.out.println("Akses internet");
    }
}

class FeaturePhone extends Handphone {
    public FeaturePhone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("FeaturePhone menyala");
    }

    @Override
    public void matikan() {
        System.out.println("FeaturePhone mati");
    }

    public void mainGameSnake() {
        System.out.println("Bermain game Snake");
    }
}