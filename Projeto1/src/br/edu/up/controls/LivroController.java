package br.edu.up.controls;

public class LivroController {
    private Livro model;
    private LivroView view;

    public LivroController(Livro model, LivroView view){
        this.model = model;
        this.view = view;
    }

    public void atualizarView(){
        view.exebirLivro(model.obterDadosFormatados(),"Livro");
    }
}
