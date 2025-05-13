class Filme {
    private String titulo;
    private int duracaoTotal;
    private int minutoAtual;
    private boolean emReproducao;
    private boolean pausado;

    public Filme(String titulo, int duracaoTotal) {
        this.titulo = titulo;
        this.duracaoTotal = duracaoTotal;
        this.minutoAtual = 0;
        this.emReproducao = false;
        this.pausado = false;
    }

    public void reproduzir() {
        if (minutoAtual < duracaoTotal) {
            emReproducao = true;
            pausado = false;
        }
    }

    public void pausar() {
        if (emReproducao) {
            pausado = true;
            emReproducao = false;
        }
    }

    public void avancar(int minutos) {
        if (emReproducao && minutoAtual + minutos <= duracaoTotal) {
            minutoAtual += minutos;
        } else if (emReproducao) {
            minutoAtual = duracaoTotal;
        }
    }

    public void voltar(int minutos) {
        if (emReproducao && minutoAtual - minutos >= 0) {
            minutoAtual -= minutos;
        } else if (emReproducao) {
            minutoAtual = 0;
        }
    }

    public void reiniciar() {
        minutoAtual = 0;
        emReproducao = false;
        pausado = true;
    }

    public int getMinutoAtual() {
        return minutoAtual;
    }
}
