package br.digitalhouse.exercicioImpressora;

public class Main {
    public static void main(String[] args) {

        Contrato novoContrato = new Contrato("Venda", "Total");
        Foto novaFoto = new Foto("Selfie", "Preto e branco");
        Documento novoDoc = new Documento("Aviso", "Mural");

        Impressora novaImpressora = new Impressora();
        novaImpressora.adicionarImprimivel(novoContrato);
        novaImpressora.adicionarImprimivel(novaFoto);
        novaImpressora.adicionarImprimivel(novoDoc);
        novaImpressora.imprimirTudo();
    }
}
