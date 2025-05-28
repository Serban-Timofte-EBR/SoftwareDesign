package week12_Template.models;

public class Program {

	public static void main(String[] args) {
		Bancomat bancomat = Bancomat.getInstance();
		bancomat.alimentare(ValBancnota.B10, 100);
		bancomat.extragere(ValBancnota.B10, 110);
		bancomat.afisareBancote();
	}

}
