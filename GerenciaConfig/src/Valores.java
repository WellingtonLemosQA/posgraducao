
import java.util.ArrayList;

public class Valores implements ValoresITF{
	
	public static ArrayList<Integer> lista = new ArrayList<Integer>();

	public boolean ins(int v) {
		if(size() < 10) {
			lista.add(v);
			return true;
		}
		return false;
	}

	public int del(int i) {
		lista.remove(i);	
		return lista.indexOf(i);
	}

	public int size() {
		int size = lista.size();
		return size;
	}
	
}
