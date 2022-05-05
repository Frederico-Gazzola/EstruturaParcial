package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// método para inserir um elemento na lista.
	// a inserção deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		No aux = new No(dado);
		
		if (inicio != null) {
			No x = inicio;
			boolean check = false;
			
			do {
				if (dado > x.dado) {
					if (x == fim) {
						x.dir = aux;
						aux.esq = x;
						fim = aux;
						check = true;
					} 
					x = x.dir;
				} else {
					if (x != inicio) {
						x.esq.dir = aux;
					} else {
						inicio = aux;
					}
					x.esq = aux;
					aux.dir = x;
					check = true;
					
				}
			} while (!check);
		}
		else {
				inicio = aux;
				fim = aux;
		}
	}
	
	// método para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}
