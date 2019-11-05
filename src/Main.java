
public class Main {

	public static void main(String[] args) {
		Emas emas = new Emas();
        emas.setNama("Hendi");
        emas.setBeratEmas(15.7);
        emas.setHargaEmas(570000);
        emas.tampilPembedli(emas.totalHarga(emas.getHargaEmas()));

	}

}
