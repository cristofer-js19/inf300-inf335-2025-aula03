package br.unicamp.ic.inf335;

import java.util.ArrayList;
import java.util.Collections;

import br.unicamp.ic.inf335.beans.ProdutoBean;

public class Brecho {

    private static final ArrayList<ProdutoBean> produtos = new ArrayList<>();

    public static void main(String[] args) {
        produtos.add(new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1250.0,"Poucos riscos, bom estado de conservacao."));
        produtos.add(new ProdutoBean("CD00002","iPhone 11", "256 Gb, Preto, sem Carregador",4000.0,"Sem riscos, pouco usado."));
        produtos.add(new ProdutoBean("CD00003","Xaomi 7", "64 Gb, Branco, com Carregador",1000.0,"Muitos riscos, bastante desgastado."));
        produtos.add(new ProdutoBean("CD00004","Notebook Sony Vaio 10", "16 Gb, Prata, com Carregador",1500.0,"Razoável estado de conservação."));
        produtos.add(new ProdutoBean("CD00005","Notebook Acer 3", "4 Gb, Preto, com Carregador",750.0,"Bem antigo, porém conservado."));
        produtos.add(new ProdutoBean("CD00006","Notebook Hp Compaq", "8 Gb, Prata, com Carregador",500.0,"Bem antigo, estado médio de conservação."));

        // Imprime produtos
        produtos.forEach(p -> System.out.println("Codigo = " + p.getCodigo() + "; Nome = " + p.getNome() + "; Valor = " + p.getValor()));

        // Ordena produtos
        Collections.sort(produtos);

        // Imprime produtos ordenados
        System.out.println("-------------------- Produtos Ordenados -------------------");
        produtos.forEach(p -> System.out.println("Codigo = " + p.getCodigo() + "; Nome = " + p.getNome() + "; Valor = " + p.getValor()));

        // Calcula Media
        System.out.println("Media de Valores = " + produtos.stream().mapToDouble(ProdutoBean::getValor).average());
    }
}
