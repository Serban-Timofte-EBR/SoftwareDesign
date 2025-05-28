package ro.dp.sub11;

import java.util.HashMap;
import java.util.Map;

public class Bancomat{
	private static Map<ValBancnota, Integer> cantitate;
	private static Bancomat instance=new Bancomat();
	
	public int getNrBancnote(ValBancnota valoareBancnota) {
		// TODO Auto-generated method stub
		return cantitate.get(valoareBancnota);
	}
	
	public void extragere(ValBancnota valoareBancnota, int nrBancnote) {
		if(nrBancnote>0) {
		if(cantitate.containsKey(valoareBancnota)) {
			if(cantitate.get(valoareBancnota)>=nrBancnote)
				cantitate.replace(valoareBancnota, cantitate.get(valoareBancnota)-nrBancnote);
		}
		}
	}


	public static void alimentare(ValBancnota valoareBancnota, int nrBancnote) {
		if(nrBancnote>0) {
		if(cantitate.containsKey(valoareBancnota)) {
		cantitate.replace(valoareBancnota, cantitate.get(valoareBancnota)+nrBancnote);
		} else {
			cantitate.put(valoareBancnota, nrBancnote);
		}
		}
	}
	
	private Bancomat() {
		cantitate = new HashMap<>();
	}
	
	public static Bancomat getInstance() {
		return instance;
	}

	public void afisareBancote() {
		for(ValBancnota valoare: cantitate.keySet()) {
			System.out.println("Valoare: "+valoare + " cantitate: "+cantitate.get(valoare));
		}
	}
}
