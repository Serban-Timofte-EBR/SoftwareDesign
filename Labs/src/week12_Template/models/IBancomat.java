package ro.dp.sub11;

public interface IBancomat {
	int getNrBancnote(ValBancnota valoareBancnota);
	void alimentare(ValBancnota valoareBancnota, int cantitate);
}
