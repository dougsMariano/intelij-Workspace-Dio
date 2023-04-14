package one.digitalinovation;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultomoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        primeiroNo = null;
        ultomoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index) {
        return  this.getNo(index).getConteudo();
    }


    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultomoNo);

        if(primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if(ultomoNo != null) {
            ultomoNo.setNoProximo(novoNo);
        }
        ultomoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento) {
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if(novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else {
            novoNo.setNoPrevio(ultomoNo);
            ultomoNo = novoNo;
        }

        if(index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }

        tamanhoLista++;

    }

    public void remove(int index) {
        if(index == 0) {
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null) {
                primeiroNo.setNoPrevio(null);
            }
        } else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultomoNo) {
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            } else {
                ultomoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public int size() {
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}] --->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRetorno += "null";

        return strRetorno;
    }
}
