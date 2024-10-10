### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        +play()
        +pause()
        +stop()
    }

    class AparelhoTelefonico {
        +fazerChamada(String numero)
        +receberChamada()
        +finalizarChamada()
    }

    class NavegadorInternet {
        +abrirPagina(String url)
        +navegarPagina(String url)
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet

    class main {
    }

    main --> iPhone
    
```
